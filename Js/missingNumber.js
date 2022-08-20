var firstMissingPositive = function (nums) {
  nums.sort((a, b) => a - b)
  let number = 1
  let index = -1
  nums = [...new Set(nums)]
  for (let i of nums) {
    index = index + 1
    if (i > 0) {
      if (nums[index] == number) {
        number = number + 1
      } else {
        return number
      }
    }
  }
  return number
}
// let nums = [3, 4, -1, 1]
let nums = [0, 2, 2, 1, 1]

// nums = [7, 8, 9, 11, 12]
let int = firstMissingPositive(nums)
console.log(int)
