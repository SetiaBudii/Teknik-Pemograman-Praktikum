


/**
 *
 * @author Budi
 */
public class MainShape {
    public static void main(String args[]){
        Circle c1 = new Circle();
        Rectangle r1 = new Rectangle();
        Square s1 = new Square();
        
        System.out.println("toString Default");
        System.out.println(c1.toString());
        System.out.println(r1.toString());
        System.out.println(s1.toString());
        
        //memasukan sisi/panjang/lebar/radius sebagai parameter
        c1.setRadius(7.0);
        r1.setLenght(2.0);
        r1.setWidth(4.0);
        s1.setSide(2.0);
        
        //Mencoba mencari luas area masing masing
        System.out.println();
        System.out.println("Luas Area:");
        System.out.println("Circle: "+ c1.getArea());
        System.out.println("Rectangler : "+r1.getArea());
        System.out.println("Square: " + s1.getArea());

        //Mencoba mencari Keliling area masing masing
        System.out.println();
        System.out.println("Keliling Area:");
        System.out.println("Circle: "+ c1.getPerimeter());
        System.out.println("Rectangler : "+r1.getPerimeter());
        System.out.println("Square: " + s1.getPerimeter());
    }
}
