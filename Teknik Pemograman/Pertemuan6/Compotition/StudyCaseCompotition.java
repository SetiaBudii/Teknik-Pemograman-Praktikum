
class Uang{
    private int jumlah;

    public Uang(int jumlah) {
        this.jumlah = jumlah;
    }

    public int getJumlah() {
        return jumlah;
    }

    public void setJumlah(int jumlah) {
        this.jumlah = jumlah;
    }
}

class Identitas{
    private String jenisIdentitas;

    public Identitas(String jenisIdentitas) {
        this.jenisIdentitas = jenisIdentitas;
    }

    public String getJenisIdentitas() {
        return jenisIdentitas;
    }

    public void setJenisIdentitas(String jenisIdentitas) {
        this.jenisIdentitas = jenisIdentitas;
    }
}

class Dompet{
    Uang money;
    Identitas ID;
    
    Dompet(Uang money, Identitas ID){
        this.money = money;
        this.ID = ID;
    }

    public Uang getMoney() {
        return money;
    }

    public void setMoney(Uang money) {
        this.money = money;
    }

    public Identitas getID() {
        return ID;
    }

    public void setID(Identitas ID) {
        this.ID = ID;
    }
    
    
}

public class StudyCaseCompotition {
    public static void main(String args[]){
        
        //instansiasi
        Dompet dompet = new Dompet(new Uang(10000),new Identitas("KTP"));
        
        System.out.println("Isi dompet : " + dompet.getMoney().getJumlah()+" Rupiah dan "+dompet.getID().getJenisIdentitas());
    }
}
