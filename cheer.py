t=int(input())
for m in range(t):
	n=int(input())
	l=list(map(int,input().split()))
	l=sorted(l, reverse=True)
	s,p=0,l[0]+3
	for i in l:
		if p-i>=2:
			s+=i;p=i
	print(s)
	