var nextGreatestLetter = function (letters, target) {
  let start = 0
  let end = letters.length - 1

  while (start <= end) {
    let mid = parseInt(start + (end - start) / 2)
    if (target < letters[mid]) {
      end = mid - 1
    } else {
      start = mid + 1
    }
  }
  console.log(letters[start % letters.length])
  return letters[start % letters.length]
}

letters = ["e", "e", "e", "e", "e", "e", "n", "n", "n", "n"]
target = "a"
nextGreatestLetter(letters, target)
