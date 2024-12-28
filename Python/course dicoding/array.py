angka = [2, 4, 6, 8]
huruf = ['P', 'Y', 'T', 'H', 'O', 'N']
gabung = angka + huruf
print(gabung)
"""
Output:
[2, 4, 6, 8, 'P', 'Y', 'T', 'H', 'O', 'N']
"""


learn = ['P', 'Y', 'T', 'H', 'O', 'N']
replikasi = learn * 2
print(replikasi)
"""
Output:
['P', 'Y', 'T', 'H', 'O', 'N', 'P', 'Y', 'T', 'H', 'O', 'N']
"""
for i in range(10):
  print()


nums = [2, 3, 6, 8, 10]

for num in nums:
 if num == 6:
    print("hello")
else:
  print("hi")


var_dict = {"rata_rata": "3"}

try:
    print(f"rata-rata adalah {var_dict['rata_rata']}")
except KeyError:
    print("Key tidak ditemukan.")
except TypeError:
    print("Anda tidak bisa membagi nilai dengan tipe data string")
else:
    print("Kode ini dieksekusi jika tidak ada exception.")

#KeyError jika property key tidak ditemukan misal "jumlah"
#TypeError jika salah data type (misal dibagi)

var_list = [1,2,3]
for elemen in var_list:
    print(id(elemen))


var_arr = [9 for i in range(10)]
print(var_arr)
"""
Output:
[9, 9, 9, 9, 9, 9, 9, 9, 9, 9]
"""

var_array = [i for i in range(101)]
total = 0
for number in var_array:
  total += number
result = total / 101
print(result)


var_arr = [1, 2, 3, 4, 5]
for i in range(len(var_arr)):
    current_element = var_arr[i]
    next_index = i+1
    
    if next_index < len(var_arr):
        next_element = var_arr[next_index]
    else:
        next_element = None
        
    print(f"Current element: {current_element}, next elements: {next_element}")
"""
Output:
Current element: 1, next elements: 2
Current element: 2, next elements: 3
Current element: 3, next elements: 4
Current element: 4, next elements: 5
Current element: 5, next elements: None
"""

var_arr = [1, 7, 2, 89, 3]
left_pointer = var_arr[0]

for i in range(1, len(var_arr)):
    right_pointer = var_arr[i]
    if right_pointer > left_pointer:
        left_pointer = right_pointer

print(left_pointer)

