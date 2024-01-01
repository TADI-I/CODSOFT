import java.util.Random;
import java.util.Scanner;

public class NumberGame {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int score = 0;
        String playAgain = "";

        do {
            int number = rand.nextInt(100) + 1;
            int guess = 0;
            int count = 0;
            while (guess != number) 
            {
                System.out.print("Enter your guess: ");
                guess = sc.nextInt();
                count++;
                if (guess == number) {
                    System.out.println("You guessed it right in " + count + " tries");
                    score++; // increment score when user guesses correctly
                } else if (guess > number) {
                    System.out.println("Too high");
                } else {
                    System.out.println("Too low");
                }
                if(count == 5)
                {
                    System.out.println("You have exceeded the number of tries");
                    break;
                }
            }
            System.out.println("Your current score is: " + score);
            System.out.print("Do you want to play again? (yes/no): ");
            playAgain = sc.next();
        } while(playAgain.equalsIgnoreCase("yes"));

        System.out.println("Your final score is: " + score);
    }
}
