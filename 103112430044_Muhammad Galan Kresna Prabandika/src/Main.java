public class Main {
    public static void main(String[] args) {

        Dosen d1 = new Dosen("Dr. Budi Santoso",   "NIP001");
        Dosen d2 = new Dosen("Prof. Sari Dewi",    "NIP002");
        Dosen d3 = new Dosen("Ir. Eko Prabowo",    "NIP003");
        Dosen d4 = new Dosen("Dr. Lina Maulida",   "NIP004");
        Dosen d5 = new Dosen("Drs. Ahmad Fauzi",   "NIP005");

        Prodi prodi1 = new Prodi("Teknik Informatika", "TI");
        Prodi prodi2 = new Prodi("Sistem Informasi",   "SI");

        Fakultas fti = new Fakultas("Fakultas Teknologi Informasi");

        System.out.println("\nMenambahkan Prodi ke Fakultas (KOMPOSISI):");
        fti.tambahProdi(prodi1);
        fti.tambahProdi(prodi2);

        System.out.println("\nMendaftarkan Dosen ke Prodi (AGREGASI):");
        prodi1.tambahDosen(d1);
        prodi1.tambahDosen(d2);
        prodi2.tambahDosen(d3);
        prodi2.tambahDosen(d4);
        
        System.out.println("\nINFO LENGKAP FAKULTAS:");
        fti.tampilInfo();

        System.out.println("Dosen yang mengajar (ASOSIASI):");
        d1.mengajar();
        d3.mengajar();
        d5.mengajar();

        System.out.println("\nDosen yang belum terdaftar di Prodi:");
        d5.tampilInfo();
    }
}
