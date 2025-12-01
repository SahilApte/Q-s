def printNto1(n):
    if(n<=0):
        return
    print(n,end=" ")
    printNto1(n-1)

def printNto1_backtracking(i,n):
    if(i>n):
        return
    printNto1_backtracking(i+1,n)
    print(i,end=" ")
    

if __name__ == "__main__":
    n= int(input("Enter a number: "))
    printNto1_backtracking(1,n)