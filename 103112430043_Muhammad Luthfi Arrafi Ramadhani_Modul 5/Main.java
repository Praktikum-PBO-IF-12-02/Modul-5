public class Main {
    public static void main(String[] args) {
      
        Fakultas fakultasFTI = new Fakultas("F01", "Fakultas Teknologi Informasi");

        Prodi prodiIF = new Prodi("P01", "Informatika");
        Prodi prodiSI = new Prodi("P02", "Sistem Informasi");

        fakultasFTI.tambahProdi(prodiIF);
        fakultasFTI.tambahProdi(prodiSI);

        Dosen dosen1 = new Dosen("101", "Dr. Andi");
        Dosen dosen2 = new Dosen("102", "Prof. Budi");
        Dosen dosen3 = new Dosen("103", "Siti Rahma");

        prodiIF.tambahDosen(dosen1);
        prodiIF.tambahDosen(dosen2);

        System.out.println("=== DATA FAKULTAS ===");
        fakultasFTI.tampilkanProdi();
        System.out.println();

        System.out.println("=== DATA DOSEN PADA PRODI INFORMATIKA ===");
        prodiIF.tampilkanDosen();
        System.out.println();

        System.out.println("=== STATUS MENGAJAR DOSEN ===");
        dosen1.mengajar();
        dosen2.mengajar();
        dosen3.mengajar();
    }
}