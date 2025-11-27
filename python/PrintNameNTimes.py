# def print_name_n_times(name, n):
#     for _ in range(n):
#         print(name)

def print_name_n_timesRecurtion(name, n):
    if(n<=0):
        return
    print(name+" ",end="")
    print_name_n_timesRecurtion(name, n-1)
    

if __name__ == "__main__":
    name = input("Enter your name: ")
    n = int(input("Enter the number of times to print your name: "))
    # print_name_n_times(name, n)
    print_name_n_timesRecurtion(name, n)