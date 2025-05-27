import java.util.Random;
import java.util.Scanner;
public class Numberguess {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        int targetNumber = random.nextInt(100) + 1;
        int guess = 0;     
        while (guess != targetNumber) {
            System.out.print("Enter your guess: ");
            guess = sc.nextInt();
            if (guess < targetNumber) {
                System.out.println("Too low! Try again.");
            } else if (guess > targetNumber) {
                System.out.println("Too high! Try again.");
            } else {
                System.out.println("Congratulations! You guessed the number");
            }
        }
        sc.close();
    }
}

    

