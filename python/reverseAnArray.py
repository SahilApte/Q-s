def reverseAnArray(l,r,arr):
    if(l>=r):
        return arr
    swap(arr[l],arr[r],arr)
    reverseAnArray(l+1,r-1,arr)

def swap(l,r,arr):
    arr[l]=arr[l]+arr[r]
    arr[r]=arr[l]-arr[r]
    arr[l]=arr[l]-arr[r]
if __name__ == "__main__":
    arr=[1,5,3,2,4]
    l=0
    r=len(arr)-1
    reverseAnArray(l,r,arr)
    print("Reversed array is:",arr) 