""" #this is a comment
print('hello')

msg = "good afternoon!"
print(msg)
print(type(msg))

name = input("Enter your name: ")
print("Hello, " + name + "!")

age = int(input("Enter your age: "))
if age > 16:
  print("You are allowed to drive")
else:
  print("You are not allowed to drive")
""" 

"""
bedroom = ["Table", "Chair", "Bed"]
livingroom = ["Coffee table", "Sofa", "Television", "Painting"]

for furniture in bedroom:
  print(furniture)

count = 0
while count < 6:
  print(count)
  count +=1

def countFurniture(array):
  count = 0
  for furniture in array:
    count +=1
  return count
print(countFurniture(bedroom))
print(countFurniture(livingroom))
"""
"""
fruits = ["apple", "strawberry", "pineapple", "grapes"]
print(fruits[2])

def findIndex(array, word):
  for i, element in enumerate(array): 
    if element == word:
      return i
  return -1
fruit = input("Enter fruit: ")
print(findIndex(fruits, fruit))
"""

my_pencil_case = [{
  "name": "pencil",
  "quantity": 2
}, {
  "name": "pen",
  "quantity": 1
}, {
  "name": "eraser",
  "quantity": 3
}]

def find_total_quantity(array):
  total_quantity = 0
  for i, stationary in enumerate(array):
    total_quantity += stationary["quantity"]
  return total_quantity
print(find_total_quantity(my_pencil_case))
      