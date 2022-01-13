r,c = map(int,input().split())
p = "<|>"

for i in range(r//2):
    print((p*((i*2)+1)).center(c,'*'))

print("I ♡ to Code".center(c,'*'))

for j in range(r//2-1,-1,-1):
    print((p*((j*2)+1)).center(c,'*'))

# get differnt patterns by changing the characters
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
