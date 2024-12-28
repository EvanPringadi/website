class Mobil:
  def __init__(self):
    self.nama = "Jesko"

mobil_1 = Mobil()
print(mobil_1.nama)

class MobilDicoding:
    def __init__(self, warna, merek, kecepatan):
        self.warna = warna
        self.merek = merek
        self.kecepatan = kecepatan
        
mobil_2 = MobilDicoding('Merah', 'DicodingCar', 160)
print(mobil_2.warna)
print(mobil_2.merek)
print(mobil_2.kecepatan)

