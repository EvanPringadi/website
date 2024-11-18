contoh_list = [1, 3, 3, 5, 5, 5, 7, 7, 9]

print(contoh_list)
print(len(contoh_list)) #same as .length()

contoh_set = set([1, 3, 3, 5, 5, 5, 7, 7, 9])

print(contoh_set) #set is same as object in JS
print(len(contoh_set)) #unique, different than list

contoh_string = "Belajar Python"

print(contoh_string)
print(len(contoh_string)) #total character in the string

angka = [13, 7, 24, 5, 96, 84, 71, 11, 38, 5, 5]
print("minimal: " + str(min(angka)))
print("maximal: " + str(max(angka)))
print("jumlah angka 5 di angka[] adalah " + str(angka.count(5)))

string = "jumlah huruf a di kalimat ini ada tujuh a"
substring = "a"
print(string.count(substring))

kalimat = "Belajar Python di Dicoding sangat menyenangkan"
print('Dicoding' in kalimat)
print('tidak' in kalimat)
print('Dicoding' not in kalimat)
print('tidak' not in kalimat)

data = ['shirt', 'white', 'L']
apparel, color, size = data #shortcut

print(data)
print(apparel)
print(color)
print(size)

kendaraan = ['motor', 'mobil', 'helikopter', 'pesawat']
kendaraan.sort() #based on the alphabet
print(kendaraan)

kendaraan.sort(reverse=True) 
print(kendaraan)
#.sort() cannot do sorting with int between str

#.sort akan mendahulukan Uppercase dulu sebelum lowercase
# Case diurutkan dahulu, lalu alphabet



