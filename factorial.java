public class factorial {
    public static void main(String[] args) {
        int n = 5;
        int fact = 1;
        int i = 1;

        while(i <= n) {
            fact *= i;
            i++;
        }

        System.out.println("Factorial of " + n + " is: " + fact);
    }
}

