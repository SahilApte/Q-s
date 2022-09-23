z = 0
flag = 0
a = input()
for i in a:
    if(a!=1):
        z = z+ int(i)**2
        a = z
    else:
        flag = 1
if(flag==1):
    print("true")
else:
    print("false")
    
