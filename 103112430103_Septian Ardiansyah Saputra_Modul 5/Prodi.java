import java.util.ArrayList;

public class Prodi {
    private String kodeProdi;
    private String namaProdi;
    private ArrayList<Dosen> daftarDosen;

    public Prodi(String kodeProdi, String namaProdi) {
        this.kodeProdi = kodeProdi;
        this.namaProdi = namaProdi;
        this.daftarDosen = new ArrayList<>();
    }

    public void tambahDosen(Dosen d) {
        daftarDosen.add(d);
    }

    public void tampilDosen() {
        System.out.println("Daftar Dosen di Prodi " + namaProdi + " :");
        for (Dosen d : daftarDosen) {
            System.out.println("- " + d.getNama());
        }
        System.out.println();
    }

    public String getNamaProdi() {
        return namaProdi;
    }
}