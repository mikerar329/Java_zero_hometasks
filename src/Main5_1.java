import java.util.Scanner;

//average
public class Main5_1 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        boolean right = true;

        while (right) {
            if (num < 100000 || num > 999999) {
                System.out.println("Number is not six-digit");
                num = scan.nextInt();
            } else {
                right = false;
            }
        }
        int sum = 0;
        double multi = 1;
        while (num != 0) {
            int tmp = num % 10;
            sum += tmp;
            multi *= tmp;
            num /= 10;
        }
        System.out.print("Average is " + String.format("%.7g%n", (double) sum / 6));
        System.out.println("Geometric mean is " + String.format("%.7g%n", (Math.pow(multi, 1.0 / 6))));
    }
}
