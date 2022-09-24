inp = int(input())
k = list(map(int,input().split()))
b = [0]
c = set(k)-set(b)
d = len(list(k))-len(list(c))
nl = list(c)
for i in range(d):
    nl.append(
print(list(c))
