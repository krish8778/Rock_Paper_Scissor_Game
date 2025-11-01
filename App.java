import java.util.Scanner;

public class App {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        RockPaperScissors game = new RockPaperScissors();
        do {
            game.setComputerScore(0);
            game.setPlayerScore(0);
            System.out.println("Enter your choice(rock,paper,scissor)");
            while(game.getComputerScore() < 3 && game.getPlayerScore() < 3){
                System.out.print("Player : ");
                String playerChoice = scan.next().toLowerCase();
                switch(playerChoice){
                    case "rock":
                    case "paper":
                    case "scissor":
                        game.RockPaperScissor(playerChoice);
                        System.out.println("Player " + game.getPlayerScore() + " : " + game.getComputerScore() + " Computer");
                        break;
                    default:
                        System.out.println("Enter valid input");
                }
            }
            if(game.getComputerScore() == 3)
                System.out.print("The winner is computer");
            else
                System.out.println("The winner is player");
            System.out.println("1. Play again\n2. Exit");
            int choice = scan.nextInt();
            switch (choice){
                case 1 :
                    continue;
                case 2 :
                    System.exit(0);
            }
        }while (true);

    }
}
