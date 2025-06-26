public class MaxOfThree {
    public static void main(String[] args) {
        int a = 10, b = 25, c = 15;

        if (a >= b && a >= c) {
            System.out.println("Maximum is: " + a);
        } else if (b >= a && b >= c) {
            System.out.println("Maximum is: " + b);
        } else {
            System.out.println("Maximum is: " + c);
        }
    }
}
