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
