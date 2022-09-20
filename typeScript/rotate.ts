function search1(nums: number[], target: number): number {
  let start = 0
  let end = nums.length - 1

  while (start <= end) {
    let mid = Math.floor(start + (end - start) / 2)

    if (nums[mid] == target) {
      return mid
    }
    // If the starting number is smaller then the middel value then
    // In that case of Senario

    if (nums[0] <= nums[mid]) {
      if (target >= nums[start] && target <= nums[mid]) {
        end = mid - 1
      } else {
        start = mid + 1
      }
    } else {
      if (target >= nums[mid] && target <= nums[end]) {
        start = mid + 1
      } else {
        end = mid - 1
      }
    }
  }

  return -1
}

// Question
// https://leetcode.com/problems/search-in-rotated-sorted-array/

// let nums = [4, 5, 6, 7, 0, 1, 2]
// let nums = [7, 8, 1, 2, 3, 4, 5, 6]
// let nums = [3, 11, 12, 13, 14, 0, 1, 2]
let nums = [3, 1]
let target = 1
let y = search1(nums, target)
console.log(y)
