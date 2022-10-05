// https://leetcode.com/problems/find-the-duplicate-number/

function findDuplicate(nums: number[]): number {
  let i = 0
  while (i < nums.length) {
    if (nums[i] == i + 1) {
      i += 1
    } else if (nums[i] == nums[nums[i] - 1]) {
      return nums[i]
    } else {
      let temp = nums[nums[i] - 1]
      nums[nums[i] - 1] = nums[i]
      nums[i] = temp
    }
  }

  return 0
}
