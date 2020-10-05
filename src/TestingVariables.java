//9-22-20
public class TestingVariables {

    public static void main(String[] args) {

        //declare
        byte num;
        int intNum;

        //declare and initialize
        short numShort = 4;
        long numLong = 999999999;
        float numfloat = 3f;
        double numDouble = 7;
        char letter = 'd';

        //initialize
        num = 1;
        intNum = 1234;

//        System.out.println("these are my numbers my \nbyte Var = " + num +
//                " my\nint Var = " + intNum + " my\nshort Var = " + numShort);
//        System.out.println("my float is " + numfloat);
//        System.out.println("my double is " + numDouble);

        //receipt problem
        int subtotal = 38 + 40 + 30;
        double tax = subtotal*0.08;
        float tips = subtotal*0.15f;

        System.out.printf("Subtotal: %8d \n", subtotal);
//        System.out.println("Subtotal: ");
//        System.out.println(subtotal);

        System.out.printf("Tax: \t %9.2f \n", tax);
//        System.out.print("Tax: ");
//        System.out.println(tax);

        System.out.printf("Tips: \t %9.2f \n", tips);
//        System.out.print("Tips: ");
//        System.out.println(tips);

        System.out.printf("Total: \t %9.2f \n", subtotal + tax + tips);
//        System.out.print("Total: ");
//        System.out.println(subtotal + tax + tips);
    }
}
