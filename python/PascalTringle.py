class Solution:
    def pascalTringle(numRows):
        bigArr=[]
        for i in range(1,numRows+1):
            if(i ==1):
                # if element is 1 ,this is special case where the only single element is add 
                bigArr.append([1])
            elif(i==2):
                # if the element has 1 in that case only ,these two number will be add
                bigArr.append([1,1])
            else:
                # create empty error
                tempList=[]
                # get the last element of big array which is it self is arry 
                x=bigArr[-1]
                # put the one at starting and last of the element
                tempList.append(1)
                for i in range(0,len(x)-1):
                    # try to append the element 
                    tempList.append(x[i]+x[i+1])
                
                tempList.append(1)
                bigArr.append(tempList)
        return bigArr

x=Solution.pascalTringle(5)
print(x)
