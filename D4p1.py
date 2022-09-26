inp = int(input())
k = list(map(int,input().split()))
b = [0]
c = []
for i in k:
    if i not in b:
        c.append(i)
d = len(list(k))-len(list(c))
for i in range(d):
    c.append(0)
print(list(c))
