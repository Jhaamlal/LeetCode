function search1(nums: number[], target: number): number {
  let start: number = 0
  let end: number = nums.length - 1
  var mid: number = 0
  let arrLength = nums.length - 1
  while (start <= end) {
    mid = Math.floor(start + (end - start) / 2)
    if (nums[mid] > nums[mid - 1] && nums[mid] > nums[mid + 1]) {
      break
    } else if (nums[mid] < nums[mid - 1] && nums[mid] < nums[mid + 1]) {
      if (nums[mid + 1] > nums[mid - 1]) {
        mid = mid + 1
        break
      } else {
        mid = mid - 1
        break
      }
    } else if (nums[0] > nums[arrLength]) {
      if (nums[mid + 1] > nums[mid] && nums[mid - 1] < nums[mid]) {
        start = mid + 1
      }
    } else if (nums[0] < nums[arrLength]) {
      if (nums[mid + 1] < nums[mid] && nums[mid - 1] > nums[mid]) {
      }
      end = mid - 1
    } else {
      break
    }
  }
  while (start <= end) {
    mid = Math.floor(start + (end - start) / 2)
  }
  //   Now we have to get the things done the element

  const targetSearch = (start: number, end: number) => {
    while (start <= end) {
      let mid1 = Math.floor(start + (end - start) / 2)

      if (nums[mid1] > target) {
        end = mid1 - 1
      } else if (nums[mid1] < target) {
        start = mid1 + 1
      } else {
        return mid1
      }
    }
    return -1
  }

  if (nums[0] <= target && nums[mid] >= target) {
    return targetSearch(0, mid)
  } else if (nums[mid + 1] <= target && nums[arrLength] >= target) {
    return targetSearch(mid + 1, arrLength)
  } else {
    return -1
  }

  return -1
}
// let nums = [4, 5, 6, 7, 0, 1, 2]
let nums = [7, 8, 1, 2, 3, 4, 5, 6]
// let nums = [3, 11, 12, 13, 14, 0, 1, 2]
// let nums = [1, 2]
let target = 2
let y = search1(nums, target)
console.log(y)
