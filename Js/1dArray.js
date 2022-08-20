var runningSum = function (nums) {
  let newArr = []
  let prev
  for (let i = 0; i < nums.length; i++) {
    if (i == 0) {
      prev = nums[i]
      newArr.push(prev)
    } else {
      prev = prev + nums[i]
      newArr.push(prev)
    }
  }
  return newArr
}
