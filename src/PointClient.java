//11-4-20
/*
this is the client class
you will create the objects from here
this one will have the main method
 */
public class PointClient {
    public static void main(String[] args) {
        Point p1 = new Point(); //new keyword to create object
        Point p2 = new Point(3,2);
        p2.SetY(5);
        System.out.println("The point is p1: ("+p1.GetX()+","+p1.GetY()+")");
        System.out.println("The point is p2: ("+p2.GetX()+","+p2.GetY()+")");
    }
}
