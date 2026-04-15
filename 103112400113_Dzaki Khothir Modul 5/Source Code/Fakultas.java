import java.util.ArrayList;
public class Fakultas {
    String namaFakultas;
    ArrayList<Prodi> daftarProdi;

    // Constructor
    Fakultas(String namaFakultas) {
        this.namaFakultas = namaFakultas;
        this.daftarProdi = new ArrayList<>(); //Komposisi 
    }

      // Tambah prodi
    void tambahProdi(String namaProdi) {
        Prodi p = new Prodi(namaProdi);
        daftarProdi.add(p);
    }

    // Ambil prodi
    Prodi getProdi(int index) {
        return daftarProdi.get(index);
    }

    // Tampilkan prodi
    void tampilProdi() {
        System.out.println("Fakultas: " + namaFakultas);
        for (Prodi p : daftarProdi) {
            System.out.println("- " + p.namaProdi);
        }
    }
}
