def rotate(nums, k) -> None:
    k = k % len(nums)
    def reverse(l,r):
        while l<r:
            nums[l] , nums[r] = nums[r], nums[l]
            l += 1
            r -= 1
    reverse(0,len(nums)-1)
    reverse(0,k-1)
    reverse(k,len(nums)-1) 
nums = [1,2,3,4,5,6,7]
k = 3  
rotate(nums, k)
print(nums)  
