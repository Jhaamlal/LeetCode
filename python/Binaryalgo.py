from tokenize import Number


class BinaryAlgo:
    def __init__(self, arr, target) -> Number:
        self.arr = arr
        self.target = target

    def binarySearch(self):
        start = 0
        end = len(self.arr)-1

        while(start <= end):
            mid = start+(end-start)//2

            if(self.target < self.arr[mid]):
                end = mid-1
            elif(self.target > self.arr[mid]):
                start = mid+1
            else:
                print(mid)
                return mid
        return -1


arr = [1, 3, 5, 6, 7, 9, 15, 18]
target = 15
le = BinaryAlgo(arr, target)
le.binarySearch()
