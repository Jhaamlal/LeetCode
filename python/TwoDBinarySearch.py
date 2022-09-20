

# class TwoDSearch():
#     def __init__(self, matrix: List, target: numbers) -> None:
#         self.matrix = matrix,
#         self.target = target

#     def searchMatrix(self):
#         self.matrix = self.matrix[0]
#         row = 0
#         col = len(self.matrix[0])-1

#         while (row < len(self.matrix) and col > 0):
#             if (self.matrix[row][col] > target):
#                 col -= 1
#             elif (self.matrix[row][col] < target):
#                 row -= 1
#             else:
#                 return [row, col]
#         return [-1, -1]


# matrix = [[1, 3, 5, 7], [10, 11, 16, 20], [23, 30, 34, 60]]
# target = 3
# print(TwoDSearch(matrix, target).searchMatrix())


class Solution:
    def searchMatrix(self, matrix, target):
        row = 0
        col = len(matrix[0])-1
        while (row < len(matrix) and col >= 0):
            print(matrix[row][col])
            if (matrix[row][col] > target):
                col -= 1
            elif (matrix[row][col] < target):
                row += 1
            else:
                return True
        return [-1, -1]


# matrix = [[1, 3, 5, 7], [10, 11, 16, 20], [23, 30, 34, 60]]
matrix = [[1, 1]]
target = 2
x = Solution.searchMatrix(Solution, matrix, target)
print(x)
