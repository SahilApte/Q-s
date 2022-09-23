a = list(input())
b = list(input())
d = {}
# a=['p','a','p','e','r']
# b=['t','i','t','l','e']
c=list(set(a))
d=list(set(b))
print("false" if len(c)!=len(d) else "true")

# for key in a:
#     for value in b:
#         d[key] = value
#         b.remove(value)
         
#         break
# print(d)
        
