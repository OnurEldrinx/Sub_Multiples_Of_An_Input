import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        // Finding the numbers from 0 to user input which can be divided to 3 & 4 without remainder

        Scanner keyboard = new Scanner(System.in);

        int input;


        System.out.print("Please enter a number:");
        input = keyboard.nextInt();

        // For Loop
        System.out.println("Using \"For\" Loop\n--------------------");
        for (int i=0;i<=input;i++){

            if (i%3 == 0 && i%4 == 0){

                System.out.println(i);

            }
        }

        // While Loop
        System.out.println("\nUsing \"While\" Loop\n--------------------");
        int i=0;
        while (i<=input){

            if (i%3 == 0 && i%4 == 0){

                System.out.println(i);

            }

            i++;

        }

    }
}
