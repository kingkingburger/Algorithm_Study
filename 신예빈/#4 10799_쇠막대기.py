import sys
input = sys.stdin.readline

line = input()
stack = []
count = 0

for i in range( len(line) ):
    if line[i-1] == "(" and line[i] == ")":
        stack.pop()
        count += len(stack)
    elif line[i] == "(":
        stack.append(line[i])
    elif line[i] == ")":
        stack.pop()
        count += 1
        
print(count)
        