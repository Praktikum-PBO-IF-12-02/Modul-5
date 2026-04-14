import java.util.ArrayList;

public class Fakultas {
    private String kodeFakultas;
    private String namaFakultas;
    private String dekan;
    private ArrayList<Prodi> listProdi;

    public Fakultas(String kodeFakultas, String namaFakultas, String dekan) {
        this.kodeFakultas = kodeFakultas;
        this.namaFakultas = namaFakultas;
        this.dekan = dekan;
        this.listProdi = new ArrayList<>();
    }

    public void tambahProdi(String kodeProdi, String namaProdi, String jenjang) {
        Prodi prodi = new Prodi(kodeProdi, namaProdi, jenjang);
        listProdi.add(prodi);
        System.out.println("Prodi " + namaProdi + " berhasil ditambahkan ke Fakultas " + namaFakultas);
    }

    public Prodi getProdiByNama(String namaProdi) {
        for (Prodi p : listProdi) {
            if (p.getNamaProdi().equalsIgnoreCase(namaProdi)) {
                return p;
            }
        }
        return null;
    }

    public void tampilkanProdi() {
        System.out.println("\n=== Prodi di Fakultas " + namaFakultas + " ===");
        if (listProdi.isEmpty()) {
            System.out.println("  Belum ada prodi terdaftar.");
        } else {
            for (Prodi p : listProdi) {
                System.out.println("  - " + p.getNamaProdi() + " (" + p.getJenjang() + ")");
            }
        }
    }

    public void tampilkanInfo() {
        System.out.println("FAKULTAS  : " + namaFakultas);
        System.out.println("KODE      : " + kodeFakultas);
        System.out.println("DEKAN     : " + dekan);
        if (listProdi.isEmpty()) {
            System.out.println("  Belum ada prodi.");
        } else {
            for (Prodi p : listProdi) {
                System.out.println("\n  >> Prodi: " + p.getNamaProdi() + " [" + p.getJenjang() + "]");
                ArrayList<Dosen> dosenList = p.getListDosen();
                if (dosenList.isEmpty()) {
                    System.out.println("     Belum ada dosen.");
                } else {
                    for (Dosen d : dosenList) {
                        System.out.println("     - " + d.getNama() + " | NIDN: " + d.getNidn() + 
                                           " | Keahlian: " + d.getBidangKeahlian());
                    }
                }
            }
        }
    }

    public String getKodeFakultas() {
        return kodeFakultas;
    }

    public String getNamaFakultas() {
        return namaFakultas;
    }

    public String getDekan() {
        return dekan;
    }

    public ArrayList<Prodi> getListProdi() {
        return listProdi;
    }

    public String toString() {
        return "Fakultas [Kode: " + kodeFakultas + ", Nama: " + namaFakultas + 
               ", Dekan: " + dekan + ", Jumlah Prodi: " + listProdi.size() + "]";
    }
}