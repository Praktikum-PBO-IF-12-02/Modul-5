import java.util.ArrayList;

public class Fakultas {
    private String namaFakultas;
    private ArrayList<Prodi> daftarProdi;

    public Fakultas(String namaFakultas) {
        this.namaFakultas = namaFakultas;
        this.daftarProdi  = new ArrayList<>();
    }

    public void tambahProdi(Prodi prodi) {
        daftarProdi.add(prodi);
        System.out.println("[Fakultas] Prodi " + prodi.getNamaProdi()
                + " ditambahkan ke Fakultas " + namaFakultas);
    }

    public void tampilInfo() {
        System.out.println("Fakultas : " + namaFakultas);
        if (daftarProdi.isEmpty()) {
            System.out.println("  (belum ada prodi)");
        } else {
            for (Prodi p : daftarProdi) {
                p.tampilInfo();
                System.out.println();
            }
        }
    }

    public String getNamaFakultas() { return namaFakultas; }
    public ArrayList<Prodi>  getDaftarProdi()  { return daftarProdi; }
}
