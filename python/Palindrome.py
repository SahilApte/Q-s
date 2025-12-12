def palindrome_check(s,i=0):
    n = len(s)
    if i==abs(n//2):
        return True
    if s[i]!=s[n-i-1]:
        return False
    return palindrome_check(s, i+1)

if __name__ == "__main__":
    s = "MADaAM"
    print(palindrome_check(s))
