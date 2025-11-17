nums = [3, 5, 7, 2, 8]
nums.sort()
largest_element = nums[-1]
print("The largest element in the array is:", largest_element)

#another method
largest_element = max(nums)
print("The largest element in the array is:", largest_element)

#another method without using built-in functions
max = 0;
for i in nums:
    if i > max:
        max = i
print("The largest element in the array is:", max)