nums = [1, 2, 3, 4, 5]
last = nums[0]

for i in range(0, len(nums)-1):
    nums[i] = nums[i+1]
nums[-1] = last
print("Array after left rotation by one position:", nums)