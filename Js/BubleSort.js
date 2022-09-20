let bubble = (arr) => {
  for (let i = 0; i < arr.length; i++) {
    // Here the thing is to  itration  over the array
    let swapped = false
    for (let j = 1; j < arr.length - i; j++) {
      console.log(arr)
      if (arr[j - 1] > arr[j]) {
        swapped = true
        let temp = arr[j - 1]
        arr[j - 1] = arr[j]
        arr[j] = temp
      }
    }
    if (!swapped) {
      break
    }
  }
}

let arr = [32, 1, 4, 3, 5, 0]
bubble(arr)
console.log(arr)
