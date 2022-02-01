import sys
input = sys.stdin.readline

N = int(input())
line = input().rstrip()
num = [int(input()) for _ in range(N)]  # 피연산자값 받기

stack = []                    # stack 리스트를 통해 후위표기식 계산

for i in line :		
    if 'A' <= i <= 'Z' :		
        stack.append(num[ord(i)-ord('A')])
    else :						
        str2 = stack.pop()		
        str1 = stack.pop()

        if i =='+' :
            stack.append(str1+str2)
        elif i == '-' :
            stack.append(str1-str2)
        elif i == '*' :
            stack.append(str1*str2)
        elif i == '/' :
            stack.append(str1/str2)

print('%.2f' %stack[0])