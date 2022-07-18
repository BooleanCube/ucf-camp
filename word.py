import itertools

t=int(input())
for i in range(t):
 text=input()
 s=len(set(itertools.permutations(text)))
 print(s)
