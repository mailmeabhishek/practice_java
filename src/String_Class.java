public class String_Class {
    public static void main(String args[]){
        String str1 = "  Hello  ";
        String str2 = "K1mnOPQ";
        String str3 = "KeyBoard";
        int number = 45;

        System.out.println("str1 = " + str1);
        System.out.println("str2 = " + str2);
        System.out.println("str3 = " + str3);
        System.out.println("number = " + number + "\n");

        System.out.println("str1.trim(): " + str1.trim());
        System.out.println("str2.toUpperCase(): " + str2.toUpperCase());
        System.out.println("str2.toLowerCase(): " + str2.toLowerCase());

        char[] key = str3.toCharArray();
        for(char i : key) System.out.print(i + " ");
        System.out.println();

        System.out.println("String.valueOf(number): " + String.valueOf(number));
        System.out.println("str3.startsWith(\"Key\"): " + str3.startsWith("Key"));

        System.out.println("str3.endsWith(\"Boar\"): " + str3.endsWith("Boar"));

        System.out.println("str3.isEmpty(): " + str3.isEmpty());
    }
}
