N = int(input())
arr = [0, 1, 3]
for i in range(3, N+1):
    arr.append(arr[i-1] + arr[i-2]*2)
print(arr[N] % 10007)