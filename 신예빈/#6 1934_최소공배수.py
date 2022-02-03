T = int(input())

def gcd(a, b):
    if b == 0:
        return a
    else:
        return gcd(b, a%b)
    
def lcm(a, b):
    res_gcd = gcd(a, b)
    return a*b // res_gcd

for _ in range(T):
    A, B = map(int, input().split())
    print(lcm(A, B))