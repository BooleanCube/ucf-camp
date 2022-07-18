t = int(input())
for m in range(t):
	target,skip = map(int,input().split())
	step = 0
	while target > 0:
		x=0
		while skip*(10**x) <= target:
			x+=1
		if x == 0:
			step += target
			target = 0
		else:
			step += 1
			target -= skip*(10**(x-1))
	print(step)