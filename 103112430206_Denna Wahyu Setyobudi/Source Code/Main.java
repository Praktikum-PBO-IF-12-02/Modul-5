public class Main {
    public static void main(String[] args) {
        // 1. Membuat objek Fakultas
        Fakultas ftik = new Fakultas("Fakultas Teknologi Informasi dan Komunikasi");

        // 2. Menambah Prodi (Komposisi)
        ftik.tambahProdi("IF", "Informatika");
        ftik.tambahProdi("SI", "Sistem Informasi");

        // 3. Membuat objek Dosen (Independent/Agregasi)
        Dosen d1 = new Dosen("12345", "Budi Sutopo");
        Dosen d2 = new Dosen("67890", "Erni Novita");

        // 4. Menghubungkan Dosen ke Prodi (Asosiasi/Agregasi)
        Prodi informatika = ftik.getProdi(0);
        informatika.tambahDosen(d1);
        informatika.tambahDosen(d2);

        // 5. Menampilkan Hasil
        ftik.tampilkanFakultas();
        System.out.println();
        informatika.tampilkanDosen();
        System.out.println();
        d1.mengajar();
    }
}