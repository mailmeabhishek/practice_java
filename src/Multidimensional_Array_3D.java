public class Multidimensional_Array_3D {
    public static void main(String[] args) {
        int totalStudents = 3;
        int subjects = 4;
        int totalSemesters = 2;
        // Data of Student 1
        int[][] Student1 = {
                { 87, 79, 91, 88 },
                { 92, 80, 86, 91 }
        };
        // Data of Student 2
        int[][] Student2 = {
                { 80, 75, 66, 74 },
                { 81, 89, 70, 83 }
        };
        // Data of Student 3
        int[][] Student3 = {
                { 98, 88, 94, 95 },
                { 99, 93, 96, 97 }
        };
        // array for storing data of all three students
        int[][][] studentArray = new int[totalStudents][totalSemesters][subjects];
        // storing data of students into 3D array
        studentArray[0] = Student1;
        studentArray[1] = Student2;
        studentArray[2] = Student3;
        // an element of the student Array is a 2D array containing information of each
        // student
        for (int i = 0; i < totalStudents; i++) {
            System.out.println("Student " + (i + 1) + ":-"); // printing student number
            for (int j = 0; j < totalSemesters; j++) {
                // for each student printing all semesters and their scores in it
                System.out.println("Semester " + (j + 1) + ":");

                for (int k = 0; k < subjects; k++) {
                    System.out.print(studentArray[i][j][k] + " ");
                    // i = student number, j = semester, k = subject number
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}
