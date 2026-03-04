import java.util.Scanner;

public class ReverseInteger {

    public static int reverse(int x) {
        int reverse = 0;

        while (x != 0) {
            int rem = x % 10;

            if ((Integer.MAX_VALUE / 10 < reverse) ||
                (Integer.MAX_VALUE / 10 == reverse && rem > 7)) {
                return 0;
            }

            if ((Integer.MIN_VALUE / 10 > reverse) ||
                (Integer.MIN_VALUE / 10 == reverse && rem < -8)) {
                return 0;
            }

            reverse = reverse * 10 + rem;
            x = x / 10;
        }

        return reverse;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int input = sc.nextInt();

        int result = reverse(input);

        System.out.println("Reversed Integer: " + result);

       
    }
}