import sys

testCase = int(sys.stdin.readline())

sequence = [i+1 for i in range(testCase)]   # 1부터 testcase까지의 수열 리스트
stack = []                                  
operation = []                              # 기호 저장 리스트

for i in range(testCase):
    case = int(sys.stdin.readline())
    
    if len(stack) == 0 or stack[-1] != case:

        if case in stack:                   # 작은 값이 큰 값보다 먼저 pop되는 경우
            operation = ["NO"]
            break
            
        for j in range(case):               # push하는 경우
            if sequence[0] == case:           
                stack.append(sequence.pop(0)) 
                operation.append("+")
                break
            else:
                stack.append(sequence.pop(0))
                operation.append("+")
        
    if stack[-1] == case:                   # pop하는 경우
        stack.pop()
        operation.append("-")
  
for i in range(len(operation)):             # 기호 출력
    print(operation[i])