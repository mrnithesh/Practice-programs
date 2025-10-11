def is_palindrome(a):
    rev=0
    original=a
    while a>0:
        rev= rev*10 + a%10
        a//=10
    return (rev==original)

print(is_palindrome(21))