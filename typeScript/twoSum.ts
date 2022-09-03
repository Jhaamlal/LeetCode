function twoSum(nums: number[], target: number): number[] | void {
  let pointer1: number = 0
  while (pointer1 < nums.length) {
    let pointer2: number = pointer1 + 1
    while (pointer2 < nums.length) {
      if (nums[pointer1] + nums[pointer2] == target) {
        return [pointer1, pointer2]
      } else {
        pointer2 += 1
      }
    }
    pointer1 += 1
  }
}

let nums: number[] = [3, 2, 4]
let target: number = 6
let x: number[] | void = twoSum(nums, target)
console.log(x)

// Error
// 'number' only refers to a type, but is being used as a value here.
// Leetcode question number 1
