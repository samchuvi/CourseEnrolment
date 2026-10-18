# IUEA Course Enrolment Tracker

**Course:** BIT2115 – Java Programming
**Task:** Java Variable Types
**Student:** Chuvi Samuel (25/505/BIT-S)

A small Java program that tracks student enrolment for different courses at IUEA.
Each course stores its own name and number of registered students, while the
university keeps a running total of students across all courses.

## Variable types demonstrated

| Type | Examples in the code | Behaviour |
|------|----------------------|-----------|
| Local variables | `attendanceRate`, `passRate`, `remark`, `oldCount`, `averagePerCourse` | Exist only while their method runs; used for temporary calculations |
| Instance variables | `courseName`, `studentsRegistered`, `studentsAttended`, `studentsPassed` | Each `Course` object has its own copy |
| Static variables | `totalStudents`, `totalCourses`, `universityName` | One copy shared by all `Course` objects |

## How to run

```bash
cd src
javac Main.java
java Main
```

Or open the project in IntelliJ IDEA and run `Main.main()`.

## Branches

| Branch | Work done |
|--------|-----------|
| `main` | Project setup and the `Course` class with instance variables |
| `feature/static-variables` | Static variables and university-wide statistics |
| `feature/local-calculations` | Attendance and pass-rate calculations using local variables |
| `feature/course-objects` | Creating three course objects and displaying their statistics |
| `feature/variable-demo` | Registering students to show how each variable type behaves |
