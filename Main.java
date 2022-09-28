import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("            --------FIZZBUZZ MULTIPLAYER--------");
        System.out.println("First player: Choose \"Fizz\", \"Buzz\" or \"FizzBuzz\"");
        System.out.println("Second player: Choose the number 100-1000");
        System.out.println("Rules:");
        System.out.println("If number is divisible by 3 - It's \"Fizz\".\nIf number is divisible by 5 - It's \"Buzz\"\nIf number is divisbile by both numbers - It's \"Fizz Buzz\"");
        System.out.println("If second player quess number corectly, he will get the point. Otherwise first player will get the point.");
        System.out.println("After round, switch role.");
        System.out.println("Good luck");
        

        System.out.print("Please choose your number: ");
        int userChoice = input.nextInt();
        
        
        if (userChoice<100 || userChoice>1000)
        {
            System.out.println("Your number is out of range!");
        }
        else
        {
            if (userChoice % 3 == 0)
            {
                System.out.println("Fizz!");
            }
            else if (userChoice % 5 == 0)
            {
                System.out.println("Buzz!");
            }
            else if (userChoice % 15 == 0)
            {
                System.out.println("FizzBuzz!");
            }
            else
            {
                System.out.println("Number is wrong! You lose!");
            }
        }
    }
}
