s1 = input()
s2 = input().split()
# s1 = ['b','a','b','a']
# s2 =['cat','rat','cat','rat']
# s2 = ['cat','rat','rat','cat']
# ctow={}
# wtoc={}
def func(s1,s2):
    comp = {}
    flag = True
    for i in range(len(s1)):
        if s1[i] not in comp.keys():
            comp[s1[i]]=s2[i]
        else:
            if(comp[s1[i]]!=s2[i]):
                flag = False
                break
    return flag
ctow = func(s1,s2)
wtoc = func(s2,s1)
print(True if (ctow==True and wtoc==True) else False)
# print(ctow)
# print(wtoc)
