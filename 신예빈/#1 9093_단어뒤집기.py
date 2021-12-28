import sys

T = int(sys.stdin.readline())
for i in range(T):
    reverse = ''
    case = sys.stdin.readline().rstrip().split(' ')
    for j in range(len(case)):
        case[j] = case[j][::-1]
        reverse = reverse + case[j] + ' '
    print(reverse)
    