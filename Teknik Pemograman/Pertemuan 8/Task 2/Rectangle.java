


/**
 *
 * @author Budi
 */
public class Rectangle extends Shape{
    private double lenght;
    private double width;
    
    public Rectangle() {
        lenght = 1.0;
        width = 1.0;
    }
    public Rectangle(double width, double lenght) {
        this.lenght = lenght;
        this.width = width;
    }
    
     public Rectangle(double width, double lenght, String color, Boolean filled){
        super(color,filled);
        this.lenght = lenght;
        this.width = width;
        
    }

    public double getLenght() {
        return lenght;
    }

    public void setLenght(double lenght) {
        this.lenght = lenght;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }
    
    public double getArea() {
        return width*lenght;
    }
    
    public double getPerimeter(){
        return (2*width)+(2*lenght);
    }
    
    @Override
    public String toString() {
        return "A Reactangle with width="+this.getWidth()+" and lenght="+this.getLenght()+" which is a subclass of "+super.toString();
    }
}
