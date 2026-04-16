public class Main {
    public static void main(String[] args) {
       
        Dosen d1 = new Dosen("Dr. Fauza", "2201");
        Dosen d2 = new Dosen("Renisa, M.T.", "2202");

        
        Prodi p1 = new Prodi("Informatika");
        p1.tambahDosen(d1);
        p1.tambahDosen(d2);

        
        Fakultas f1 = new Fakultas("Fakultas Informatika");
        f1.tambahProdi(p1);

        
        f1.tampilkanStruktur();
        System.out.println();
        p1.tampilkanDosen();
        System.out.println();
        d1.mengajar(p1.getNamaProdi());
    }
}