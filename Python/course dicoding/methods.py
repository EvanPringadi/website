class Mobil:
  kecepatan = 100
  @staticmethod
  def tambah(self):
    self.kecepatan += 10
  def showKecepatan(self):
    print(self.kecepatan)
mobil_1 = Mobil()
Mobil.tambah(mobil_1)
mobil_1.showKecepatan()