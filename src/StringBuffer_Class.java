public class StringBuffer_Class {
    public static void main(String args[]){
        System.out.println("StringBuffer Class");
        StringBuffer sb = new StringBuffer("String");
        sb.append("Hello");
        System.out.println(sb);
        System.out.println(sb.appendCodePoint(69));
        StringBuffer m=new StringBuffer("Scaler");
        StringBuffer n=new StringBuffer("Scaler");
        System.out.println(m.hashCode());
        System.out.println(n.hashCode());
        System.out.println(m.equals(n));
        System.out.println(sb.getClass());
    }
}
