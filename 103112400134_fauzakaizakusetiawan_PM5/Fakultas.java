import java.util.ArrayList;

public class Fakultas {
    private String namaFakultas;
    private ArrayList<Prodi> daftarProdi;

    public Fakultas(String namaFakultas) {
        this.namaFakultas = namaFakultas;
        this.daftarProdi = new ArrayList<>();
    }

    public void tambahProdi(Prodi p) {
        daftarProdi.add(p);
    }

    public void tampilkanStruktur() {
        System.out.println("Fakultas: " + namaFakultas);
        for (Prodi p : daftarProdi) {
            System.out.println("  > Program Studi: " + p.getNamaProdi());
        }
    }
}