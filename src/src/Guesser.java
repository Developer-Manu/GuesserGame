import java.util.Random;
import java.util.Scanner;

public class Guesser {
    int guessNum;
    int guessNum(){
        Random random = new Random();
        guessNum = random.nextInt(10);
        return guessNum;
    }
}
