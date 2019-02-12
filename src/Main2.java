import java.util.Scanner;

class Main2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double kg = scan.nextDouble();
        System.out.println("mg = " + kg*1000000);
        System.out.println("tons = " + kg/1000);
        System.out.println("g = " + kg*1000);


    }

}

