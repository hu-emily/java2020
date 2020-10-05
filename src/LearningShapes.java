//10-1-20
public class LearningShapes {
    public static final int SIZE = 4;

    public static void main(String[] args) {
        longLine();
        topHalf();
        bottomHalf();
        longLine();
    }

    public static void longLine(){
        System.out.print("#");
        for(int dash = 1; dash <= 4*SIZE; dash++){
            System.out.print("=");
        }
        System.out.println("#");
    }

    public static void topHalf(){
        for(int line = 1; line <= SIZE; line++){
            System.out.print("|");
            spaces(line);
            System.out.print("<>");
            for(int dots = 1; dots <= 4*line-SIZE; dots++){
                System.out.print(".");
            }
            System.out.print("<>");
            spaces(line);
            System.out.println("|");
        }
    }

    public static void bottomHalf(){
        for(int line = 1; line <= SIZE; line++){
            System.out.print("|");
            spaces2(line);
            System.out.print("<>");
            for(int dots = 1; dots <= -4*line+(4*SIZE); dots++){
                System.out.print(".");
            }
            System.out.print("<>");
            spaces2(line);
            System.out.println("|");
        }
    }

    public static void spaces(int line){
        for(int spaces = 1; spaces <= -2*line+(SIZE*2); spaces++){
            System.out.print(" ");
        }
    }

    public static void spaces2(int line){
        for(int spaces = 1; spaces <= 2*line-(SIZE/2); spaces++){
            System.out.print(" ");
        }
    }
}