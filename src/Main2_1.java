import java.util.Scanner;

class Main2_1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double kg = scan.nextDouble();
        boolean right = true;

        while (right) {
            if (kg < 0 ) {
                System.out.println("Mass might be positive");
                kg = scan.nextInt();
            }
            else right = false;
        }
        System.out.println("mg = " + kg*1000000);
        System.out.println("tons = " + kg/1000);
        System.out.println("g = " + kg*1000);


    }

}

