##incomplete code
def p(lst1):
    maxx= 0
    minn = min(lst1)
    for i in range(lst1.index(minn),len(lst1)):
        if(maxx< lst1[i]):
            maxx = lst1[i]
    profit = maxx - minn
    return profit
a = int(input())
b = list(map(int,input().split()))
c = b
print(p(c))
