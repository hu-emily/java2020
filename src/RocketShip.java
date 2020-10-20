//10-1-20 hw
import java.util.*;
public class RocketShip {

    public static int SIZE;
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the size of the rocket: ");
        SIZE = input.nextInt();

        triangle();
        horizontalLine();
        topBox();
        bottomBox();
        horizontalLine();
        bottomBox();
        topBox();
        horizontalLine();
        triangle();
    }

    public static void triangle(){
        for(int line = 1; line <= 2*SIZE-1; line++){
            //spaces
            for(int spaces = 1; spaces <= (-1*line)+(SIZE*2); spaces++){
                System.out.print(" ");
            }
            //forward slashes
            for(int slashes = 1; slashes <= line; slashes++){
                System.out.print("/");
            }
            System.out.print("**");
            //backslash
            for(int slashes = 1; slashes <= line; slashes++){
                System.out.print("\\");
            }
            System.out.println(" ");
        }
    }

    public static void horizontalLine(){
        System.out.print("+");
        for(int count = 1; count <= SIZE*2; count++){
            System.out.print("=*");
        }
        System.out.println("+");
    }

    public static void topBox(){
        for(int line = 1; line <= SIZE; line++){
            System.out.print("|");
            dots(line);
            miniTriangle(line);
            for(int dot = 1; dot <= -2*line+(SIZE*2); dot++){
                System.out.print(".");
            }
            miniTriangle(line);
            dots(line);
            System.out.println("|");
        }
    }

    public static void bottomBox(){
        for(int line = 1; line <= SIZE; line++){
            System.out.print("|");
            dots1(line);
            miniTriangle2(line);
            for(int dot = 1; dot <= 2*line-(SIZE*2)/SIZE; dot++){
                System.out.print(".");
            }
            miniTriangle2(line);
            dots1(line);
            System.out.println("|");
        }
    }

    public static void dots(int line){
        for(int dot = 1; dot <= -(line)+SIZE; dot++){
            System.out.print(".");
        }
    }

    public static void miniTriangle(int line){
        for(int slashes = 1; slashes <= line; slashes++){
            System.out.print("/\\");
        }
    }

    public static void dots1(int line){
        for(int dot = 1; dot <= line-(SIZE/SIZE); dot++){
            System.out.print(".");
        }
    }

    public static void miniTriangle2(int line){
        for(int slashes = 1; slashes <= -(line)+(SIZE+1); slashes++){
            System.out.print("\\/");
        }
    }
}
