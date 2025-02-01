def is_amrstrong(a):
    number_of_digit=len(str(a))
    sum=0
    original=a
    while a>0:
        sum+=(a%10)**number_of_digit
        a//=10
    return sum==original

print(is_amrstrong(154))