
import java.util.Scanner;
class FindEvenOdd {
    public static void main(String[] args) {
        int number ; // Example number
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        number = input.nextInt();
        if (isEven(number)) {
            System.out.println(number + " is even.");
        } else {
            System.out.println(number + " is odd.");
        }
    }

    public static boolean isEven(int num) {
        return num % 2 == 0;
    }
}