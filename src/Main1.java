class Student {

    private int enrollmentNumber;
    private String name;
    private String courseName;
    private int score;

    public Student(
            int enrollmentNumber,
            String name,
            String courseName,
            int score
    ) {
        this.enrollmentNumber = enrollmentNumber;
        this.name = name;
        this.courseName = courseName;
        this.score = score;
    }

    public String getCourseName() {
        return this.courseName;
    }

    public int getScore() {
        return this.score;
    }

    public int getEnrollmentNumber() {
        return this.enrollmentNumber;
    }

    public String getName() {
        return this.name;
    }
}

public class Main1 {

    public static void main(String[] args) {
        String ob1 = new String("Computer Science");
        String ob2 = new String("Computer Science");
        Student firstStudent = new Student(101345, "Amit", "Mathematics", 100);
        Student secondStudent = new Student(101365, "Amit", ob1, 90);
        Student thirdStudent = new Student(101365, "Amit", ob2, 100);

        System.out.println(
                secondStudent.getCourseName() == thirdStudent.getCourseName()
        );
    }
}
