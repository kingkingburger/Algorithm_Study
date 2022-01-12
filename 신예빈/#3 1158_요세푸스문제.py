import sys

N,K = map(int,sys.stdin.readline().split())
arr = [i for i in range(1,N+1)]    # 맨 처음에 원에 앉아있는 사람들

result = []   # 제거된 사람들을 넣을 배열
num = 0       # 제거할 사람의 인덱스

for i in range(N):
    num += K-1  
    if num >= len(arr): 
        num = num % len(arr)
 
    result.append(str(arr.pop(num)))

print("<",", ".join(result),">", sep="")

