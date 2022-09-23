
#Approach 1
import math

def happy(num):
    summ = 0
    mods = 0
    while(num!=0):
        mods = num%10
        summ = summ + math.pow(mods,2)
        num = num//10
    return summ

num = int(input())
result = num

while(result!=1 and result!=4):
    result =happy(result)
    
print("true" if result ==1 else "false")

#Approach 2
def happy(num):
    lst = []
    while(num!=1):
        num = sum(int(i)**2 for i in str(num))
        if num in lst:
            return "false"
        lst.append(num)
    return "true"
x = input()
print(happy(x))
