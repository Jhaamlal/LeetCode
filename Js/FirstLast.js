var searchRange = function (nums, target) {
  let start = 0
  let end = nums.length - 1
  let item = [-1, -1]

  if (start == end) {
    if (nums[0] == target) {
      return [0, 0]
    } else {
      return [-1, -1]
    }
  }
  while (start <= end) {
    mid = parseInt(start + (end - start) / 2)

    if (target < nums[mid]) {
      end = mid - 1
    } else if (target > nums[mid]) {
      start = mid + 1
    } else {
      break
    }
  }
  if (start > end) {
    return [-1, -1]
  }

  for (let index = mid; index >= start; index--) {
    if (nums[index] < target) {
      item[0] = index + 1
      break
    } else if (nums[index] == target) {
      item[0] = index
    }
  }

  for (let index = mid; index <= end; index++) {
    if (nums[index] > target) {
      item[1] = index - 1
      break
    } else if (nums[index] == target) {
      item[1] = index
    } else {
      if (index > 0) {
        item = index - 1
      }
    }
  }
  return item
}
nums = [2, 2]
target = 2
let res = searchRange(nums, target)
console.log(res)
