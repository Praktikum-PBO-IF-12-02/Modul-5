import java.util.ArrayList;

public class Prodi {
    private String namaProdi;
    private ArrayList<Dosen> daftarDosen;

    public Prodi(String namaProdi) {
        this.namaProdi = namaProdi;
        this.daftarDosen = new ArrayList<>();
    }

    public void tambahDosen(Dosen d) {
        daftarDosen.add(d);
    }

    public void tampilkanDosen() {
        System.out.println("Daftar Dosen di " + namaProdi + ":");
        for (Dosen d : daftarDosen) {
            System.out.println("- " + d.getNama());
        }
    }

    public String getNamaProdi() {
        return namaProdi;
    }
}