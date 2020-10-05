//9-22-20
public class ForLoopPractice {

    public static void main(String[] args) {

        //for (declare a counter var; check counter value; increment counter)
        for (int counter = 10; counter <= 20; counter += 2) {//counter = counter + 1

            System.out.println(counter);
        }

//9-24-20
        for (int dash = 10; dash <= 20; dash+=3) {

            System.out.print("-");
        }

        System.out.println("+----+");

        for (int i = 1; i <= 3; i++) {

            printingStuff();
        }

        System.out.println("+----+");
    }

    //make method to print the lines
    public static void printingStuff() {

        System.out.println("\\    /");
        System.out.println("/    \\");
    }
    public static final int size=7; //static constant (final)
}
