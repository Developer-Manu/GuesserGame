//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello..! Welcome to the Guesser Game");
        System.out.println("This Game is all about guessing. Guesser will select one number, then players have to guess the number. Who guess the exact number the guesser selected, that player will win. ");

        Guesser guesser = new Guesser();

        Player player = new Player();


        Umpire umpire = new Umpire();
        umpire.collectNumFromGuesser();
        umpire.collectNumFromPlayer();
        umpire.compare();
    }
}