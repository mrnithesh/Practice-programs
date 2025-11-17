nums = [1, 3, 7, 0, -5, 9, 2]
largest = float('-inf')
s_largest = float('-inf')
for num in nums:
    if num>largest:
        s_largest = largest
        largest= num
    elif s_largest<num<largest:
        s_largest = num
print("Second largest element is :",s_largest)