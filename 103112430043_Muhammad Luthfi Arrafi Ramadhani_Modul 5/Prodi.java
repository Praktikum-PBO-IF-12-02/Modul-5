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

    public String getKodeProdi() {
        return kodeProdi;
    }

    public String getNamaProdi() {
        return namaProdi;
    }

    public void tambahDosen(Dosen dosen) {
        daftarDosen.add(dosen);
        dosen.setProdi(this);
    }

    public void tampilkanDosen() {
        System.out.println("Daftar dosen di Prodi " + namaProdi + ":");
        if (daftarDosen.isEmpty()) {
            System.out.println("- Tidak ada dosen");
        } else {
            for (Dosen dosen : daftarDosen) {
                System.out.println("- " + dosen.getNama() + " (NIDN: " + dosen.getNidn() + ")");
            }
        }
    }
}