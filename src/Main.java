class Course {

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
    }
}

public class Main {

    public static void main(String[] args) {

        System.out.println("     IUEA STUDENT ENROLMENT TRACKING SYSTEM");
        System.out.println("============================================\n");
    }
}
