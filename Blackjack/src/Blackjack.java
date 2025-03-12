import java.util.*;

public class Blackjack {

        public static void main(String[] args)
        {
            boolean userAgain = true;
            boolean userBlackjack = false;
            boolean userBust = false;
            Scanner scanner = new java.util.Scanner(System.in);
            String yesOrNo;
            Player player = new Player(0);
            Machine machine = new Machine(0);

            while(userAgain){
                player.rollDice();
                System.out.println("Your current score is " + player.getPlayerScore());

                if(player.getPlayerScore() == 21){
                    userAgain = false;
                    System.out.println("Blackjack, you win!");
                    userBlackjack = true;
                }
                else if(player.getPlayerScore() < 21){
                    System.out.println("Want to roll again? yes/no");
                    yesOrNo = scanner.nextLine();
                    if(yesOrNo.equals("no") || yesOrNo.equals("No")){
                        userAgain = false;
                        System.out.println("Your score was " + player.getPlayerScore());
                    }
                }
                else {
                    userAgain = false;
                    System.out.println("You exceeded 21, you busted out!");
                    userBust = true;
                }

            }

            boolean machineAgain = true;
            while (machineAgain && !userBlackjack && !userBust) {
                machine.rollDice();
                if(machine.getMachineScore()== 21){
                    machineAgain = false;
                }
                else if ((machine.getMachineScore() >= 16 && machine.getMachineScore() < 21) ||
                           (machine.getMachineScore() > player.getPlayerScore() && machine.getMachineScore() < 21)){
                    machineAgain = false;
                    System.out.println("The machine got " + machine.getMachineScore());
                }
                else if (machine.getMachineScore() > 21){
                    machineAgain = false;
                    System.out.println("The machine busted out, you win!");
                }
            }

            if(player.getPlayerScore() < machine.getMachineScore() && machine.getMachineScore() < 21){
                System.out.println("The machine got a better score, you lose!");
            } else if(player.getPlayerScore() == machine.getMachineScore()){
                System.out.println("You got the same score as the machine, you lose!");
            } else if(player.getPlayerScore() > machine.getMachineScore() && player.getPlayerScore() < 21){
                System.out.println("You got a better score than the machine, you win!");
            }

            System.out.println("Thanks for playing, hope you have a nice day.");
            scanner.close();
        }

}


