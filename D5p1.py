inp = list(input())
ind = 0
flag = 0
for i in range(len(inp)):
    if(inp.count(inp[i])==1):
        ind = inp.index(inp[i])
        flag = 1
        break
    else:
        flag =0
print(ind if flag == 1 else "-1")
