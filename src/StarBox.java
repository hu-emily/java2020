//9-15-20
//edits on 9/24/20
public class StarBox {

    public static void main(String[] args) {

        //exercise: starbox
//        for (int counter = 0; counter < 6; counter++){
//
//            mybox();
//        }

        int size = ForLoopPractice.size;
        for (int line = 1; line < size; line ++) {

            mybox(line);
        }
    }

    public static void mybox(int newline){

//        for (int i = 1; i <=10; i++) {
//
//            System.out.print("*");
//        }
//
//        System.out.println();

        for (int star = 1; star <= newline; star++) {

//            System.out.println("*");
            makeSpace(star);
            System.out.print(newline);
        }
    }

    public static void makeSpace (int line) {

        for (int space = 1; space < ForLoopPractice.size - line; space ++) {

            System.out.print(" ");
        }
    }
}
