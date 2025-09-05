class OnlineCourse:
    def __init__(self,course, instructor):
        self.course = course
        self.instructor = instructor
        self.students = []

    def enroll_students(self, name):
        self.students.append(name)
        print(f"{name} has been enrolled in the {self.course} course")

    def course_details(self):
        print(f"course: {self.course}")
        print(f"instructor: {self.instructor}")
        print(f"Enrolled students:{','.join (self.students)}")


    def completed_course(self, name):
        if name in self.students:
            self.students.remove(name)
            print(f"{name} has been completed {self.course} course")

        else:
            print(f"{name} has not been enrolled in the {self.course} course")

    def avg_grade(self,grades):
        total = sum(grades)
        average = total / len(grades)
        print(f"the average grade is: {average}")


course_input = input("Enter course name : ").lower()
name = input("enter a instructor name : ").lower()
student = input("enter a student name : ").lower()



course = OnlineCourse(course_input, name)
grades = [90, 85, 92, 78, 80]
course.avg_grade(grades)
course.enroll_students(name)
course.course_details()
course.completed_course("josh")

