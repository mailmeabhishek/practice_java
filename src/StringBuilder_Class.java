public class StringBuilder_Class {
    public static void main(String args[]){
        System.out.println("StringBuilder_Class");
        StringBuilder sb = new StringBuilder("String");
//        sb.append("Hello");
//        System.out.println(sb);
       // System.out.println(sb.appendCodePoint(69));
        StringBuffer m=new StringBuffer("Scaler");
        StringBuffer n=new StringBuffer("Scaler");
        System.out.println(m.hashCode());
        System.out.println(n.hashCode());
        System.out.println(m.equals(n));
        System.out.println(sb.getClass());
        System.out.println(m.reverse());
    }
}
