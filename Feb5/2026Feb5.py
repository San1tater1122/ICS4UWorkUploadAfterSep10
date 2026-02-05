class SchoolUser:
    def get_role(self):
        print("I am a school user.")

class Student(SchoolUser):
    def get_role(self):
        print("I am a student.")


class Teacher(SchoolUser):
    def get_role(self):
        print("I am a teacher.")

student1 = Student()
teacher1 = Teacher()
users = [student1, teacher1]

for user in users:
    user.get_role()

# Student and Teacher, the two different object use the same method "get_role()" but produce different outputs.
# So this demonstrates polymorphism
