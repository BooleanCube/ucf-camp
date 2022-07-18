t=int(input())
for m in range(t):
	l=list(map(int, input().split()))
	print(((l[0]+l[2]-1)%l[1])+1)