const twoDSearch = (matrix, target) => {
  let row = 0
  let col = matrix[0].length - 1

  while (row < matrix.length && col >= 0) {
    console.log(matrix[row][col])
    if (matrix[row][col] > target) {
      col--
    } else if (matrix[row][col] < target) {
      row++
    } else {
      return [row, col]
    }
  }
  return [-1, -1]
}

// Question
// https://leetcode.com/problems/search-a-2d-matrix/

// let matrix = [[1]]
let matrix = [
  [1, 3, 5, 7],
  [10, 11, 16, 20],
  [23, 30, 34, 60],
]

// matrix = { { 10, 20, 30, 40 }, { 15, 25, 35, 45 }, { 28, 29, 37, 49 }, { 33, 34, 38, 50 } }
// let matrix = [
//   [10, 20, 30],
//   [15, 25, 35],
//   [28, 29, 37],
//   [33, 34, 38],
// ]
let target = 1
let x = twoDSearch(matrix, target)
console.log(x)
