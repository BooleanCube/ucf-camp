def replace(s):
	r=[]
	for c in s:
		if c!='.' and c!=',': r.append(c.lower())
	return "".join(r)
	
letter = {}
def solve(w):
    for word in set(w): letter[word]=0
    m=0
    maxs = []
    for word in w:
        letter[word]+=1
        a=letter[word]
        if a==m: maxs.append(word)
        elif a>m:
            m=a
            maxs=[word]
    return [sorted(maxs)[0], m]

t=int(input())
for m in range(t):
    l=int(input())
    p=l*0.1
    w=replace(input()).split()
    letter = {}
    b = solve(w)
    print(b[0] if b[1]>=p else "Looks good!")