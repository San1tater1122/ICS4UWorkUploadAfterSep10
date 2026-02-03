# Q1
print("----------------------------------Q1----------------------------------")
class Movie:
    def __init__(self, title, rating):
        self.__title = title
        self.__rating = rating

    def get_title(self):
        return self.__title

    def get_rating(self):
        return self.__rating

    def set_title(self, title):
        self.__title = title

    def set_rating(self, rating):
        self.__rating = rating

movie1 = Movie("movie", "5.0")
print("Title:", movie1.get_title())
print("Rating:", movie1.get_rating())

# Q2
print("------------------------------Q2--------------------------------------")
class Wallet:
    def __init__(self, balance):
        self.__balance = max(0, balance)
        if balance <= 0:
            print("Balance can not be less than 0, auto setting to 0")

    def get_balance(self):
        return self.__balance

myWallet = Wallet(-10)
print(myWallet.get_balance())
myWallet = Wallet(10)
print(myWallet.get_balance())

# Q3 and Q4
print("-------------------------------Q3/Q4-------------------------------------")
class Instrument:
    def __init__(self):
        pass

    def play(self):
        print(f"music played by {self.name}")

class Guitar(Instrument):
    def play(self):
        print("Guitar sound~")

    def tune(self):
        print("Tuning the guitar")

guitar = Guitar()
guitar.play()
guitar.tune()

# Question 5 has error, so we dont have to do it.
# 6 and 7
print("-------------------------------Q6/Q7-------------------------------------")
class Transport:
    def move(self):
        print("The transport is moving")


class Bus(Transport):
    def move(self):
        print("Bus driving on road")


class Train(Transport):
    def move(self):
        print("Train moving on track")

transports = [Bus(), Train()]
for trans in transports:
    trans.move()

# 8
print("-------------------------------Q8-------------------------------------")
class GameCharacter:
    def attack(self):
        print("character attack.")


class Hero(GameCharacter):
    def defend(self):
        print("hero defend.")


class Wizard(Hero):
    def cast_spell(self):
        print("wizard casts a spell.")

wizard = Wizard()
wizard.attack()
wizard.defend()
wizard.cast_spell()

# 9
print("-------------------------------Q9-------------------------------------")
class Circle:
    def __init__(self, radius):
        self.__radius = radius
        if radius > 0:
            self.__radius = radius
        elif radius != 0:
            radius = radius * (-1) # make it positive
            self.__radius = radius
        else:
            radius = 1
            self.__radius = radius

    def get_radius(self):
        return self.__radius

    def set_radius(self, radius):
        if radius > 0:
            self.__radius = radius
        elif radius != 0:
            radius = radius * (-1) # make it positive
            self.__radius = radius
        else:
            radius = 1
            self.__radius = radius

    def area(self):
        return 3.1415926 * (self.__radius ** 2)

circle = Circle(5)
print("Radius:", circle.get_radius())
print("Area:", circle.area())
circle.set_radius(10)
print("Updated Radius:", circle.get_radius())
print("Updated Area:", circle.area())

# Q10
print("-------------------------------Q10-------------------------------------")
class Shape:
    def __init__(self, color):
        self.__color = color

    def get_color(self):
        return self.__color

    def set_color(self, color):
        self.__color = color

    def area(self):
        print("Calculating area for generic shape")
        return 0

class Circle(Shape):
    def __init__(self, radius, color):
        super().__init__(color)
        self.__radius = radius

    def get_radius(self):
        return self.__radius

    def set_radius(self, radius):
        if radius > 0:
            self.__radius = radius
        else:
            print("Radius must be positive.")

    def area(self):
        return 3.14 * (self.__radius ** 2)

class Square(Shape):
    def __init__(self, side, color):
        super().__init__(color)
        self.__side = side

    def get_side(self):
        return self.__side

    def set_side(self, side):
        if side > 0:
            self.__side = side
        else:
            print("Side must be positive.")

    def area(self):
        return self.__side ** 2


shapes = [Circle(5, "Red"), Square(4, "Blue")]
for shape in shapes:
    print(f"Shape color: {shape.get_color()}, Area: {shape.area()}")