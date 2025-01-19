def calculate(a, b) {
  if (a == null || b == null) {
    return 0 // or handle nulls appropriately, e.g., return a ?: 0 + b ?: 0
  }
  return a + b
}

println calculate(5, null) //Output: 0
println calculate(5,10) //Output: 15