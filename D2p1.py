a = input()
l = len(a)
count = 0
while(len(a)>0):
    l-=1
    if(a[l]!=" "):
        count +=1
    elif(count>0):
        print(count)
    
print(count)
    
