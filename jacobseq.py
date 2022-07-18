t = int(input())
for m in range(t):
 n = int(input())
 v = []
 while n not in v:
  v.append(n)
  if n%2 == 0: n //= 2
  else: break
 print(min(v))