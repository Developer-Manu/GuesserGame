public class Umpire {
    int numFromGuesser;
    int numFromPlayer1;
    int numFromPlayer2;
    int numFromPlayer3;

    void collectNumFromGuesser() {
        Guesser g = new Guesser();
        numFromGuesser = g.guessNum();
    }

    void collectNumFromPlayer() {
        Player p1 = new Player();
        Player p2 = new Player();
        Player p3 = new Player();
        numFromPlayer1 = p1.guessNum();
        numFromPlayer2 = p2.guessNum();
        numFromPlayer3 = p3.guessNum();
    }

    void compare(){
        if(numFromGuesser == numFromPlayer1){
            if(numFromGuesser == numFromPlayer2 && numFromGuesser == numFromPlayer3){
                System.out.println("All 3 players won the game");
            }
            else if(numFromGuesser == numFromPlayer2){
                System.out.println("Player 1 & Player 2 both won the game");
            }
            else if(numFromGuesser == numFromPlayer3){
                System.out.println("Player 1 & Player 3 both won the game");
            }
            else{
                System.out.println("player 1 won the game");
            }
        }
        else if(numFromGuesser == numFromPlayer2){
            if(numFromGuesser == numFromPlayer3){
                System.out.println("Player 2 & Player 3 both won the game");
            }
            else{
                System.out.println("player 2 won the game");
            }
        }
        else if(numFromGuesser == numFromPlayer3){
            System.out.println("player 3 won the game");
        }
        else{
            System.out.println("No player won the game");
        }
        System.out.println("The guesser number is:"+numFromGuesser);
    }
}
