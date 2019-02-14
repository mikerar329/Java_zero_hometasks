import java.util.Arrays;
import java.util.Scanner;

import static java.sql.JDBCType.NULL;

//reverse
public class Main6 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String num = scan.nextLine();
        boolean right = true;

        while (right == true) {
            if (num.length() < 7 || num.length() > 7) {
                System.out.println("Number is not six-digit");
                num = scan.nextLine();
            }
            else right = false;
        }
        char tmp, num1[]= num.toCharArray();
        int  i, j;
        for (i = 0, j = num1.length - 1; i < j; i++, j--) {
            tmp = num1[i];
            num1[i] = num1[j];
            num1[j] = tmp;
        }
        System.out.println(num1);
    }
}
