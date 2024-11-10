import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayList_Class {
    public static void main (String args[]){
        System.out.println("Array List Class..");
//        ArrayList<String> al = new ArrayList<String>();
//        al.add("Ram");
//        al.add("Mohan");
//        al.add("Sohan");
//        System.out.println(al);
//        ArrayList<String> scaler = new ArrayList<String>(
//                Arrays.asList("I",
//                        "love",
//                        "Java"));
//        System.out.println(scaler);
//        List<String> str = new ArrayList<>(
//                List.of("Coding",
//                        "is",
//                        "Fun"));
//        System.out.println("ArrayList is " + str);
        ArrayList<String> names = new ArrayList<String>();
        names.add("Raj");
        names.add("Priya");
        names.add("Shashank");
        names.add("Ansh");
        System.out.println("Before sorting, names : " + names);
//        Collections.sort(names);
//        System.out.println("After sorting, names : " + names);
        for (int i = 0; i < names.size(); i++) {
            System.out.print(names.get(i) + " ");
        }
        for(String name : names){
            System.out.println(name + " ");
        }
    }
}
