def quickSort(arr):
    if len(arr)<=1:
        return arr

    pivot = arr[len(arr) // 2]

    left = [x for x in arr if x<pivot]
    middle = [x for x in arr if x==pivot]
    right = [x for x in arr if x>pivot]

    return quickSort(left)+middle+quickSort(right)

if __name__=="__main__":
    print(quickSort([4,5,1,99,23,9]))