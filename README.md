[![Build status](https://github.com/pityka/saddle/workflows/CI/badge.svg)](https://github.com/pityka/saddle/actions)
[![codecov](https://codecov.io/gh/pityka/saddle/branch/master/graph/badge.svg)](https://codecov.io/gh/pityka/saddle)
[![doc](https://img.shields.io/badge/api-scaladoc-green)](https://pityka.github.io/saddle/api/org/saddle/Frame.html)
[![doc](https://img.shields.io/badge/docs-green)](https://pityka.github.io/saddle)
[![maven](https://img.shields.io/maven-central/v/io.github.pityka/saddle-core_2.13.svg)](https://repo1.maven.org/maven2/io/github/pityka/saddle-core_2.13/)


Saddle: Scala Data Library for JVM and Scala.js
===============================================

Introduction
============

Saddle is a data manipulation library for Scala that provides array-backed,
indexed, one- and two-dimensional data structures that are 
specialized on primitive types to avoid the overhead of boxing and unboxing.

Saddle offers numerical calculations, automatic alignment of data
along indices, robustness to missing (N/A) values, and facilities for I/O.

Features
========
- All of saddle's core data structures avoid boxing of primitive types thus maintaining optimal memory efficiency and cache locality.
- One- and two-dimensional vectors (`Vec[T]` and `Mat[T]`).
- Constant time lookup index supporting database-like inner and outer joins (`Index[T]`).
- Combined of index and vector types, both 1D (`Series[Key,Value]`) and 2D (`Frame[RowKey,ColumnKey,Value]`).
- Support for multilevel indexes, and data manipulations like pivots, joins, merges, group by-s, sorts.
- Convenient vectorized binary operations betweens the above data structures.
- Automatic, non-boxed handling of missing values.
- Native linear algebra backed by BLAS/LAPACK on amd64, aarch64 and Apple arm64. On linux needs a system wide installation of BLAS and LAPACK shared libraries.
- Getting data in and out of the library:
  - Extremely fast CSV, integer and floating point parsers doing minimal allocations and minimal branching. 
  - CSV writer.
  - Support for reading contigous numeric arrays from npy files.
  - Fast and memory efficient binary serialization format.
  - Circe and jsoniter-scala type classes.
- Published for Scala on the JVM and Scala.js, Scala 2.13 and 3.


Documentation
=============

 - [Docs](https://pityka.github.io/saddle)
 - [scaladoc](https://pityka.github.io/saddle/api/org/saddle/Frame.html)

How to build the code
=====================
You need [sbt](https://www.scala-sbt.org/): `sbt test`

How to build the website
========================
The website is built with [hugo](https://gohugo.io/) and the [hugo-book](https://github.com/alex-shpak/hugo-book) theme.

The theme is a git submodule. It must be initialized.

```sh
git submodule update --init
```

Create and serve the site with:

```sh
sbt docs/mdoc docs/unidoc && cd website && hugo
```

License
=======

Saddle is distributed under the Apache License Version 2.0 (see LICENSE file).

Copyright
=========

Copyright (c) 2013-2015 Novus Partners, Inc.

Copyright (c) 2013-2015 The Saddle Development Team

All rights reserved.

Saddle is subject to a shared copyright. Each contributor retains copyright to
his or her contributions to Saddle, and is free to annotate these contributions
via code repository commit messages. The copyright to the entirety of the code
base is shared among the Saddle Development Team, comprised of the developers
who have made such contributions.

The copyright and license of each file shall read as follows:

> Copyright (c) 2013-2015 Saddle Development Team
>
> Licensed under the Apache License, Version 2.0 (the "License");
> you may not use this file except in compliance with the License.
> You may obtain a copy of the License at
>
> http://www.apache.org/licenses/LICENSE-2.0
>
> Unless required by applicable law or agreed to in writing, software
> distributed under the License is distributed on an "AS IS" BASIS,
> WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
> See the License for the specific language governing permissions and
> limitations under the License.


Individual contributors may, if they so desire, append their names to
the CONTRIBUTORS file.

Code in saddle-core/src/main/scala/org/saddle/util/LongMap.scala has different copyright terms,
see its header.

Code in saddle-core/src/main/scala/org/saddle/Buffer.scala has different copyright terms,
see its header. 

Code in spire-prng has different copyright terms, see the spire-prng/COPYING.

Code in FastDoubleParser.scala is a translation of https://github.com/wrandelshofer/FastDoubleParser.
The original Java code is licensed as Copyright © 2022. Werner Randelshofer, Switzerland. MIT License.
The test data for FastDoubleParser.scala is licensed as Copyright © Nigel Tao, Apache License Version 2.0.

About the Copyright Holders
===========================

Adam Klein began Saddle development in 2012 while an employee of 
[Novus Partners, Inc](http://www.novus.com "Novus"). The code was 
released by Novus under this license in 2013. Adam Klein is lead 
developer. Saddle was inspired by earlier prototypes developed by 
Chris Lewis, Cheng Peng, & David Cru. Saddle was also inspired by 
previous work with [pandas](http://pandas.pydata.org/ "pandas"), a 
data analysis library written in Python. 

Code in the saddle-linalg/ folder is contributed by Istvan Bartha.

This repository is a fork of the original Saddle repository which has
seen no activity for some time.



