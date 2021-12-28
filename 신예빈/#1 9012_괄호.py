import sys

T = int(sys.stdin.readline())

for i in range(T):
    vps=[]    #왼쪽괄호 저장 스택
    true = 1    #vps 여부
    ps = sys.stdin.readline()
    
    for j in range(len(ps)):
        if (ps[j] == '('):
            vps.append(ps[j])
            
        elif (ps[j] == ')'):
            if (len(vps) == 0):    #오른쪽 괄호가 더 많은 경우
                true = 0
                print("NO")
                break
            else:
                vps.pop()
    if (len(vps) > 0):    #왼쪽 괄호가 더 많은 경우
        true = 0
        print("NO")
    
    if (true == 1):
        print("YES")