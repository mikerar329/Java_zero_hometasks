import java.util.Scanner;

//reverse
public class Main6 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        char num[] = scan.nextLine().toCharArray();
        char tmp;
        int  i, j;
        for (i = 0, j = num.length - 1; i < j; i++, j--) {
            tmp = num[i];
            num[i] = num[j];
            num[j] = tmp;
        }
        System.out.println(num);
    }
}
