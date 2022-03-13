import java.util.*;

public class RestaurantMain {
    public static void main(String[] args) {
       Restaurant menu = new Restaurant();
       Scanner input = new Scanner(System.in);
       
       //variabel yang menyimpan jumlah makanan yang akan dipesan(input)

       
        menu.tambahMenuMakanan("Bala-Bala", 1_000, 10, Restaurant.getId());
        Restaurant.nextId();
        menu.tambahMenuMakanan("Gehu", 1_000, 20, Restaurant.getId());
        Restaurant.nextId();
        menu.tambahMenuMakanan("Tahu", 1_000, 0, Restaurant.getId());
        Restaurant.nextId();
        menu.tambahMenuMakanan("Molen", 1_000, 20, Restaurant.getId());
        menu.tampilMenuMakanan();
        
        //Mengurangi Stok makanan
        System.out.println();
        menu.minusStok(9, "Bala-Bala");
        menu.tampilMenuMakanan();
        
        //Fitur Pesan Makanan
        //Set Kembali id menjadi 0 agar mulai dari awal
        System.out.println();
        System.out.printf("Masukan Jumlah Makanan yang ingin dipesan :");
        int jumlahMasakan = input.nextInt();
        Restaurant.id = 0;
        System.out.println();
        for(int i=0; i<jumlahMasakan; i++){
            System.out.printf("Nama Masakan %d: ",i+1);
            String Nama = input.next();
            System.out.printf("Harga Masakan %d: ",i+1);
            double Harga = input.nextDouble();
            System.out.printf("Stok Masakan %d: ",i+1);
            int Stok = input.nextInt();
            System.out.println();
            menu.pesanMakanan(Nama, Harga, Stok, Restaurant.getId());
            Restaurant.nextId();
        }
        System.out.println();
        System.out.println("Masakan Yang dipesan : ");
        menu.tampilMenuMakanan();
    }
}