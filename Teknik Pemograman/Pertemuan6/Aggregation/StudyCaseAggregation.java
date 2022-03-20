class Staff
{
    String name;
    int id ;
    int age;
    
    Staff(String name, int id, int age)
    {
        this.name = name;
        this.id = id;
        this.age = age;
    }
}

class BestStaff
{
    Staff Staffs;
    int pos;
    
    //Parameter input dari contruktor class ini bertipe Staff(class) dan integer
    BestStaff(Staff Staffs, int pos){
        this.Staffs = Staffs;
        this.pos = pos;
    }
    
    void PrintBestStaff(){
        System.out.println("Rank : " + pos);
        System.out.println("Nama : " + Staffs.name);
        System.out.println("ID Staff : " + Staffs.id);
        System.out.println("Umur : " + Staffs.age);
        System.out.println();
        
    }
}

public class S {
    public static void main(String args[]){
        
    //instansiasi Beststaff menjadi sebuah objek 
    BestStaff listBest1 = new BestStaff(new Staff("Doni",200001,35),1);
    BestStaff listBest2 = new BestStaff(new Staff("Ahmad",200002,45),2);
    BestStaff listBest3 = new BestStaff(new Staff("Andri",200003,21),3);
    
    listBest1.PrintBestStaff(); 
    listBest2.PrintBestStaff(); 
    listBest3.PrintBestStaff(); 
    }  
}
