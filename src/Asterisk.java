//9-15-20
public class Asterisk {

    public static void main(String[] args) {

        parallel();
        star();
        System.out.println();

        parallel();
        star();
        parallel();
        System.out.println();

        System.out.println("  *");
        System.out.println("  *");
        System.out.println("  *");
        parallel();
        star();

        System.out.println();

        //second way
        method1();
        System.out.println();
        method1();
        method2();
        method1();
    }

    public static void parallel() {

        System.out.println("*****");
        System.out.println("*****");
    }

    public static void star() {

        System.out.println(" * *");
        System.out.println("  *");
        System.out.println(" * *");
    }

    //another way
    public static void method1() {

        System.out.println("*****");
        System.out.println("*****");
        System.out.println(" * *");
        System.out.println("  *");
        System.out.println(" * *");
    }

    public static void method2() {

        System.out.println("*****");
        System.out.println("*****");
        System.out.println();
        System.out.println("  *");
        System.out.println("  *");
        System.out.println("  *");
    }
}
