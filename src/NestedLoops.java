//9-29-20
public class NestedLoops {

    public static final int SIZE = 5;
    public static void main(String[] args) {

        //print dots 1
        for(int line = 1; line <= SIZE; line ++){

            for(int dot = 1; dot <=- line + SIZE; dot++) {

                System.out.print(".");
            }

            System.out.println(line);
        }

        //print dots 2
        for(int line = 1; line <= SIZE; line ++){

            for(int dot = 1; dot <=- line + SIZE; dot++) {

                System.out.print(".");
            }

            System.out.print(line);
            for(int space = 1; space < 2*line - SIZE +3; space++) {

                System.out.print(" ");
            }

            //this is a branch
            //if something is true you add your statement here
            //else is if it's not true
            if(line != 1){

                System.out.println(line);
            }
            else
                System.out.println(); //if it is only one statement you don't need brackets
        }
    }
}
