d=0
q=input()
n=len(q)
for i in range(n):
    d=d+((26**(i))*(ord(q[n-1-i])-64))
print(d)
