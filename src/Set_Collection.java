import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Set_Collection {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        set.add(4);
        set.add(7);
        set.add(-2);
        System.out.println("set: " + set);
//        System.out.println(set.hashCode());
//        System.out.println(set.isEmpty());
//        set.clear();
//        System.out.println(set.isEmpty());
//        Iterator< Integer > it = set.iterator();
//        it.next();
//        it.remove();
//
//        System.out.println("set after remove: " + set);
//        System.out.println("Iterating set: ");
//        while (it.hasNext()) {
//            System.out.print(it.next() + " ");
//        }
        System.out.println(set.size());
    }
}
