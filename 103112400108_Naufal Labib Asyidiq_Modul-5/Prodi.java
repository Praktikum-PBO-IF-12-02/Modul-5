import java.util.ArrayList;

public class Prodi {
    private String kodeProdi;
    private String namaProdi;
    private String jenjang;
    private ArrayList<Dosen> listDosen;

    public Prodi(String kodeProdi, String namaProdi, String jenjang) {
        this.kodeProdi = kodeProdi;
        this.namaProdi = namaProdi;
        this.jenjang = jenjang;
        this.listDosen = new ArrayList<>();
    }

    public void tambahDosen(Dosen dosen) {
        if (!listDosen.contains(dosen)) {
            listDosen.add(dosen);
            dosen.setProdi(this);
            System.out.println("Dosen " + dosen.getNama() + " berhasil ditambahkan ke Prodi " + namaProdi);
        } else {
            System.out.println("Dosen " + dosen.getNama() + " sudah terdaftar di Prodi " + namaProdi);
        }
    }

    public void tampilkanDosen() {
        System.out.println("\n=== Dosen di Prodi " + namaProdi + " ===");
        if (listDosen.isEmpty()) {
            System.out.println("  Belum ada dosen terdaftar.");
        } else {
            for (Dosen d : listDosen) {
                System.out.println("  - " + d.getNama() + " (" + d.getNidn() + ")");
            }
        }
    }

    public String getKodeProdi() {
        return kodeProdi;
    }

    public String getNamaProdi() {
        return namaProdi;
    }

    public String getJenjang() {
        return jenjang;
    }

    public ArrayList<Dosen> getListDosen() {
        return listDosen;
    }

    @Override
    public String toString() {
        return "Prodi [Kode: " + kodeProdi + ", Nama: " + namaProdi + 
               ", Jenjang: " + jenjang + ", Jumlah Dosen: " + listDosen.size() + "]";
    }
}