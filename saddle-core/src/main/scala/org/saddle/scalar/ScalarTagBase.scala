/** Copyright (c) 2013 Saddle Development Team
  *
  * Licensed under the Apache License, Version 2.0 (the "License"); you may not
  * use this file except in compliance with the License. You may obtain a copy
  * of the License at
  *
  * http://www.apache.org/licenses/LICENSE-2.0
  *
  * Unless required by applicable law or agreed to in writing, software
  * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
  * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
  * License for the specific language governing permissions and limitations
  * under the License.
  */
package org.saddle.scalar

import org.saddle.{ORD, CLM, NUM, Vec, Mat, Index}
import org.saddle.index.IndexAny
import org.saddle.locator.{LocatorAny, Locator}
import org.saddle.locatorall.{LocatorAllAny,LocatorAll}
import org.saddle.array.Sorter
import org.saddle.Buffer

private[saddle] trait ScalarTagBase[T] extends ScalarTag[T] {
  def clm: CLM[T]
  implicit private def clm_ : CLM[T] = clm

  def parse(s: Array[Char], from: Int, to: Int): T =
    throw new RuntimeException(
      "parsing arbitrary types during runtime is not implemented"
    )

  def compare(x: T, y: T)(implicit ev: ORD[T]): Int =
    if (x == null && y == null) 0
    else if (x == null) -1
    else if (y == null) +1
    else ev.compare(x, y)

  def toDouble(t: T)(implicit ev: NUM[T]) = ev.toDouble(t)

  def zero(implicit ev: NUM[T]) = ev.zero
  def one(implicit ev: NUM[T]) = ev.one
  def inf(implicit ev: NUM[T]) = sys.error("Infinities not supported")
  def negInf(implicit ev: NUM[T]) = sys.error("Infinities not supported")

  def show(v: T) = if (v == null) "NA" else v.toString

  override def runtimeClass = implicitly[CLM[T]].runtimeClass

  def makeBuf(sz: Int = org.saddle.Buffer.INIT_CAPACITY): Buffer[T] =
    Buffer.empty[T](sz)
  def makeLoc(sz: Int = Locator.INIT_CAPACITY): Locator[T] =
    new LocatorAny[T](sz)(this)
  def makeLocAll(sz: Int = Locator.INIT_CAPACITY): LocatorAll[T] =
    new LocatorAllAny[T]()(this)
  def makeVec(arr: Array[T]): Vec[T] = Vec(arr)(this)
  def makeMat(r: Int, c: Int, arr: Array[T]): Mat[T] = Mat(r, c, arr)(this)
  def makeIndex(vec: Vec[T])(implicit ord: ORD[T]): Index[T] =
    new IndexAny[T](vec)(this, ord)
  def makeSorter(implicit ord: ORD[T]): Sorter[T] = Sorter.anySorter[T]

}
