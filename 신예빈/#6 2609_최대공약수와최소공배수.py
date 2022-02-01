a, b = map(int, input().split())

def gcd(a, b):
    if b == 0:
        return a
    else:
        return gcd(b, a%b)
    
def lcm(a, b):
    res_gcd = gcd(a, b)
    return a*b // res_gcd

print(gcd(a, b))
print(lcm(a, b))