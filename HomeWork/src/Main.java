import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        System.out.println("------------------------LETS PLAY------------------------");



        Random rand = new Random();
        int randomNumber = rand.nextInt(100) + 1;
        int guess;
        int guessCount = 0;
        boolean correct = false;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = scan.nextLine();




        while (!correct){
            System.out.println("Guess Number:");
            guess = scan.nextInt();
            guessCount += 1;


            if (guess == randomNumber){
                correct = true;
                System.out.println((" ------------- CONGRATULATIONS  ------------- \n"  + "\n\nRandom Number: " +  randomNumber + " \nGuess count: " + guessCount) );
            }
            else if (guess > randomNumber){
                System.out.println("Your number is too big. Please, try again\n" + "\nGuess count: " + guessCount);
            }
            else if (guess < randomNumber){
                System.out.println("Your number is too small. Please, try again"  +  "\nGuess count: " + guessCount);

            }
        }
    }
}