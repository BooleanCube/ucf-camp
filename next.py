t=int(input())
alphabet="ABCDEFGHIJKLMNOPQRSTUVWXYZ"
for m in range(t):
    s=input()
    r=""
    if s[2]=="Z":
        r=r+"A"
        if s[1]=="Z":
            r=r+"A"
            if s[0]=="Z":
                r=r+"A"
            else: r=chr(ord(s[0])+1)+r
        else: r=s[:1]+chr(ord(s[1])+1)+r
    else: r=s[:2]+chr(ord(s[2])+1)
    print(r)