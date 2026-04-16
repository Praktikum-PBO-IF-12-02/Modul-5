import java.util.ArrayList;

public class Fakultas {
    private String kodeFakultas;
    private String namaFakultas;
    private ArrayList<Prodi> daftarProdi;
    private ArrayList<Dosen> daftarDosen;

    public Fakultas(String kodeFakultas, String namaFakultas) {
        this.kodeFakultas = kodeFakultas;
        this.namaFakultas = namaFakultas;
        this.daftarProdi = new ArrayList<>();
        this.daftarDosen = new ArrayList<>();
    }

    public void tambahProdi(Prodi p) {
        daftarProdi.add(p);
    }

    public void listDosen(Dosen d) {
        daftarDosen.add(d);
    }

    public void tampilProdi() {
        System.out.println("Daftar Prodi di Fakultas " + namaFakultas + " :");
        for (Prodi p : daftarProdi) {
            System.out.println("- " + p.getNamaProdi());
        }
        System.out.println();
    }

    public void tampilListDosen() {
        System.out.println("Daftar Dosen di Fakultas " + namaFakultas + " :");
        for (Dosen d : daftarDosen) {
            System.out.println("- " + d.getNama());
        }
        System.out.println();
    }

}