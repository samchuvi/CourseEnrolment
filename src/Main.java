class Course {

    // ===== STATIC VARIABLES (shared across all Course objects) =====
    static int totalStudents = 0;          // total students in all courses combined
    static int totalCourses = 0;           // how many course objects have been created
    static String universityName = "IUEA";

    // ===== INSTANCE VARIABLES (unique to each Course object) =====
    String courseName;
    int studentsRegistered;
    int studentsAttended;   // students who attended the last session
    int studentsPassed;     // students who passed the last exam

    // Constructor
    Course(String courseName, int studentsRegistered,
           int studentsAttended, int studentsPassed) {
        this.courseName = courseName;
        this.studentsRegistered = studentsRegistered;
        this.studentsAttended = studentsAttended;
        this.studentsPassed = studentsPassed;

        // update the shared (static) variables every time a new course is created
        totalStudents += studentsRegistered;
        totalCourses++;
    }

    // Registers more students into THIS course only
    void registerStudents(int newStudents) {
        // LOCAL VARIABLE: only exists inside this method
        int oldCount = studentsRegistered;

        studentsRegistered += newStudents;   // changes only this object's copy
        totalStudents += newStudents;        // changes the shared total for everyone

        System.out.println(newStudents + " student(s) added to " + courseName
                + " (" + oldCount + " -> " + studentsRegistered + ")");
    }

    // Temporary calculation: attendance percentage
    double calculateAttendance() {
        // LOCAL VARIABLE used for a temporary calculation
        double attendanceRate = (studentsAttended * 100.0) / studentsRegistered;
        return attendanceRate;
    }

    // Temporary calculation: pass percentage
    double calculatePassRate() {
        // LOCAL VARIABLE used for a temporary calculation
        double passRate = (studentsPassed * 100.0) / studentsRegistered;
        return passRate;
    }

    // Displays statistics for this individual course
    void displayCourseStats() {
        // LOCAL VARIABLES: created when the method is called, destroyed when it ends
        double attendance = calculateAttendance();
        double passRate = calculatePassRate();
        String remark;

        if (passRate >= 70) {
            remark = "Excellent performance";
        } else if (passRate >= 50) {
            remark = "Good performance";
        } else {
            remark = "Needs improvement";
        }

        System.out.println("Course Name        : " + courseName);
        System.out.println("Students Registered: " + studentsRegistered);
        System.out.println("Students Attended  : " + studentsAttended);
        System.out.println("Students Passed    : " + studentsPassed);
        System.out.printf ("Attendance Rate    : %.2f%%%n", attendance);
        System.out.printf ("Pass Rate          : %.2f%%%n", passRate);
        System.out.println("Remark             : " + remark);
        System.out.println("--------------------------------------------");
    }

    // Static method: displays university-wide statistics (uses only static variables)
    static void displayUniversityStats() {
        // LOCAL VARIABLE inside a static method
        double averagePerCourse = (double) totalStudents / totalCourses;

        System.out.println("========== " + universityName
                + " UNIVERSITY-WIDE STATISTICS ==========");
        System.out.println("Total Courses               : " + totalCourses);
        System.out.println("Total Students (all courses): " + totalStudents);
        System.out.printf ("Average Students per Course : %.2f%n", averagePerCourse);
        System.out.println("=====================================================");
    }
}

public class Main {

    public static void main(String[] args) {

        System.out.println("     IUEA STUDENT ENROLMENT TRACKING SYSTEM");
        System.out.println("============================================\n");

        // Creating three Course objects - each gets its OWN instance variables
        Course c1 = new Course("Java Programming (BIT2115)", 60, 54, 45);
        Course c2 = new Course("Database Systems", 45, 38, 30);
        Course c3 = new Course("Computer Networks", 50, 40, 22);

        // ---- Individual course statistics ----
        System.out.println(">>> INDIVIDUAL COURSE STATISTICS\n");
        c1.displayCourseStats();
        c2.displayCourseStats();
        c3.displayCourseStats();

        // ---- University-wide statistics (static) ----
        System.out.println();
        Course.displayUniversityStats();
    }
}
