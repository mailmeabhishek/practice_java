import java.io.*;
import java.util.HashMap;
import java.util.Map;

class HashMap_Class1 {

    public static void main(String args[])
    {
        // Initializing the HashMap
        // No need to mention the Generic type twice
        HashMap<Integer, String> hMap1 = new HashMap<>();
        HashMap<Integer, String> hMap2 = new HashMap<>();

        // Adding elements using put method
        hMap1.put(1, "Java");
        hMap1.put(2, "C");
        hMap1.put(3, "Python");

        hMap2.put(4, "Javascript");
        hMap2.put(5, "Kotlin");
        hMap2.put(6, "Go");

        // Printing HashMap 1
//        System.out.println("HashMap hMap1 : "
//                + hMap1);
//
//        // Printing HashMap 2
//        System.out.println("HashMap hMap2 : "
//                + hMap2);
//        HashMap<Integer, String> hMap3 = new HashMap<>(hMap1);
//        System.out.println(hMap3);
        // Iterating the map using for-each loop
        for (Map.Entry<Integer, String> m : hMap1.entrySet())
            System.out.println("Key: " + m.getKey()
                    + " Value: " + m.getValue());
    }
}


