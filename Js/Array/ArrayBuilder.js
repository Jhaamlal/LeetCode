var buildArray = function (nums) {
  let arrLength = nums.length
  let newArr = []
  for (let i = 0; i < arrLength; i++) {
    newArr.push(nums[nums[i]])
  }
  return newArr
}
