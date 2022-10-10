// https://leetcode.com/problems/merge-sorted-array/
let merge = function (nums1, m, nums2, n) {
  if (n == 0) {
    return nums1;
  } else {
    for (let index = 0; index < n; index++) {
      nums1[index + m] = nums2[index];
    }
    return nums1.sort((a, b) => a - b);
  }
};

let nums1 = [1, 2, 3, 0, 0, 0];
let m = 3;
let nums2 = [2, 5, 6];
let n = 3;
let x = merge(nums1, m, nums2, n);
console.log(x);
