/**
 *
 * @author wahyuuuwid
 */

public class Main {
    public static void main(String[] args) {

        Fakultas fif = new Fakultas("Informatika");

        fif.tambahProdi("Teknik Informatika");
        fif.tambahProdi("Data Science");

        Prodi prodiTI = fif.getDaftarProdi().get(0);
        Prodi prodiDS = fif.getDaftarProdi().get(1);

        Dosen dosen1 = new Dosen("Pak Budi", "001");
        Dosen dosen2 = new Dosen("Bu Ani", "002");

        prodiTI.tambahDosen(dosen1);
        prodiDS.tambahDosen(dosen2);

        fif.tampilkanProdi();
        prodiTI.tampilkanDosen();
        prodiDS.tampilkanDosen();

        System.out.println("\nHasil method mengajar:");
        
        dosen1.mengajar();
        dosen2.mengajar();
    }
}