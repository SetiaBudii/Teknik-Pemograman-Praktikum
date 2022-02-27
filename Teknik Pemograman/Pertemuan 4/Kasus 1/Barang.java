
public class Barang {
        String kode_barang;
        String nama_barang;
        private int stok;
        
    public Barang(String kode, String nama, int stk) {
        kode_barang = kode;
        nama_barang = nama;
        stok = stk;
    }  

    public void setStok(int stok) {
        if(stok + this.stok > this.stok){
            this.stok = stok;

        }else{
            this.stok=this.stok+0;
        }
        
    }

    public int getStok() {
        return stok;
    }
    
    public int AddStokBarang(int jumlah){
        stok += jumlah;
        
        return stok;
    }
}
