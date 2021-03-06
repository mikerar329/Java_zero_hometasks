import java.util.Scanner;

class Main3_1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double r1 = scan.nextDouble(), r2 = scan.nextDouble(), s;

        while (r1 <= 0 || r2 <= 0) {
            if (r1 <= 0) {
                System.out.println("Radius r1 might be positive");
                r1 = scan.nextDouble();
            }
            if (r2 <= 0) {
                System.out.println("Radius r2 might be positive");
                r2 = scan.nextDouble();
            }
        }

        if (r2 > r1) {
            double tmp = r1;
            r1 = r2;
            r2 = tmp;
        }
        s = Math.PI * (r1 * r1 - r2 * r2);
        System.out.println(String.format("%.7g%n", s));

    }
}


