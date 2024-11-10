import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMap_Class {
    public static void main(String args[]){
//        HashMap<Integer,Double> hm = new HashMap<Integer,Double>();
//        hm.put(1,1.9);
//        hm.put(2,2.8);
//        hm.put(3,3.7);
//        System.out.println(hm);
        HashMap<Integer, String> student = new HashMap<>();
        student.put(20011, "Jack LongBottom");
        student.put(20013, "Harry Potter");
        student.put(20016, "Julia George");
        student.put(20017, "Tom Lucia");
        student.put(20025, "Petter Cruz");
        System.out.println("Student Data : " + student);
        Set hashmapSet = student.entrySet();
        Iterator iter = hashmapSet.iterator();
        while (iter.hasNext()){
            Map.Entry mapEntry = (Map.Entry) iter.next();
            System.out.println("Student ID: " + mapEntry.getKey() + "\tStudnetName: " + mapEntry.getValue());
        }
    }
}
