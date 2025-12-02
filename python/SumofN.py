def sumOfN(n,sum):
    if(n<1):
        return 1
    sum=sum+n
    sumOfN(n-1,sum)
    print(sum)


if __name__ == "__main__":
    n= int(input("Enter a number: "))
    sumOfN(n,0)