import sys
input = sys.stdin.readline

infix = input().rstrip()
stack = [] #스택
result='' #출력

for x in infix:
    if x.isalpha(): #피연산자인지 아닌지 확인
        result+=x
    else:
        if x == '(':
            stack.append(x)
        elif x == '*' or x =='/':
            while stack and (stack[-1]=='*' or stack[-1]=='/'):
                result+=stack.pop()
            stack.append(x)
        elif x == '+' or x == '-':
            while stack and stack[-1] != '(':
                result += stack.pop()
            stack.append(x)
        elif x == ')':
            while stack and stack[-1] != '(':
                result+=stack.pop()
            stack.pop()

#스택안에 남아있는 값들 pop            
while stack:
    result += stack.pop()
print(result)