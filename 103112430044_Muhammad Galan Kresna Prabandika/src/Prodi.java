import java.util.ArrayList;

public class Prodi {
    private String namaProdi;
    private String kodeProdi;
    private ArrayList<Dosen> daftarDosen;

    public Prodi(String namaProdi, String kodeProdi) {
        this.namaProdi  = namaProdi;
        this.kodeProdi  = kodeProdi;
        this.daftarDosen = new ArrayList<>();
    }

    public void tambahDosen(Dosen dosen) {
        if (!daftarDosen.contains(dosen)) {
            daftarDosen.add(dosen);
            dosen.setProdi(this);
            System.out.println("[Prodi] " + dosen.getNama()
                    + " ditambahkan ke Prodi " + namaProdi);
        } else {
            System.out.println("[Prodi] " + dosen.getNama()
                    + " sudah terdaftar di Prodi " + namaProdi);
        }
    }

    public void tampilInfo() {
        System.out.println("  Prodi  : " + namaProdi + " (" + kodeProdi + ")");
        if (daftarDosen.isEmpty()) {
            System.out.println("    (belum ada dosen)");
        } else {
            for (Dosen d : daftarDosen) {
                d.tampilInfo();
            }
        }
    }

    public String           getNamaProdi()   { return namaProdi; }
    public String           getKodeProdi()   { return kodeProdi; }
    public ArrayList<Dosen> getDaftarDosen() { return daftarDosen; }
}
