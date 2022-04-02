


/**
 *
 * @author Budi
 */
public class Square extends Rectangle {
    
     public Square() {
        int side = 1; //default
    }
    
    public Square(double side) {
        super(side, side); // Call superclass Rectangle(double, double)
    }

    public Square(double side, String color, Boolean filled) {
        super(side,side,color,filled);
    }
    
    public double getSide(){
        return super.getWidth();
    }
    
    public void setSide(double side){
        super.setWidth(side);
        super.setLenght(side);
    }
    
    @Override
    public void setLenght(double side) {
        super.setLenght(side);
    }
    
    @Override
    public void setWidth(double side) {
        super.setWidth(side);
    }
    
    @Override
    public String toString() {
        return "A Square with side="+this.getSide()+" which is a subclass of "+super.toString();
    }
    
    
}
