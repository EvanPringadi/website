try:
    number = int(input("Enter a number: "))
    result = 10 / number
    print(result)
except ZeroDivisionError:
    print("Cannot divide by zero.")