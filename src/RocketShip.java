//10-1-20 hw
public class RocketShip {

    public static final int SIZE = 3;
    public static void main(String[] args) {

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
        for(int line = 1; line <= SIZE+2; line++){
            //spaces
            for(int spaces = 1; spaces <= (-1*line)+6; spaces++){
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
            for(int dot = 1; dot <= 2*line-(SIZE-1); dot++){
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
        for(int dot = 1; dot <= line-(SIZE-2); dot++){
            System.out.print(".");
        }
    }

    public static void miniTriangle2(int line){
        for(int slashes = 1; slashes <= -(line)+(SIZE+1); slashes++){
            System.out.print("\\/");
        }
    }
}
