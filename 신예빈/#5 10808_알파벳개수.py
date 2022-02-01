import sys
input = sys.stdin.readline

S = input().rstrip()
alpha = [0]*26

for i in S:
    alpha[ord(i)-ord('a')] += 1

print(*alpha)

