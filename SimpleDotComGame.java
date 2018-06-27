import java.util.Random;
import java.util.Scanner;
import java.util.ArrayList;

class SimpleDotComGame{

    public static void main(String[] args){
        int numOfGuesses = 0;

        Random rand = new Random();
        int initCell = rand.nextInt(4);

        SimpleDotCom dot = new SimpleDotCom();

        int[] locs = {initCell, initCell+1, initCell+2};
        dot.setLocationCells(locs);

        boolean isAlive = true;

        while(isAlive){
            System.out.println("Please enter your guess");
            Scanner scan = new Scanner(System.in);
            String userGuess = scan.nextLine();
            String gameResult = dot.checkYourself(userGuess);
            numOfGuesses++;
            if (gameResult.equals("Kill")){
                isAlive = false;
                break;
            }
        }
        System.out.println("You win. You took " + numOfGuesses + " attempts.");
    }
}