nums1 = [121,32,45,67,89]
nums2 = [1,2,3,4,5,6]
def is_sorted(arr):
    for i in range(len(arr)-1):
        if arr[i] > arr[i+1]:
            return False
    return True
print(is_sorted(nums1))  # Output: False
print(is_sorted(nums2))  # Output: True