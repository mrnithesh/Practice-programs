def find_gcd(a,b):
    gcd=1
    for i in range(1,min(a,b)+1):
        if (a%i==0) and (b%i==0):
            gcd=i
    return gcd

print(find_gcd(120,18))