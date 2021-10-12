
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;
import java.util.Scanner;

public class GuessGame {
    public static void main(String[] args) throws IOException {

        int secretNum;
        int guess;
        boolean correct = false;




        Scanner keyboard = new Scanner(System.in);

        Random rand = new Random();
        secretNum = rand.nextInt(100) + 1;
        //System.out.println(secretNum);


        while(!correct) {
            System.out.println("Guess the number between 1 to 100:   ");
            guess = keyboard.nextInt();

            if(guess == secretNum) {
                correct = true;
                System.out.println("You are Right!");
            }
            else if(guess > secretNum) {
                System.out.println("Too High,try again");
            }
            else if(guess < secretNum ) {
                System.out.println("Too Low,try again");
            }

        }


        //File operation
        PrintWriter pw = new PrintWriter(new FileWriter("output.txt"));
        pw.println("Guessed Random Number: " +secretNum);
        pw.println("You guessed right...and you WON");


        pw.close();
    }
}
