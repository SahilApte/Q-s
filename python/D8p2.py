def check(inp):
    summ = 0
    ans = 0
    for i in str(inp):
        summ += int(i)
        # print(i)
    # print(summ)
    if len(str(summ))>1:
        inp=summ
        return(check(inp))
    elif len(str(summ))==1:
        ans = summ
    return ans
a = input()
# a= 81
print(check(a))
