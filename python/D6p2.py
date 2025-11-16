## Approach 1

a = input().split()
# a = ['ram','marg']
s1 = list(a[0])
s2 = list(a[1])
# print(s1)
# print(s2)
z  = ""
for i in s2:
    if(s1.count(i) != s2.count(i)):
        z =i
print(z)


## Approach 2
a = input().split()
s1 = list(a[0])
s2 = list(a[1])
print(s1)
print(s2)
z = 0
for i in range(len(s1)):
    z = z^ord(s1[i])^ord(s2[i])
z=z^ord(s2[-1])
print(chr(z))
