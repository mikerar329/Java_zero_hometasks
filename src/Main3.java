import java.util.Scanner;

class Main3  {
    public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            double r1 = scan.nextDouble(), r2 = scan.nextDouble(), s;
        if (r2>r1) {
            double tmp = r1;
            r1 = r2;
            r2 = tmp;
        }
            s = Math.PI*(r1*r1-r2*r2);
        System.out.println(String.format("%.7g%n", s));


    }

}
