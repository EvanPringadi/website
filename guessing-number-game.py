import random

def guess_game():
  random_number = random.randint(1,100)
  guesses = 0
  previous_guesses = set()

  while True:
    guess = int(input("Guess a number in range of 1 to 100: "))
    guesses += 1

    if guess in previous_guesses:
      print("You've already guessed that number!")
    
    previous_guesses.add(guess)

    if guess == random_number:
      print("Congratulations! You guessed the number in", guesses, "guesses.")
      break
    elif guess < random_number:
      print("Too low!")
    else:
      print("Too high!")
    
def intro():
  while True:
    answer = input("Do You Want To Guess A Number? (Y/N)")
    if answer == "Y" or "Yes":
      guess_game()
      if not playAgain():
        break
    elif answer == "N" or "No":
      print("Bye! Have a Nice Day!")
      break
    else:
      print("Input Invalid")
    

def playAgain():
  while True:
    answer = input("Do You Want To Play Again? (Y/N)")
    if answer == "Y" or "Yes":
      return True
    elif answer == "N" or "No":
      print("Bye! Have a Nice Day!")
      return False
    else:
      print("Input Invalid")
    
intro()

