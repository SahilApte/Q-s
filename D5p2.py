# b =['d','i','v','i','d','e']
a = ['a','e','i','o','u']
b = list(input())

c =[]
ind  = []
for i in b:
    if i in a:
        c.append(i)
for i in range(len(b)):
    if(b[i] in a):
        b[i] =c.pop(-1)
print("".join(b))
