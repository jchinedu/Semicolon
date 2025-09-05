class OnlineCourse:
    def __init__(self,course, instructor):
        self.course = course
        self.instructor = instructor
        self.students = []

    def enroll_students(self, student):
        self.students.append(name)
        print(f"{student.name} has been enrolled in the {self.course} course")

    def course_details(self):
        print(f"course: {self.course}")
        print(f"instructor: {self.instructor}")
        print(f"Enrolled students:")
        for student in self.students:
            print(student.name)


    def completed_course(self, name):
        for student in self.students:
            if student.name in name:
             self.students.remove(student)
             print(f"{name} has been completed {self.course} course")
        print(f"{name} has not been enrolled in the {self.course} course")

    def avg_grade(self, grades):
        numeric_grades = [float(grade) for grade in grades]
        total = sum(numeric_grades)
        average = total / len(student.grades)
        print(f"the average grade is: {average}")


course_input = input("Enter course name : ").lower()
name = input("enter a instructor name : ").lower()
student = input("enter a student name : ").lower()



course = OnlineCourse(course_input, name)
# grades = [90, 85, 92, 78, 80]
# course.avg_grade(grades)
# course.enroll_students(name)
# course.course_details()
# course.completed_course("josh")

class Student:
    def __init__(self, name, grades):
        self.name = name
        self.grades = grades

non_students = int(input("enter number of students: "))

for _ in range(non_students):
    student_name = input("enter a student name: ").lower()
    grades = []
    for _ in range(3):
        grade = input("enter a grade: ")
        grades.append(grade)
    student = Student(student_name, grades)
    course.enroll_students(student)
    course.avg_grade(grades)
course.course_details()





