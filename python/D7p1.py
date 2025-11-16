s1 = list(input())
s2 = set(s1)
c=0
for i in s2:
    if(s1.count(i)%2 ==0):
        c = c+s1.count(i)
    elif(s1.count(i)>1):
        c = c + (s1.count(i)-1)
if(c<len(s1)):
    print(c+1)
else:
    print(c)
