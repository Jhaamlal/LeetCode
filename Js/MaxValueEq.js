// var findMaxValueOfEquation = function (points, k) {
//   let max
//   for (let row = 0; row < points.length - 1; row++) {
//     let val = Math.abs(points[row][0] - points[row + 1][0])
//     console.log(val)
//     if (val <= k) {
//       let x =
//         points[row][1] +
//         points[row + 1][1] +
//         Math.abs(points[row][0] - points[row + 1][0])
//       console.log("x is  " + x)
//       if (!max || x > max) {
//         max = x
//       }
//     }
//   }
//   return max
// }

// let points = [
//   [1, 3],
//   [2, 0],
//   [5, 10],
//   [6, -10],
// ]
// let points = [
//   [0, 0],
//   [3, 0],
//   [9, 2],
// ]
// let points = [
//   [-17, 13],
//   [2, 1],
//   [8, -5],
//   [18, -20],
// ]

// let points = [
//   [-19, 9],
//   [-15, -19],
//   [-5, -8],
// ]
let points = [
  [-19, -12],
  [-13, -18],
  [-12, 18],
  [-11, -8],
  [-8, 2],
  [-7, 12],
  [-5, 16],
  [-3, 9],
  [1, -7],
  [5, -4],
  [6, -20],
  [10, 4],
  [16, 4],
  [19, -9],
  [20, 19],
]
let k = 26

var findMaxValueOfEquation = function (points, k) {
  let max
  let i = 0

  while (i < points.length) {
    for (let j = i + 1; j < points.length; j++) {
      // console.log(points[i][0])
      // console.log(points[j][0])
      // Because all array are sorted then ,if element above is high ,below will definetly very high
      if (points[j][0] > points[i][0] + k) {
        break
      }

      let x = points[j][0] - points[i][0] + points[i][1] + points[j][1]
      if (!max || x > max) {
        max = x
        // let arr = [points[i][0], points[j][0], max]
        // console.log(arr)
      }
    }
    i += 1
  }

  return max
}

let x = findMaxValueOfEquation(points, k)
console.log(x)
