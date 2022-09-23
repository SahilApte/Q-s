a = int(input())
b = list(map(int,input().split()))
c = list(set(b))
l = len(b)//2
res = 0
lst2 =[]
d={}
maxxy = 0
minn = 0
for i in c:
    res = b.count(i)
    d[i]=res
keymax = max(d, key = lambda x: d[x])
print(keymax)
# print(max(zip(d.values(),d.keys())))[1]
    
# print(d)

# maxx = max(lst2)
# ind = c.index(lst2[maxx])
# print(c[ind])
# print(max(b))
