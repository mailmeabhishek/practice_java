class Student1 {
    Student1(int id, String name) {
        System.out.println("Student ID is "+ id + " and name is "+ name );
    }
}

public class Test {
    public static void main (String args){
    Student1 obj[] = new Student1[3];

    obj[0] = new Student1(1,"Bharat");
    obj[1] = new Student1(5, "Vivian");
    obj[2] = new Student1(6,"Smith") ;
    }
}
