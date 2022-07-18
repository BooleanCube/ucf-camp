t=int(input())
for m in range(t):
 n=int(input())
 a=[]
 for i in range(n): a.append(int(input()))
 a.sort()
 l=[]
 for i in range(n//2): l.append([])
 for i in range(n):
  if i >= n//2: l[n//2-(i%(n//2))-1].append(a[i])
  else: l[i].append(a[i])
 print(min([sum(i) for i in l]))