public class Soal1 {
    public static void main(String[] args) {
        byte angka1 = 125;
        byte angka2 = 6;
        byte hasil = (byte) (angka1+angka2);

        System.out.println("Hasil 1 "+hasil);
        /**
        Hasilnya = -125 karena byte memiliki range dari -128 sd 127.Pada hasil
        perhitungan diatas adalah 135,karena max rang dari byte itu 127 maka jika suadah melebihi 
        angka tersebut perhitungan akan mundur/start dari belakang (-128) karena sisa dari perhitungan sebelumnya
        adalah 4 (135-127=4) maka hasilnya adalah 4 angka mulai dari -128 yaitu -125*/
    }
}