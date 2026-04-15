import java.util.ArrayList;
public class Prodi {
    String namaProdi;
    ArrayList<Dosen> daftarDosen; // AGREGASI

    // Constructor
    Prodi(String namaProdi) {
        this.namaProdi = namaProdi;
        this.daftarDosen = new ArrayList<>();
    }

    // Tambah dosen aggregasi 
    void tambahDosen(Dosen dosen) {
        daftarDosen.add(dosen);
    }
     // Tampilkan dosen
    void tampilDosen() {
        System.out.println("Prodi: " + namaProdi);
        for (Dosen d : daftarDosen) {
            System.out.println("- " + d.nama);
        }
    }
}
