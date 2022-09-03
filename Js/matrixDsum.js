var diagonalSum = function (mat) {
  let sum = 0
  for (let i = 0; i < mat.length; i++) {
    for (let j = 0; j < mat[i].length; j++) {
      if (i == j) {
        sum = sum + mat[i][j]
      } else if (i + j == mat[i].length - 1) {
        sum = sum + mat[i][j]
      }
    }
  }
  console.log(sum)
  return sum
}

// let mat = [
//   [1, 1, 1, 1],
//   [1, 1, 1, 1],
//   [1, 1, 1, 1],
//   [1, 1, 1, 1],
// ]
// let mat = [
//   [1, 2, 3],
//   [4, 5, 6],
//   [7, 8, 9],
// ]
let mat = [[5]]
diagonalSum(mat)
