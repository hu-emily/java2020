//9-29-20 hw
public class DiamondandX {

    public static final int SIZE = 8;
    public static void main(String[] args) {

        plusdash();
        top();
        bottom();
        plusdash();
        bottom();
        top();
        plusdash();
    }

    public static void plusdash(){

        System.out.print("+");
        for(int dash = 1; dash <= SIZE+1; dash++) {
            System.out.print("-");
        }
        System.out.println("+");
    }

    public static void top(){

        for(int line = 1; line <= SIZE/2; line ++){

            System.out.print("|");
            for(int space = SIZE/2; space >= line; space--){
                System.out.print(" ");
            }
            for(int slash = line; slash > 1; slash--){
                System.out.print("/");
            }
            System.out.print("*");
            for(int backslash = line; backslash > 1; backslash--){
                System.out.print("\\");
            }
            for(int space = SIZE/2; space >= line; space--){
                System.out.print(" ");
            }
            System.out.println("|");
        }
    }

    public static void bottom(){

        for(int line = SIZE/2; line >= 1; line--){
            System.out.print("|");
            for(int space = line; space <= SIZE/2; space++){
                System.out.print(" ");
            }
            for(int backslash = line-1; backslash >= 1; backslash--){
                System.out.print("\\");
            }
            System.out.print("*");
            for(int backslash = line-1; backslash >= 1; backslash--){
                System.out.print("/");
            }
            for(int space = line; space <= SIZE/2; space++){
                System.out.print(" ");
            }
            System.out.println("|");
        }
    }
}