a = True
a = not a
print(a)

b = 6
b -= 1
print(b)

c = 6
c += 1
print(c)

d = 10
print(-d)

print(True or False)

print(11//2) #pembagian bulat || pembagian int
print(11/2) #pembagian desimal || pembagian float
print(11**2) #pangkat
"""
Output:
False
5
7
-10
True
5
5.5
121
"""
print()
# < > <= >= == != pada string membandingkan unicode pada huruf pertama/character yang berbeda
# spasi/kosong < huruf
print("hello" >= "hei")
print("hei" >= "heii")
"""
Output: 
True
False
"""
# unicode l >= i

#  +=
#  -=
#  *=
#  /=
#  %=

x = 3
y = 5
z = 7

x,y = y,x
print(x,y)
# 5 3
x,y,z = z, x, y
print(x, y, z)
# 7 5 3

