import sys
from collections import Counter
input = sys.stdin.readline

N = int(input())
A = list(map(int, input().split()))
count = Counter(A)
stack = []
result = [-1] * N
stack.append(0)

for i in range(N):
    while stack and count[A[stack[-1]]] < count[A[i]]:
        result[stack.pop()] = A[i]
    stack.append(i)

print(*result)