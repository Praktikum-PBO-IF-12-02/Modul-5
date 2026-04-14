public class Main {
    public static void main(String[] args) {

        System.out.println("============================================================");
        System.out.println("   SISTEM INFORMASI UNIVERSITAS - FAKULTAS, PRODI & DOSEN   ");
        System.out.println("============================================================\n");

        Dosen dosen1 = new Dosen("601128701", "Anggi Zafia", "Internet of Things");
        Dosen dosen2 = new Dosen("0618059401", "Khairun Nisa Meiah Ngafidin", "Enterprise Intelligent Systems Development");
        Dosen dosen3 = new Dosen("627119601", "Muhammad Raafi'u Firmansyah", "Signal Processing");
        Dosen dosen4 = new Dosen("608049901", "Lisda", "Machine Learning");
        Dosen dosen5 = new Dosen("0617019102", "Dwi Mustika Kusumawardani", "System Architecture & Governance");

        Fakultas fakultas1 = new Fakultas("FIF", "Fakultas Informatika", "Aditya Dwi Putro");
        Fakultas fakultas2 = new Fakultas("FIF", "Fakultas Sistem Informasi", "Dr. Didi Supriyadi");

        System.out.println("--- Menambahkan Prodi ke Fakultas (Composition) ---");

        fakultas1.tambahProdi("TI001", "Teknik Informatika", "S1");
        fakultas1.tambahProdi("SI001", "Sistem Informasi", "S1");
        fakultas2.tambahProdi("TK001", "Teknik Informatika", "S1");

        Prodi prodi1 = fakultas1.getProdiByNama("Teknik Informatika");
        Prodi prodi2 = fakultas1.getProdiByNama("Sistem Informasi");
        Prodi prodi3 = fakultas2.getProdiByNama("Teknik Informatika");

        System.out.println("\n--- Menambahkan Dosen ke Prodi (Aggregation) ---");
        prodi1.tambahDosen(dosen1);
        prodi1.tambahDosen(dosen3);
        prodi2.tambahDosen(dosen2);
        prodi2.tambahDosen(dosen4);
        prodi3.tambahDosen(dosen1); 

        System.out.println("\n--- Hasil method mengajar() ---");
        dosen1.mengajar();
        dosen2.mengajar();
        dosen3.mengajar();
        dosen4.mengajar();
        dosen5.mengajar(); 

        System.out.println("\n--- Info Lengkap Fakultas ---");
        fakultas1.tampilkanInfo();
        fakultas2.tampilkanInfo();


        System.out.println("\n--- Data Semua Dosen ---");
        System.out.println(dosen1);
        System.out.println(dosen2);
        System.out.println(dosen3);
        System.out.println(dosen4);
        System.out.println(dosen5); 

        System.out.println("\n============================================================");
        System.out.println("   SELESAI - Sistem berhasil dijalankan                     ");
        System.out.println("============================================================");
    }
}