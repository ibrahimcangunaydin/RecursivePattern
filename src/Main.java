import java.util.Scanner;

public class Main {

    static int Pattern(int n, int counter, int reverse) {

        System.out.print(n + " ");

        if (n <= 0 && reverse == 0) {
            reverse = 1;
            if (counter == 0) {
                return 0;
            } else {
                return Pattern(n + 5, counter - 1, reverse);
            }
        } else if (reverse == 1 && counter != 0) {
            return Pattern(n + 5, counter - 1, reverse);
        } else if (reverse == 1) {
            return 1;
        } else {
            return Pattern(n - 5, counter + 1, reverse);
        }

    }

    public static void main(String[] args) {

        int n, counter = 0, reverse = 0;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the N value: ");
        n = scan.nextInt();

        Pattern(n, counter, reverse);
    }
}
