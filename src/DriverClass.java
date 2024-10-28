abstract class Factorial {

    //method declaration
    public abstract int findFactorial(int n);
}

class DriverClass extends Factorial {

    //Implementing abstract method in abstract class Temperature
    //If not implemented, it throws a Compilation error
    public int findFactorial(int n) {
        int answer = 1, i;
        for (i = 2; i <= n; i++) answer *= i;
        return answer;
    }

    // Driver method
    public static void main(String[] args) {
        Factorial obj = new DriverClass();
        String result1;
        int result = obj.findFactorial(7);
        System.out.println("7! is equal to : " + result);
        int x =8;
        int y = 1;
        result1 = x > y ? "x is greater than y" : "y is greater than or equal to y";
        System.out.println(result1);
    }
}
