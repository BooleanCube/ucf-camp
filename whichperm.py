import itertools

t=int(input())
for m in range(t):
    n=int(input())
    s=list(range(n))
    ps = itertools.permutations(s)
    l=list(map(int,input().split()))
    res = []
    for i in ps:
        wo = True
        for j in range(1, len(i)):
            if abs(i[j]-i[j-1]) != l[j-1]:
                wo=False
                break
        if wo: res.append(" ".join(map(str,i)))
    print(sorted(res)[0] if len(res) > 0 else "impossible")