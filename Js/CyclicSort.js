var arr = [3, 2, 4, 1]

var swap = (arr, start, end) => {
  console.log(arr)
  let temp = arr[start]
  arr[start] = arr[end]
  arr[end] = temp
  console.log(arr)
}
const cycle = (arr) => {
  let i = 0
  while (i < arr.length) {
    // Find the correct position of that element in that array
    let correctIndex = arr[i] - 1
    // Then check whether element is at right position
    if (arr[i] == arr[correctIndex]) {
      i += 1
    } else {
      // Swap the element to that
      swap(arr, i, correctIndex)
    }
  }
}

cycle(arr)
console.log(arr)
