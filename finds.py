a="func(abs(0),100,abs(0))"
c=a
tTrue=True
count=0
list1=[]
b=0
d=0
e=0
lens=len(a)
while tTrue:
    b=a.find("(",count)
    d=a.find(")",count)
    if b>-1:
       e=b
       if d>-1:
          if d<b:
              list1=list1+[d]
              if d<lens:
                  count=d+1
              else:
                  tTrue=False 
          else:
              list1=list1+[b]
              if b<lens:
                  count=b+1
       else:
           list1=list1+[b]
           if b<lens:
                  count=b+1
           else:
               tTrue=False
    else:
        if d>-1:
          
           list1=list1+[d]
           if d<lens:
              count=d+1
           else:
              tTrue=False 
        else:
            tTrue=False

print(list1)
for n in list1:
    print(a[n],end="")

print("")