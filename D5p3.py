a= int(input())
# a =14
lst = [2,3,5]
for i in lst:
    while(a%i == 0 and a>1):
        a/=i
print(a ==1)
