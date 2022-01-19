import sys
input = sys.stdin.readline

line = input()
stack = []
result = 0

for i in range( len(line) ):
    if line[i-1] == "(" and line[i] == ")":
        stack.pop()
        result += len(stack)
    elif line[i] == "(":
        stack.append(line[i])
    elif line[i] == ")":
        stack.pop()
        result += 1
        
print(result)
        