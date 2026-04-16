import java.util.ArrayList;

public class Prodi {
    private String kodeProdi;
    private String namaProdi;
    private ArrayList<Dosen> daftarDosen; // Agregasi

    public Prodi(String kodeProdi, String namaProdi) {
        this.kodeProdi = kodeProdi;
        this.namaProdi = namaProdi;
        this.daftarDosen = new ArrayList<>();
    }

    public void tambahDosen(Dosen dosen) {
        daftarDosen.add(dosen);
    }

    public void tampilkanDosen() {
        System.out.println("Daftar Dosen di Prodi " + namaProdi + ":");
        for (Dosen d : daftarDosen) {
            System.out.println("- " + d.getNama());
        }
    }

    public String getNamaProdi() {
        return namaProdi;
    }
}