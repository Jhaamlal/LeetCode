# class solution:
#     def flipAndInvertImage(self,image):

#         pass

class Solution:
    def flipAndInvertImage(self, image):
        newList = []
        List = [[0]*3]*4
        xlist = []
        for i in image:
            for j in i[::-1]:
                if(j == 0):
                    xlist.append(1)
                else:
                    xlist.append(0)

            newList.append(xlist)
            xlist = []
        print((List[0][0]))
        return newList


image = [[1, 1, 0], [1, 0, 1], [0, 0, 0]]

Solution.flipAndInvertImage(Solution, image=image)
