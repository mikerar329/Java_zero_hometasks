import java.util.Scanner;

class Main1_1 {
    public static void main(String[] args) {
        nums();
    }

    public static int nums() {
        try {
            Scanner scan = new Scanner(System.in);
            int a = scan.nextInt(), b = scan.nextInt(), c = scan.nextInt();
            if (a == b && b == c) {
                System.out.println("Все числа равны");
            } else if (a != b && a != c && b != c) {
                System.out.println("Все числа различны");
            } else {
                System.out.println("Не все числа равны");
            }
        } catch (Exception ex) {
            System.out.println("Error");
            return -1;
        }
        return 0;
    }

}
