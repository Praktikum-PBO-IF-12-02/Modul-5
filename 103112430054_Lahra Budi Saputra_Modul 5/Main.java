public class Main {
    public static void main(String[] args) {
        // 1. Buat Fakultas
        Fakultas f = new Fakultas("Informatika");

        // 2. Buat Prodi di dalam Fakultas (KOMPOSISI)
        Prodi p1 = f.tambahProdi("S1 Informatika");

        // 3. Buat Dosen secara independen
        Dosen d1 = new Dosen("Pak Monterico");
        Dosen d2 = new Dosen("Pak Erwin");

        // 4. Masukkan Dosen ke Prodi (AGREGASI)
        p1.tambahDosen(d1);
        p1.tambahDosen(d2);

        // 5. Tampilkan hasil
        System.out.println("Fakultas: " + f.namaFakultas);
        p1.tampilkanData();
        System.out.println();
        
        // Tes method mengajar
        d1.mengajar();
    }
}