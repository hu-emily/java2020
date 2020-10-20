//10-19-20
/*
we are going to learn about return methods
ask user for 2 points
calculate distance d = sqrt((x2-x1)^2 + (y2-y1)&2) in method
distance is back print it
calculate
 */
import java.util.*;
public class ReturnMethods {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Give me your first point x, and y ");
        int x1 = scan.nextInt();
        int y1 = scan.nextInt();
        System.out.print("Give me your second point x, and y ");
        int x2 = scan.nextInt();
        int y2 = scan.nextInt();

        double dist = distanceMethod(x1,x2,y1,y2);
        //my method has to be of type double
        System.out.printf("The double distance is %2f \n",dist);
    }

    //this is a return method
    public static double distanceMethod(int x1, int x2, int y1,int y2){
        double distance = Math.sqrt((x2-x1)*(x2-x1)+ Math.pow((y2-y1),2));
        return distance; //to return value to main you can only return one value
    }
}