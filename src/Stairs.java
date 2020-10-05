//9-29-20 hw
public class Stairs {

    public static void main(String[] args) {

        for (int block = 1; block <= 5; block++){
            stepandman(block);
        }

        //bottom line
        for(int i = 1; i <= 32; i++){
            System.out.print("*");
        }
    }

    //space in front of each step
    public static void frontspace(int blockNum){
        int max = 20 - (blockNum-1)*5;
        for (int i = 1; i <= max; i++){
            System.out.print(" ");
        }
    }

    //space after each step
    public static void LastAsterisk(int blockNum){
        int spaceCount = (blockNum - 1)*5;
        for (int i = 0; i < spaceCount; i++){
            System.out.print(" ");
        }
        System.out.println("*");
    }

    //step
    public static void stepandman(int blockNum){

        frontspace(blockNum);
        System.out.print("  o  ******");
        LastAsterisk(blockNum);

        frontspace(blockNum);
        System.out.print(" /|\\ *     ");
        LastAsterisk(blockNum);

        frontspace(blockNum);
        System.out.print(" / \\ *     ");
        LastAsterisk(blockNum);

    }
}