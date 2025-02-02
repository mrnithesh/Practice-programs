def find_gcd(a,b):
    gcd=1
    #brute force
    for i in range(1,min(a,b)+1):
        if (a%i==0) and (b%i==0):
            gcd=i
    return gcd

def gcd(a,b):
    #recursion
    if b==0:
        return a
    return gcd(b,a%b)



print(find_gcd(120,18))
print(gcd(18,120))