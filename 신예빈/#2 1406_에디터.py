from abc import abstractmethod
import sys

# cursor를 숫자로 표현  문자가 abcd면 0 a 1 b 2 c 3 d 4  

# st = list(sys.stdin.readline().rstrip())
# cursor = len(st)
# testCase = int(sys.stdin.readline())

# print(st[0])

# for i in range(testCase):
#     case = sys.stdin.readline()
    
#     if case[0] == "L": 
#         if cursor != 0:
#             cursor -= 1
    
#     elif case[0] == "D":
#         if cursor != len(case)+1:
#             cursor += 1

#     elif case[0] == "B":
#         if cursor != 0:
#             st[cursor-1].pop()

#     elif case[0] == "P":
#         if cursor != 0:
#             st[cursor-1].append(case[2])

# print(st)

st = list(sys.stdin.readline().rstrip())
st2 = []

for _ in range(int(sys.stdin.readline())):
    case = list(sys.stdin.readline().split())

    if case[0] == "L": 
        if st:
            st2.append(st.pop())
    
    elif case[0] == "D":
        if st2:
            st.append(st2.pop())

    elif case[0] == "B":
        if st:
            st.pop()

    else:
        st.append(case[1])

st.extend(reversed(st2))
print(''.join(st))