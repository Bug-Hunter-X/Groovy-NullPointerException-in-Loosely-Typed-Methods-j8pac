```groovy
def myMethod(a, b) {
  if (a == null || b == null) {
    return null // Handle null input
  }
  return a + b
}

println myMethod(10, null) //Unexpected null behavior
println myMethod(null, 20)
println myMethod(10,20) //Correct Addition
```