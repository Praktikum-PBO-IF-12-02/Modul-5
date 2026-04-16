import java.util.ArrayList;

public class Fakultas {
    private String namaFakultas;
    private ArrayList<Prodi> daftarProdi;

    // Constructor
    public Fakultas(String namaFakultas) {
        this.namaFakultas = namaFakultas;
        this.daftarProdi = new ArrayList<>();
    }

    // Method tambah prodi
    public void tambahProdi(Prodi p) {
        daftarProdi.add(p);
    }

    // Method tampil prodi
    public void tampilProdi() {
        System.out.println("Fakultas: " + namaFakultas);
        for (Prodi p : daftarProdi) {
            System.out.println("- " + p.getNamaProdi());
        }
    }
}