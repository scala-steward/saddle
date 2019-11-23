/**
  * Copyright (c) 2019 Saddle Development Team
  *
  * Licensed under the Apache License, Version 2.0 (the "License");
  * you may not use this file except in compliance with the License.
  * You may obtain a copy of the License at
  *
  *     http://www.apache.org/licenses/LICENSE-2.0
  *
  * Unless required by applicable law or agreed to in writing, software
  * distributed under the License is distributed on an "AS IS" BASIS,
  * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
  * See the License for the specific language governing permissions and
  * limitations under the License.
  */
package org.saddle.linalg

import org.saddle.Vec
import annotation.implicitNotFound

@implicitNotFound(msg = "${O} not found")
trait VecBinOp[O, Res] {
  def apply(a: Vec[Double], b: O): Res
}
class VecPimp(val self: Vec[Double]) {
  type B = Vec[Double]

  def linalg = this

  def vv(other: Vec[Double])(
      implicit op: VecBinOp[Vec[Double], Double]
  ): Double = op(self, other)

  /* Max. Does not filter out NAs*/
  def max2 = {
    var s = Double.MinValue
    var i = 0
    val n = self.length
    while (i < n) {
      val v = self.raw(i)
      if (v > s) {
        s = v
      }
      i += 1
    }
    s
  }

  /* Min. Does not filter out NAs*/
  def min2 = {
    var s = Double.MaxValue
    var i = 0
    val n = self.length
    while (i < n) {
      val v = self.raw(i)
      if (v < s) {
        s = v
      }
      i += 1
    }
    s
  }

  /* Sum. Does not filter out NAs*/
  def sum2 = {
    var s = 0d
    var i = 0
    val n = self.length
    while (i < n) {
      s += self.raw(i)
      i += 1
    }
    s
  }

  /* One pass mean using Welford's algorithm. Does not filter out NAs */
  def mean2 = {
    val n = self.length
    var xm = 0d
    var i = 0
    while (i < n) {
      val x = self.raw(i)
      xm += (x - xm) / (i + 1)
      i += 1
    }
    xm
  }

  /* One pass sample variance using Welford's algorithm. Does not filter out NAs */
  def sampleVariance = {
    val n = self.length
    var m = 0d
    var xm = 0d
    var i = 0
    while (i < n) {
      val x = self.raw(i)
      val tmp = xm
      xm += (x - xm) / (i + 1)
      m += (x - tmp) * (x - xm)
      i += 1
    }
    m / (n - 1)
  }

  def sampleStandardDeviation = math.sqrt(sampleVariance)

  /* Subtracts the mean from each element. Does not filter out NAs */
  def demeaned = {
    val mean = this.mean2
    val n = self.length
    val ar2 = Array.ofDim[Double](n)
    var i = 0
    while (i < n) {
      ar2(i) = self.raw(i) - mean
      i += 1
    }
    Vec(ar2)
  }

  /** One pass Pearson correlation coefficient. Does not filter out NAs.
    * https://prod-ng.sandia.gov/techlib-noauth/access-control.cgi/2008/086212.pdf
    */
  def pearson(other: Vec[Double]) = {
    val n = self.length
    assert(n == other.length)
    var covS = 0d
    var varS1 = 0d
    var varS2 = 0d
    var xm1 = 0d
    var xm2 = 0d
    var i = 0
    while (i < n) {
      val x1 = self.raw(i)
      val x2 = other.raw(i)
      val tmp1 = xm1
      val tmp2 = xm2
      xm1 += (x1 - xm1) / (i + 1)
      xm2 += (x2 - xm2) / (i + 1)
      covS += (x1 - tmp1) * (x2 - tmp2) * i / (i + 1)
      varS1 += (x1 - tmp1) * (x1 - xm1)
      varS2 += (x2 - tmp2) * (x2 - xm2)
      i += 1
    }
    covS / math.sqrt(varS1 * varS2)
  }

  /** One pass covariance of two vectors
    *
    * https://prod-ng.sandia.gov/techlib-noauth/access-control.cgi/2008/086212.pdf
    */
  def sampleCovariance(other: Vec[Double]) = {
    val n = self.length
    assert(n == other.length)
    var covS = 0d
    var xm1 = 0d
    var xm2 = 0d
    var i = 0
    while (i < n) {
      val x1 = self.raw(i)
      val x2 = other.raw(i)
      val tmp1 = xm1
      val tmp2 = xm2
      xm1 += (x1 - xm1) / (i + 1)
      xm2 += (x2 - xm2) / (i + 1)
      covS += (x1 - tmp1) * (x2 - tmp2) * i / (i + 1)
      i += 1
    }
    covS / (n - 1)
  }

}
