import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Variables defined here.
        int enteredNum, total = 0;

        //Scanner created.
        Scanner input = new Scanner(System.in);

        //Data retrieved from user.
        System.out.print("Please Enter a Number: ");
        enteredNum = input.nextInt();

        //Sum of digits Calculated.
        while (enteredNum != 0) {
            total += enteredNum % 10;
            enteredNum /= 10;
        }

        //Result printed.
        System.out.println("result: " + total);
    }
}