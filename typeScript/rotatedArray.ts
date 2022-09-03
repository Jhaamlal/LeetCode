function search(nums: number[], target: number): number {
  let start: number = 0
  let end: number = nums.length - 1
  let mid: number = 0

  if (nums.length < 3) {
    if (nums[0] == target) {
      return 0
    } else if (nums[1] == target) {
      return 1
    } else {
      return -1
    }
  }

  while (start <= end) {
    mid = Math.floor(start + (end - start) / 2)
    if (nums[mid] > nums[mid - 1]) {
      start = mid - 1
    } else if (nums[mid] < nums[mid - 1]) {
      end = mid + 1
    }
    if (nums[mid] < nums[mid + 1]) {
      start = mid - 1
    } else if (nums[mid] > nums[mid + 1]) {
      end = mid + 1
    }

    if (nums.slice(start).length - nums.slice(end).length <= 3) {
      break
    }
  }

  if (nums[0] <= target && target <= nums[mid]) {
    start = 0
    let y = nums.slice(0, mid + 1)
    end = y.length
  } else {
    end = nums.length - 1
    let x = mid + 1
    start = nums.slice(x).length
  }

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

// let nums: number[] = [4, 5, 6, 7, 0, 1, 2]
let nums1: number[] = [3, 5, 1]
let target1: number = 1
let x: number = search(nums1, target1)
console.log(x)
