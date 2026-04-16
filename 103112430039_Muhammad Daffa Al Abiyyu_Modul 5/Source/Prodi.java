import java.util.ArrayList;

public class Prodi {
    private String Prodi;
    private ArrayList<Dosen> daftarDosen;

    public Prodi(String namaProdi) {
        this.Prodi = namaProdi;
        this.daftarDosen = new ArrayList<>();
    }

    public String getNamaProdi() {
        return Prodi;
    }

    public void tambahDosen(Dosen d) {
        daftarDosen.add(d);
    }

    public void tampilkanDosen() {
        System.out.println("Prodi: " + Prodi);
        for (Dosen d : daftarDosen) {
            System.out.println("- " + d.getNamaDosen());
        }
    }
}