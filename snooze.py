import sys

t = int(input())
for m in range(t):
    n,l = map(int, sys.stdin.readline().split())
    w = list(map(int, sys.stdin.readline().split()))
    w.sort()
    dif = [w[i]-w[i-1]-1 for i in range(1, len(w))]
    cmap = {}
    for i in set(dif): cmap[i]=0
    for i in dif: cmap[i]+=1
    c = -1
    o=0
    seet = sorted(set(dif), reverse=True)
    for i in seet:
        o += cmap[i]
        v = o*i
        c=max(c,v)
    print(c)