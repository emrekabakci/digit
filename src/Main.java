import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int enteredNum, total = 0;
        Scanner input = new Scanner(System.in);

        System.out.print("Please Enter a Number: ");
        enteredNum = input.nextInt();

        while (enteredNum != 0) {
            total += enteredNum % 10;
            enteredNum /= 10;
        }

        System.out.println("result: " + total);
    }
}