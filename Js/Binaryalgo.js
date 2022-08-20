const Binaryfunc = (arr, target) => {
  // Initiate start and end
  let start = 0
  let end = arr.length - 1
  // till end is less then start
  while (start <= end) {
    // Mid is start , end-start is that
    // that makes the things
    let mid = start + (end - start) / 2

    // target is less then mid,move end to less then mid
    if (target < arr[mid]) {
      end = mid - 1
      // target is more then mid,move start with mid plus one
    } else if (target > arr[mid]) {
      start = mid + 1
    } else {
      // Less then mid,
      return mid
    }
  }
  //   If not found return -1
  return -1
}
arr = [1, 2, 6, 10, 15, 19, 21]
target = 15
Binaryfunc(arr, 15)
