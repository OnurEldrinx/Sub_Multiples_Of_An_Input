import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        // Finding the numbers from 0 to user input which can be divided to 3 & 4 without remainder

        Scanner keyboard = new Scanner(System.in);

        int input,sum=0,counter=0;


        System.out.print("Please enter a number:");
        input = keyboard.nextInt();

        // For Loop
        System.out.println("Using \"For\" Loop\n--------------------");
        for (int i=0;i<=input;i++){

            if (i%3 == 0 && i%4 == 0){

                System.out.println(i);
                sum = sum + i;
                counter++;

            }
        }

        // While Loop
        System.out.println("\nUsing \"While\" Loop\n--------------------");
        int i=0;
        while (i<=input){

            if (i%3 == 0 && i%4 == 0){

                System.out.println(i);
                sum = sum + i;
                counter++;

            }

            i++;

        }

        double average = (double) sum / (double) counter;

        System.out.println("\n*******");
        System.out.println("Average: " + average);
        System.out.println("*******");

    }
}
