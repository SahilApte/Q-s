a= int(input())
flag = 1
b = list(bin(a)[2:])
for i in range(0,len(b)-1):
    if(b[i]== b[i+1]):
        flag = 0
        break
    else:
        flag = 1
if(flag ==1):
    print("true")
else:
    print("false")
