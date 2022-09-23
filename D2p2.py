a = int(input())
b = list(map(int,input().split()))
s = list(set(b))
ans = 0
for i in range(len(s)):
    if(b.count(s[i])==1):
        ans = s[i]
print(ans)
