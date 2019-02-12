import java.util.Scanner;

//swap
public class Main7 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
       int a = scan.nextInt(), b = scan.nextInt();
        System.out.println("a = " + a + "\nb = " + b);
       a = a + b;
       b = a - b;
       a = a - b;
        System.out.println("\na = " + a + "\nb = " + b);
    }
}
