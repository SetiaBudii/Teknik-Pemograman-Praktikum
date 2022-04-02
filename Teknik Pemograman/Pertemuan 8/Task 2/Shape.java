
/**
 *
 * @author Budi
 */
public class Shape {
    private String color = "red";
    private boolean filled = true;

    public Shape() {
        color = "green";
        filled = true;
    }
    
    public Shape(String color, Boolean filled){
        this.color = color;
        this.filled = filled;
    }

    
    
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }
    
    public String toString(){
        String fill;
        if(this.isFilled()){
            fill = "filled";
        }else{
            fill = "not filled";
        }
        return "A Shape with color of "+ this.getColor()+" and "+ fill;
    }
}
