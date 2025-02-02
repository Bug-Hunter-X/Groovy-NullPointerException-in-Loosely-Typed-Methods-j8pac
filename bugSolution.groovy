```groovy
def myMethod(a, b) {
  a = a ?: 0 //Null safe defaulting
  b = b ?: 0
  return a + b
}

println myMethod(10, null) //Now returns 10
println myMethod(null, 20) //Now returns 20
println myMethod(10,20) //Correct Addition
```