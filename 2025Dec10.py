
# Write a program that asks for a user’s name and prints a greeting.
import time

username = input("name? ")
print("How terrifying are low-key hackers? I know your name is", username)

# Create two variables, add them, and print the result
var1 = int(input("var1: ")) # create
var2 = int(input("var2: ")) # two variable
result = var1 + var2 # add them
print("The result", "is", result) # print "The result" :)

# Write an if-statement to check if a number is positive.
if result >= 0:
    print("It is positive.")
else:
    print("It is not positive")
time.sleep(2) # sleep for 2 second to let you see the result
# Create a list of 5 items and print the third one
five_item_list = [1, 2, 3, 4, 5]
print(five_item_list[2]) # the third one in the list have an index of 2

time.sleep(2) # sleep for 2 second to let you see the result
# Write a loop that prints numbers 1 to 10
for i in range(0, 10):
    print(i+1)
