//10-15-20

import java.util.*;
/*
create a game to guess a number
create a random number
ask the user for a guess
compare the guess with the random number
allow the user to guess again, keep score, control the number of tries
 */
public class PlayingWithRandom {

    public static void main(String[] args) {
        //create the Random object
        Random randy = new Random();
        int rand1 = randy.nextInt(20)+1;//the limit is not included

        Scanner scan = new Scanner(System.in);
        System.out.println("Please guess a number between 1 and 20 ");
        int userGuess = scan.nextInt(); //getting use guess
        if(rand1 == userGuess){
            System.out.println("Yeah, you guessed right");
        }
        else if(userGuess < rand1){
            System.out.println("Sorry, your guess is too low" + rand1 + " " + userGuess);
        }
        else{
            System.out.println("Sorry, your guess is too high" + rand1 + " " + userGuess);
        }


//        while(rand1 != 10){
//            System.out.println("My guess 1 is = " + rand1);
//            rand1 = randy.nextInt(20)+1;
//        }
//        System.out.println("My guess1 is" + rand1);
    }
}
