const Most = (array: number[]) => {
  let max = 0
  let maxElment
  let obj = {}
  array.forEach((element) => {
    // Check if it is in object
    if (element in obj) {
      array[element] = array[element] + 1
      if (obj[element] + 1 > max) {
        max = obj[element]
        maxElment = element
      }
    } else {
      obj[element] = 1
    }
  })
  return maxElment
}

let nums = [0, 1, 2, 2, 4, 4, 1]
let x = Most(nums)
console.log(x)
