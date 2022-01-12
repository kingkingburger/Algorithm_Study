import sys

queue = []

for _ in range(int(sys.stdin.readline())):
    line = list(sys.stdin.readline().split())

    if line[0] == 'push':
        queue.append(line[1])

    elif line[0] == 'pop':
        if len(queue) == 0:
            print(-1)
        else:
            print(queue.pop(0))
        continue

    elif line[0] == 'size':
        print(len(queue))
        continue

    elif line[0] == 'empty':
        if len(queue) == 0:
            print(1)
        else:
            print(0)
        continue
    
    elif line[0] == 'front':
        if len(queue) == 0:
            print(-1)
        else: print(queue[0])
        continue

    else:
        if len(queue) == 0:
            print(-1)
        else: print(queue[len(queue)-1])