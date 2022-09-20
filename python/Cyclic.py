from turtle import circle
from typing import List


class Cycle:
    def sort(arr: List) -> None:
        i = 0
        while (i < len(arr)):
            correct = arr[i]-1
            if (arr[i] == arr[correct]):
                i += 1
            else:
                arr[i], arr[correct] = arr[correct], arr[i]


arr = [3, 1, 4, 2]
Cycle.sort(arr)
print(arr)
