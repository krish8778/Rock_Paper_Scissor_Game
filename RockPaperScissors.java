import java.util.Random;

public class RockPaperScissors {

    private static final String[] COMPUTER_CHOICES = {"rock", "paper", "scissor"};
    private String computerChoice;
    private int computerScore;
    private int playerScore;
    Random random;

    RockPaperScissors(){
        random = new Random();
    }

    public void setComputerScore(int computerScore) {
        this.computerScore = computerScore;
    }

    public void setPlayerScore(int playerScore) {
        this.playerScore = playerScore;
    }

    public String getComputerChoice() {
        return computerChoice;
    }

    public int getPlayerScore() {
        return playerScore;
    }

    public int getComputerScore() {
        return computerScore;
    }

    //Game logic
    public void RockPaperScissor(String playerChoice){
        int choicesIndex = random.nextInt(COMPUTER_CHOICES.length);
        computerChoice = COMPUTER_CHOICES[choicesIndex];

        if(computerChoice.equals("rock")){
            if(playerChoice.equals("paper")){
                System.out.println("Computer : " + computerChoice);
                System.out.println("Player wins");
                playerScore++;
            } else if (playerChoice.equals("scissor")) {
                System.out.println("Computer : " + computerChoice);
                System.out.println("Computer wins");
                computerScore++;
            }
            else{
                System.out.println("Computer : " + computerChoice);
                System.out.println("Draw");
            }
        }
        else if (computerChoice.equals("paper")) {
            if(playerChoice.equals("scissor")){
                System.out.println("Computer : " + computerChoice);
                System.out.println("Player wins");
                playerScore++;
            } else if (playerChoice.equals("rock")) {
                System.out.println("Computer : " + computerChoice);
                System.out.println("Computer wins");
                computerScore++;
            }
            else{
                System.out.println("Computer : " + computerChoice);
                System.out.println("Draw");
            }
        }
        else{
            if(playerChoice.equals("rock")){
                System.out.println("Computer : " + computerChoice);
                System.out.println("Player wins");
                playerScore++;
            } else if (playerChoice.equals("paper")) {
                System.out.println("Computer : " + computerChoice);
                System.out.println("Computer wins");
                computerScore++;
            }
            else{
                System.out.println("Computer : " + computerChoice);
                System.out.println("Draw");
            }
        }

    }
}
