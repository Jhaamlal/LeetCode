const insertion = (array) => {
  for (let index = 0; index < array.length; index++) {
    for (let j = index + 1; j > 0; j--) {
      console.log(array)
      if (array[j - 1] > array[j]) {
        let temp = array[j - 1]
        array[j - 1] = array[j]
        array[j] = temp
      } else {
        break
      }
    }
  }
}
let array = [32, 4, 1, 0, 3]
insertion(array)
console.log(array)
