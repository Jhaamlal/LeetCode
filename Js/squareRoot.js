const getSquareRoot = (x) => {
  // It's take a number ,
  // Then we will use to divide it into half plus 1 and the do end
  // Then apply binary search
  // while start <= end
  // Then mid =start+(end-start)/2
  // example test cases
  // 0,1,2,4,5,8,11,43345234533454353425,

  let start = 0
  let end = x / 2 + 1

  if (x < 2) {
    return x
  }
  let res = 0
  while (start <= end) {
    let mid = Math.floor(start + (end - start) / 2)
    if (mid * mid > x) {
      end = mid - 1
    } else if (mid * mid < x) {
      res = mid
      start = mid + 1
    } else {
      return mid
    }
  }
  return res
}

let x = getSquareRoot(11)
console.log(x)

// Problem to the thing
// https://leetcode.com/problems/sqrtx/
