import java.util.ArrayList;

public class Prodi {
    private String namaProdi;
    private ArrayList<Dosen> daftarDosen;

    // Constructor
    public Prodi(String namaProdi) {
        this.namaProdi = namaProdi;
        this.daftarDosen = new ArrayList<>();
    }

    // Method tambah dosen
    public void tambahDosen(Dosen d) {
        daftarDosen.add(d);
    }

    // Method tampil dosen
    public void tampilDosen() {
        System.out.println("Daftar Dosen di Prodi " + namaProdi + ":");
        for (Dosen d : daftarDosen) {
            System.out.println("- " + d.getNama());
        }
    }

    public String getNamaProdi() {
        return namaProdi;
    }
}