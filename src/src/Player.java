import java.util.Scanner;

public class Player {
    int guessNum;
    int guessNum() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Player, please guess a number that will match guesser number in between 1 to 10: ");
        guessNum = scan.nextInt();
        return guessNum;
    }
}
