a = input()
lst = []
b = list(map(int,input().split()))
for i in range(int(a)):
    lst.append(i)
print(*(set(lst)-set(b)))
