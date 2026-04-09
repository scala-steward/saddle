# CLAUDE.md

This file provides guidance to Claude Code (claude.ai/code) when working with code in this repository.

## Project Overview

Saddle is a Scala data manipulation library providing array-backed, indexed 1D/2D data structures specialized on primitive types (to avoid boxing). Published for JVM and Scala.js, Scala 2.13 and 3.

## Build Commands

```bash
# Build and test everything (cross-compiled: Scala 2.13 + 3.3)
sbt +test

# Test a specific subproject (JVM)
sbt coreJVM/test

# Run a specific test by name
sbt "coreJVM/testOnly *ClassName"

# Full CI suite (matches .github/workflows/ci.yml)
sbt -J-Xmx3000m clean +test docs/mdoc versionPolicyCheck docs/unidoc

# Format code
sbt scalafmt

# Generate documentation
sbt docs/mdoc
```

Build requires Java 8 (Temurin) and Node.js (for Scala.js tests).

## Module Structure

- **saddle-core** — Cross-compiled (JVM + JS). Core data structures: `Vec[T]`, `Mat[T]`, `Index[T]`, `Series[K,V]`, `Frame[RK,CK,V]`
- **saddle-core-jvm-test** — JVM-only tests (binary serialization)
- **saddle-ops-inlined** / **saddle-ops-inlined-macroimpl** — Macro-based inlined operations for performance
- **saddle-io** — Cross-compiled I/O (CSV, NPY readers/writers)
- **saddle-linalg** — Linear algebra via BLAS/LAPACK (JVM only)
- **saddle-stats** — Statistical functions (JVM only)
- **saddle-binary** — Binary serialization with ujson (JVM only)
- **saddle-circe** — Circe JSON codecs (cross-compiled)
- **saddle-jsoniter** — jsoniter-scala codecs (cross-compiled)
- **saddle-time** — Joda-Time date/time utilities (JVM only)
- **saddle-jmh** — JMH benchmarks (unpublished)
- **saddle-docs** — Unidoc + mdoc documentation

## Architecture

The core data model is layered:
- `Vec[T]` — 1D array-backed vector with type specialization and NA handling
- `Mat[T]` — 2D matrix (column-major storage via `MatCols`)
- `Index[T]` — Constant-time lookup index supporting joins, slices, and set operations
- `Series[Key, Value]` — Index + Vec (indexed 1D data)
- `Frame[RowKey, ColKey, Value]` — Row Index + Col Index + Mat (indexed 2D data)

Key packages in `org.saddle`:
- `scalar` — NA sentinel values and scalar type handling
- `locator` — Hash-based location finding for indexes
- `ops` — Vectorized binary operations with automatic index alignment
- `groupby` — Group-by operations on Series/Frame
- `array` — Low-level array utilities and sorters

Cross-platform code uses `CrossType.Pure` with shared sources. Platform-specific code goes in `jvm/` and `js/` source directories.

## Code Style

- Scalafmt 3.7.3 with `runner.dialect = scala213source3`
- Scala 2.13 builds use strict linting (`-Xlint:*`, `-Xfatal-warnings`)
- Tests use Specs2 (primary) and ScalaTest (some modules); tests run serially (`parallelExecution := false`)
- Binary compatibility checked via MiMa; version scheme is `early-semver`
