import java.util.Scanner;

//average
public class Main5 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int sum = 0;
        double multi = 1;
        while (num != 0) {
            int tmp = num % 10;
            sum += tmp;
            multi *= tmp;
            num /= 10;
    }
        System.out.print("Average is "+ String.format("%.7g%n",(double) sum /6));
        System.out.println("Geometric mean is " + String.format("%.7g%n",(Math.pow(multi,  1.0/6))));
    }
}
