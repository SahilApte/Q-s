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
