n,m = map(int,input().split())
p = "<|>"

for i in range(n//2):
    print((p*((i*2)+1)).center(m,'*'))

print("I ♡ to Code".center(m,'*'))

for j in range(n//2-1,-1,-1):
    print((p*((j*2)+1)).center(m,'*'))
# get differnt patterns by chaging the characters
"""
Sample Input:
9 27

Sample Output:

************<|>************
*********<|><|><|>*********
******<|><|><|><|><|>******
***<|><|><|><|><|><|><|>***
********I ♡ to Code********
***<|><|><|><|><|><|><|>***
******<|><|><|><|><|>******
*********<|><|><|>*********
************<|>************

"""
