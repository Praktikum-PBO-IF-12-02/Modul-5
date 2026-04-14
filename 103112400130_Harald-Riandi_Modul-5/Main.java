public class Main {
    public static void main(String[] args) {

        Dosen dosen1 = new Dosen("Dr. Alan Turing", "101010");
        Dosen dosen2 = new Dosen("Dr. Ada Lovelace", "010101");
        Dosen dosen3 = new Dosen("Dr. John von Neumann", "111111");

        Fakultas fasilkom = new Fakultas("Ilmu Komputer");

        fasilkom.tambahProdi("Teknik Informatika");
        fasilkom.tambahProdi("Sistem Informasi");

        Prodi prodiTI = fasilkom.getProdi(0); // Mendapatkan instans Teknik Informatika
        Prodi prodiSI = fasilkom.getProdi(1); // Mendapatkan instans Sistem Informasi

        prodiTI.tambahDosen(dosen1);
        prodiTI.tambahDosen(dosen2);
        prodiSI.tambahDosen(dosen3);
        
        prodiSI.tambahDosen(dosen1); 

        fasilkom.tampilkanData();
        
        System.out.println("\n--- Eksekusi Method Dosen ---");
        dosen1.mengajar();
        dosen2.mengajar();
    }
}