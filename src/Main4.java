import java.util.Scanner;

//sequence
public class Main4 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        boolean sequenceDown = true;
        boolean sequenceUp = true;

        boolean right = true;

        int num = scan.nextInt();

        while (right == true) {
            if (num < 1000 || num > 9999) {
                System.out.println("Number is not four-digit");
                num = scan.nextInt();
            }
            else right = false;
        }
        int numCpy = num;
        int prev = num % 10;
        num /= 10;

        while (sequenceDown && num != 0) {
            if (num % 10 <= prev) {
                sequenceDown = false;
            }
            prev = num % 10;
            num /= 10;
        }

        while (sequenceUp && numCpy != 0) {
            prev = numCpy % 10;
            numCpy /= 10;
            if (numCpy % 10 >= prev) {
                sequenceUp = false;
            }
        }
        if (sequenceUp){
            System.out.println("Sequence is going up");
        } else if(sequenceDown) {
            System.out.println("Sequence is going down");
        } else {
            System.out.println("Not a sequence");
        }
    }
}
