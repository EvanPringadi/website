a = [1, 2.2, "Dicoding"] #list
b = (1, "Dicoding", 1+3j) #tuple (tidak dapat diubah)
c = {1, 2, 3 , 7, 13} #set
d = { 'name': 'Perseus Evans', 'age': 20, 'isMarried': False } #Dictionary

# int ke float     float()
# float ke int     int()
# int ke str       str()

#Transformasi Uppercase Lowercase
#Mengubah string menjadi UPPERCASE atau lowercase.
#upper()
#lower()

#Menghapus karakter whitespace pada suatu string.
#rstrip() case-sensitive
#lstrip() case-sensitive
#strip()
#startswith()
#endswith()

print(b[1].lstrip("Di"))

#Fungsi-fungsi untuk memisahkan dan menggabungkan string.
#join()
#split()

#Metode yang bertujuan untuk mengganti elemen string dengan elemen string lainnya.
#replace()

#Fungsi-fungsi yang bertujuan untuk melakukan pengecekan pada string dan mengembalikan nilai Boolean.
#isupper()
#islower()
#isalpha()
#isalnum()
#isdecimal()
#isspace()
#istitle()

#Fungsi-fungsi untuk pemformatan string.
#zfill()
#rjust()
#ljust()
#center()

#   \' Single quote
#   \" Double quote
#   \t Tab
#   \n Newline (line break)
#   \\ Backslash
print(r'Dicoding\tIndonesia') #rawstring

