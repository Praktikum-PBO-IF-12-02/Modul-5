public class Main {

    public static void main(String[] args) {

        System.out.println("============================================================");
        System.out.println("  SISTEM INFORMASI UNIVERSITAS");
        System.out.println("============================================================\n");

        System.out.println("[1] Membuat Fakultas...");
        Fakultas fti = new Fakultas("Fakultas Teknologi Informasi", "Prof. Dr. Budi Santoso");
        Fakultas fek = new Fakultas("Fakultas Ekonomi dan Bisnis", "Prof. Dr. Sari Indah");
        System.out.println("    OK: " + fti.getNamaFakultas());
        System.out.println("    OK: " + fek.getNamaFakultas());

        System.out.println("\n[2] Membuat Program Studi...");
        Prodi teknikInformatika = new Prodi("Teknik Informatika", "TI-01");
        Prodi sistemInformasi   = new Prodi("Sistem Informasi",   "SI-02");
        Prodi manajemen         = new Prodi("Manajemen",          "MN-01");
        System.out.println("    OK: " + teknikInformatika.getNamaProdi());
        System.out.println("    OK: " + sistemInformasi.getNamaProdi());
        System.out.println("    OK: " + manajemen.getNamaProdi());

        System.out.println("\n[3] Membuat Dosen...");
        Dosen d1 = new Dosen("Dr. Andi Wijaya",    "NIP001", "Algoritma & Pemrograman");
        Dosen d2 = new Dosen("Ir. Citra Lestari",  "NIP002", "Basis Data");
        Dosen d3 = new Dosen("M.Sc. Rizky Pratama","NIP003", "Rekayasa Perangkat Lunak");
        Dosen d4 = new Dosen("Dr. Hendra Gunawan", "NIP004", "Manajemen Strategi");
        Dosen d5 = new Dosen("M.T. Dewi Anggraini","NIP005", "Jaringan Komputer");

        System.out.println("    OK: " + d1.getNamaDosen());
        System.out.println("    OK: " + d2.getNamaDosen());
        System.out.println("    OK: " + d3.getNamaDosen());
        System.out.println("    OK: " + d4.getNamaDosen());
        System.out.println("    OK: " + d5.getNamaDosen() + " (belum didaftarkan ke prodi)");

        System.out.println("\n[4] Mendaftarkan Prodi ke Fakultas (Komposisi)...");
        fti.tambahProdi(teknikInformatika);
        fti.tambahProdi(sistemInformasi);
        fek.tambahProdi(manajemen);

        System.out.println("\n[5] Mendaftarkan Dosen ke Prodi (Agregasi + Asosiasi)...");
        teknikInformatika.tambahDosen(d1);
        teknikInformatika.tambahDosen(d3);
        sistemInformasi.tambahDosen(d2);
        sistemInformasi.tambahDosen(d3);
        manajemen.tambahDosen(d4);

        System.out.println("\n[6] Aktivitas Mengajar Dosen...");
        d1.mengajar();
        d2.mengajar();
        d3.mengajar();
        d4.mengajar();
        d5.mengajar();

        System.out.println("\n[7] Tampilkan Info Lengkap Seluruh Fakultas...\n");
        fti.tampilInfo();
        fek.tampilInfo();

        System.out.println("[8] Info Dosen Tanpa Prodi...");
        d5.tampilInfo();

        System.out.println("\n============================================================");
        System.out.println("  PROGRAM SELESAI");
        System.out.println("============================================================");
    }
}
