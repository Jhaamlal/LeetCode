/**
 * @param {number[]} position
 * @return {number}
 */
// var minCostToMoveChips = function (position) {
//   let obj = {}
//   position.map((item) => {
//     if (Object.keys(obj).includes(item.toString())) {
//       obj[item] = obj[item] + 1
//     } else {
//       obj[item] = 1
//     }
//   })
//   let sortObj = Object.entries(obj).sort((a, b) => b[1] - a[1])
//   console.log(sortObj)
//   let maxPosition
//   let totalCost = 0
//   for (let index = 0; index < sortObj.length; index++) {
//     if (index == 0) {
//       maxPosition = +sortObj[0][0]
//     } else {
//       if (
//         Math.abs(maxPosition - parseInt(sortObj[index][0])) == 1 ||
//         Math.abs(maxPosition - parseInt(sortObj[index][0])) > 2
//       ) {
//         totalCost += sortObj[index][1]
//       }
//     }
//   }

//   return totalCost
// }
// let position = [2, 2, 2, 3, 3]
// let position = [1, 10000000]
var minCostToMoveChips = function (position) {
  let evenCount = 0,
    oddCount = 0

  for (let pos of position) {
    console.log(pos)
    pos % 2 === 0 ? evenCount++ : oddCount++
  }

  return Math.min(evenCount, oddCount)
}
// let position = [
//   1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22,
//   23, 24, 25, 26, 27, 28, 29, 30,
// ]

// let position = [1, 2, 3]
let position = [2, 2, 2, 3, 3]
console.log(minCostToMoveChips(position))
