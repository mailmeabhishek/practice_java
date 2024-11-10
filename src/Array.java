import java.util.Arrays;

public class Array {
    public static void main(String args[])
    {
        //asList method
//        Integer arr[] = {10,20,11,21,31};
//        for(Integer i : arr){
//            System.out.println(i);
//        }
//        List<Integer> arrList = Arrays.asList(arr);
//        System.out.println(arrList);

        //binarySearch method
  int arr[] = {10,47,21,11,27,31};
  //sort method
        Arrays.sort(arr);
        System.out.println("Sorted Array : " + Arrays.toString(arr));
//        int key = 31;
//        System.out.println(key + " " + Arrays.binarySearch(arr,key));

        //copyOf Method and copyOfRange Method
        System.out.println("Integer Array is : " + Arrays.toString(arr));
//        System.out.println("Integer Arrays is : " + Arrays.toString(Arrays.copyOf(arr, 10)));
        System.out.println("Integer Arrays with range is : " + Arrays.toString(Arrays.copyOfRange(arr, 2,4)));
        System.out.println(("Hash Code of Array : " + Arrays.hashCode(arr)));
    }
}

