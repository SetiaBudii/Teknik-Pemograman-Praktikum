/**
 *
 * @author Budi
 */

class UserSmartphone{
   private String name;

    UserSmartphone(String name) {
        this.name = name;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

class MerkSmartphone
{
    private String name;

    public MerkSmartphone(String name) {
        this.name = name;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }    
}

public class StudyCaseAssociation {
    public static void main(String args[]){
        UserSmartphone pengguna1 = new UserSmartphone("Budi");
        UserSmartphone pengguna2 = new UserSmartphone("Setia");
        UserSmartphone pengguna3 = new UserSmartphone("Wisnu");
        
        MerkSmartphone merk1 = new MerkSmartphone("Xiaomi");
        MerkSmartphone merk2 = new MerkSmartphone("Samsung");
        MerkSmartphone merk3 = new MerkSmartphone("Oppo");
        
        //Asosiasi one to one
        System.out.println(pengguna1.getName()+" Punya Hp Merk "+merk1.getName());
        
        //Asosiasi one to many
        System.out.println(pengguna2.getName()+" Punya Hp Merk "+merk3.getName()+" dan "+merk2.getName());
        
        //Asosiasi many to many
        System.out.println(pengguna2.getName()+ " dan " + pengguna3.getName() +" Punya Hp Merk "+merk3.getName()+" dan "+merk2.getName());
        
    }
}
