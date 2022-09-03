const postionNumber = (nums, target) => {
  let start = 0
  let end = 1
  while (start <= target) {
    if (nums[start] <= target && nums[end] >= target) {
      break
    } else {
      start = end
      end = end * 2
    }
  }

  while (start <= end) {
    let mid = parseInt(start + (end - start) / 2)
    if (nums[mid] < target) {
      start = mid + 1
    } else if (nums[mid] > target) {
      end = mid - 1
    } else {
      return mid
    }
  }
  return -1
}

let nums = [3, 5, 7, 9, 10, 90, 100, 130, 140, 160, 170]
let target = 10
let res = postionNumber(nums, target)

console.log(res)

// Question
// https://www.geeksforgeeks.org/find-position-element-sorted-array-infinite-numbers/
