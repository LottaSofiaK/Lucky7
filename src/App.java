import java.util.Random;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Random r = new Random();
        Scanner in = new Scanner(System.in);
        int number1 = 0;
        int number2 = 0;
        int number3 = 0;
        String input ="";
        String playAgain;

        System.out.println("Welcome to Lucky 7, let's play!");
        System.out.println("Please insert the money.");
        input = in.nextLine();
        int money = Integer.parseInt(input);

        // Printing the random numbers.
        do {
            money = money-1;
            number1 = r.nextInt(11) + 1;
            System.out.println(number1);
            number2 = r.nextInt(11) + 1;
            System.out.println(number2);
            number3 = r.nextInt(11) + 1;
            System.out.println(number3);
        
        // Setting the terms.
            if (number1 == 7 && number2 == 7 && number3 == 7) {
                money = money + 100;
                System.out.println("Jackpot, you won the main prize 100 euros! Thank you for playing.");
                break;
            }
            else if (number1 == 7 && number2 == 7) {
                money = money + 5;
                System.out.println("Congratulations, you won 5 euros!");
            }
            else if (number2 == 7 && number3 == 7) {
                money = money + 5;
                System.out.println("Congratulations, you won 5 euros!");
            }
            else if (number1 == 7 && number3 == 7) {
                money = money + 5;
                System.out.println("Congratulations, you won 5 euros!");
            }
            else if (number1 == 7 || number2 == 7 || number3 == 7) {
                money = money + 3;
                System.out.println("Congratulations, you won 3 euros!");
            }
            System.out.println("You have " + money + " euros left. Do you wanna play again? If so, write Y and press Enter.");
            playAgain = in.nextLine();

        } while (money > 0 && playAgain.equalsIgnoreCase("y"));
            System.out.println("Thank you for playing! You won " + money + " euros.");
            
        in.close();

    }
}
