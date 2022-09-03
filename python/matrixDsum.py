from operator import le


class Solution:
    def diagonalSum(self, mat):
        sum=0
        for i in range(len(mat)):
            for j in range(len(mat[i])):
                if(i==j):
                    sum=sum+mat[i][j]
                elif(i+j ==len(mat)-1):
                    sum=sum+mat[i][j]
        return sum

mat = [
  [1, 2, 3],
  [4, 5, 6],
  [7, 8, 9],]
x=Solution()
y=x.diagonalSum(mat)
print(y)
