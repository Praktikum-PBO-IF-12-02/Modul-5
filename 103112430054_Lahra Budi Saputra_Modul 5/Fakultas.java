import java.util.ArrayList;

public class Fakultas {
    public String namaFakultas;
    public ArrayList<Prodi> daftarProdi;

    public Fakultas(String namaFakultas) {
        this.namaFakultas = namaFakultas;
        this.daftarProdi = new ArrayList<>();
    }

    // Komposisi: Prodi langsung dibuat di dalam Fakultas
    public Prodi tambahProdi(String namaProdi) {
        Prodi p = new Prodi(namaProdi);
        daftarProdi.add(p);
        return p; // Mengembalikan prodi agar mudah digunakan di Main
    }
}