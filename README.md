# Groovy NullPointerException Example

This repository demonstrates a common issue in Groovy related to null pointer exceptions arising from the dynamic typing system.  When a method doesn't explicitly check for null values passed as parameters, unexpected behavior can occur, particularly if you are accustomed to languages with stronger type checking.

The `bug.groovy` file contains the problematic code.  The `bugSolution.groovy` provides a corrected version.

## How to reproduce the bug
1.  Clone this repository.
2.  Run `groovy bug.groovy`
3.  Observe the unexpected output (null) when a null value is passed to `myMethod`.

## How the solution addresses the bug
The solution (`bugSolution.groovy`) improves `myMethod` by explicitly checking for null values before performing the addition.  This prevents the null pointer exception and provides more predictable behavior.  The solution demonstrates a robust approach that handles null values gracefully, leading to more reliable code.