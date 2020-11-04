//11-4-20
/*
an object class
has no main method
used only to identify or create the object and its behavior
 */
public class Point{
    //fields
    private int x;
    private int y;
    //create constructors
    public Point(){
        x = -1;
        y = -1;
    }
    public Point(int x1, int y1){
        x = Math.abs(x1);
        y = Math.abs(y1);
    }
    //non static method changing the field values Mutator methods
    public void SetX(int x1){
        x = x1;
    }
    public void SetY(int y1){
        y = y1;
    }
    //non static method object reference, return values,Assesor methods
    public int GetX(){
        return x;
    }
    public int GetY(){
        return y;
    }
}