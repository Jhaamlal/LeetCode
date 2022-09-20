class BubleSort:
    def sort(arr):
        for i in range(len(arr)):
            for j in range(1, len(arr)-i):
                if (arr[j-1] > arr[j]):
                    arr[j-1], arr[j] = arr[j], arr[j-1]


arr = [32, 4, 1, 0, 3]
BubleSort.sort(arr)
print(arr)
