t=int(input())
for m in range(t):
	inp = list(map(int,input().split()))
	l = sorted(inp[:3])
	n = inp[3]
	print(n-l[1] if n>=l[1] else 0)