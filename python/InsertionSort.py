class InsertionSort:
    def insert(arr):
        for i in range(len(arr)-1):
            for j in range(i+1, 0, -1):
                if (arr[j-1] > arr[j]):
                    arr[j-1], arr[j] = arr[j], arr[j-1]
                else:
                    break


arr = [21, 32, 1, 43, 0]
InsertionSort.insert(arr)
print(arr)
