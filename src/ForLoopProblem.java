//9-29-20
public class ForLoopProblem {

    public static final int SIZE = 6;
    public static void main(String[] args) {

        drawline();
        top();
        top();
        drawline();
        bottom();
        bottom();
        drawline();
    }

    public static void drawline() {

        System.out.print("+");

        for(int dash = 1; dash <= SIZE; dash++) {
            System.out.print("-");
        }

        System.out.println("+");
    }

    public static void top() {

        for(int line = 1; line <= SIZE/2; line++) {

            System.out.print("|");

            for(int space = SIZE/2; space >= line+1; space--){
                System.out.print(" ");
            }

            System.out.print("^");

            for(int space2 = 1; space2 <= 2*line-2; space2++) {
                System.out.print(" ");
            }

            System.out.print("^");

            for(int space3 = SIZE/2; space3 >= line+1; space3--) {
                System.out.print(" ");
            }

            System.out.println("|");
        }
    }

    public static void bottom(){

        for(int line = 1; line <= SIZE/2; line++) {

            System.out.print("|");

            for(int space = 1; space <= line-1; space++){
                System.out.print(" ");
            }

            System.out.print("v");

            for(int space2 = SIZE/2; space2 >= line*2-2; space2--) {
                System.out.print(" ");
            }

            System.out.print("v");

            for(int space3 = 1; space3 <= line-1; space3++) {
                System.out.print(" ");
            }

            System.out.println("|");
        }
    }
}
