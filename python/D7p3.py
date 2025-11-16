a = int(input())
b = list(map(int,input().split()))
# a = 4
# b = [1,2,3,4]
s = ""
for i in b:
    s+=(str(i))
s= int(s) +1
print(*list(str(s)))
