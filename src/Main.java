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

    // Temporary calculation: attendance percentage
    double calculateAttendance() {
        // LOCAL VARIABLE used for a temporary calculation
        double attendanceRate = (studentsAttended * 100.0) / studentsRegistered;
        return attendanceRate;
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
    }
}
