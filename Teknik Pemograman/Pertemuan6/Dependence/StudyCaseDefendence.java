class NimBudi{
    String nim;

    public void setNim(String nim) {
        this.nim = nim;
    }
}

class Info{
    public void print(NimBudi Budis){
        Budis.setNim("211524030");
        System.out.println("Nim Budi adalah : " +Budis.nim);
    }
}

public class StudyCaseDependence {
    public static void main(String args[]){
        //intansiasi
        Info info = new Info();
        NimBudi budi = new NimBudi();
        
        //print nim budi dengan memanggil method print pada obj info dengan parameter berupa obj budi
        info.print(budi);
    }
}
