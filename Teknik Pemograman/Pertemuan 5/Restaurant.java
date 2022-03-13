public class Restaurant {
    private menu[] Menu;
    public static byte id=0;
    
    public Restaurant() {
        Menu = new menu[10];
        for(int i=0 ; i<10;i++){
            Menu[i] = new menu();
        }
    }

    public void tambahMenuMakanan(String nama, double harga,int stok, byte id) {
        Menu[id].setNama_makanan(nama);
        Menu[id].setHarga_makanan(harga);
        Menu[id].setStok(stok);
    }

    public static byte getId() {
        return id;
    }
    
    public void tampilMenuMakanan(){
        for(int i =0; i<=id;i++){
            if(!isOutOfStock(i)){
                System.out.println(Menu[i].getNama_makanan() +"["+Menu[i].getStok()+"]"+"\tRp. "+Menu[i].getHarga_makanan());
            }
        }
    }

    public boolean isOutOfStock(int id){
        if(Menu[id].getStok() == 0){
            return true;
        }else{
            return false;
        }
    }
    
    public static void nextId(){
        id++;
    }
    
    public void minusStok(int jumlah, String namaMakanan){
        boolean ketemu = false;
        int i = 0;
        while(ketemu == false && i<10){
            if(Menu[i].getNama_makanan().equals(namaMakanan)){
                Menu[i].setStok(Menu[i].getStok()-jumlah);
                ketemu = true;
            }
            i++;
        }
        
        if(i>9 && ketemu == false){
            System.out.println("Menu tidak ditemukan");
        }
    }
    
    public void pesanMakanan(String nama, double harga, int stok, byte id){
        tambahMenuMakanan(nama,harga,stok,id);
    }
}

 class menu{
    private String nama_makanan;
    private double harga_makanan;
    private int stok;
    
    
    public String getNama_makanan() {
        return nama_makanan;
    }

    public void setNama_makanan(String nama_makanan) {
        this.nama_makanan = nama_makanan;
    }

    public double getHarga_makanan() {
        return harga_makanan;
    }

    public void setHarga_makanan(double harga_makanan) {
        this.harga_makanan = harga_makanan;
    }

    public int getStok() {
        return stok;
    }

    public void setStok(int stok) {
        this.stok = stok;
    }
    
}