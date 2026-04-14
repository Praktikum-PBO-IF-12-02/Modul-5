public class Main {
    public static void main(String[] args) {
        System.out.println("=== Inisialisasi Objek Independen (Agregasi) ===");
        // 1. Membuat Dosen. Disini ditunjukkan dosen hidup meski tanpa Prodi.
        Dosen dsn1 = new Dosen("1001", "Budi Santoso, M.Kom.");
        Dosen dsn2 = new Dosen("1002", "Siti Aminah, M.T.");
        Dosen dsn3 = new Dosen("1003", "Andi Hermawan, Ph.D.");

        System.out.println("Dosen berhasil dibuat tanpa perlu masuk ke Prodi mana pun.\n");

        System.out.println("=== Inisialisasi Organisasi (Komposisi) ===");
        // 2. Membuat Fakultas dan langsung membuat Prodi di dalamnya.
        // Konsep Composition: instance Prodi tidak diinisialisasi terlebih dahulu,
        // melainkan terikat penciptaannya oleh ruang lingkup (instance) Fakultas-nya.
        Fakultas fasilkom = new Fakultas("Ilmu Komputer");
        fasilkom.tambahProdi("Teknik Informatika");
        fasilkom.tambahProdi("Sistem Informasi");

        System.out.println("\n=== Menghubungkan Dosen dan Prodi (Association) ===");
        // 3. Kita sambungkan Dosen yang sudah di daftar ke Prodi tersebut
        Prodi tek_info = fasilkom.getProdi(0); // Mendapatkan refrence Prodi TI
        Prodi sis_info = fasilkom.getProdi(1); // Mendapatkan refrence Prodi SI

        System.out.println("Menambahkan dosen ke Teknik Informatika dan Sistem Informasi...");
        tek_info.tambahDosen(dsn1);
        tek_info.tambahDosen(dsn2);
        
        // Dosen bisa mengajar lebih dari 1 lokasi:
        sis_info.tambahDosen(dsn3);
        sis_info.tambahDosen(dsn1); 

        System.out.println("\n=== MENAMPILKAN HASIL ===");
        // 4. Menampilkan Struktur Organisasi nya lengkap beserta Dosen
        fasilkom.infoFakultas();

        System.out.println("=== Bukti Aktifitas Individu Dosen ===");
        // Menampilkan Aktifitas Individu (Method mengajar())
        dsn1.mengajar();
        dsn2.mengajar();
        dsn3.mengajar();
    }
}
