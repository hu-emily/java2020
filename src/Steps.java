//10-1-20 hw
public class Steps {

    public static final int SIZE = 5;
    public static void main(String[] args) {

        for(int block = 1; block <= SIZE; block++){
            man(block);
        }

        //last line
        for(int asterisk = 1; asterisk <= ((SIZE+1)*5)+2; asterisk++){
            System.out.print("*");
        }
    }

    public static void man(int block){

        frontSpaces(block);
        System.out.print("  o  ******");
        endingAsterisk(block);

        frontSpaces(block);
        System.out.print(" /|\\ *     ");
        endingAsterisk(block);

        frontSpaces(block);
        System.out.print(" / \\ *     ");
        endingAsterisk(block);
    }

    //spaces in front of man
    public static void frontSpaces(int block){
        for(int spaces = 1; spaces <= (5*SIZE - 5) - (block - 1)*5; spaces++){
            System.out.print(" ");
        }
    }

    //spaces+asterisk after man
    public static void endingAsterisk(int block){
        for(int spaces = 1; spaces <= (block-1)*5; spaces++){
            System.out.print(" ");
        }
        System.out.println("*");
    }
}
