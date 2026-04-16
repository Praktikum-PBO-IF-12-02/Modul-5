import java.util.ArrayList;

public class Fakultas {
    private String kodeFakultas;
    private String namaFakultas;
    private ArrayList<Prodi> daftarProdi;

    public Fakultas(String kodeFakultas, String namaFakultas) {
        this.kodeFakultas = kodeFakultas;
        this.namaFakultas = namaFakultas;
        this.daftarProdi = new ArrayList<>();
    }

    public String getKodeFakultas() {
        return kodeFakultas;
    }

    public String getNamaFakultas() {
        return namaFakultas;
    }

    public void tambahProdi(Prodi prodi) {
        daftarProdi.add(prodi);
    }

    public void tampilkanProdi() {
        System.out.println("Daftar prodi di Fakultas " + namaFakultas + ":");
        if (daftarProdi.isEmpty()) {
            System.out.println("- Tidak ada prodi");
        } else {
            for (Prodi prodi : daftarProdi) {
                System.out.println("- " + prodi.getNamaProdi() + " (Kode: " + prodi.getKodeProdi() + ")");
            }
        }
    }
}