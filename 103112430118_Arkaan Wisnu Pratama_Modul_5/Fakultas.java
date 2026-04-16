import java.util.ArrayList;

public class Fakultas {

    private String namaFakultas;
    private String dekan;
    private ArrayList<Prodi> listProdi;

    public Fakultas(String namaFakultas, String dekan) {
        this.namaFakultas = namaFakultas;
        this.dekan        = dekan;
        this.listProdi    = new ArrayList<>();
    }

    public void tambahProdi(Prodi prodi) {
        if (!listProdi.contains(prodi)) {
            listProdi.add(prodi);
            prodi.setFakultas(this);
            System.out.println("   >> Prodi \"" + prodi.getNamaProdi()
                + "\" berhasil ditambahkan ke Fakultas " + namaFakultas);
        } else {
            System.out.println("   >> Prodi \"" + prodi.getNamaProdi()
                + "\" sudah ada di Fakultas " + namaFakultas);
        }
    }

    public void tampilInfo() {
        System.out.println("========================================");
        System.out.println(" FAKULTAS  : " + namaFakultas);
        System.out.println(" DEKAN     : " + dekan);
        System.out.println(" JML PRODI : " + listProdi.size());
        System.out.println("========================================");

        if (listProdi.isEmpty()) {
            System.out.println("  (belum ada prodi terdaftar)");
        } else {
            for (Prodi p : listProdi) {
                p.tampilInfo();
                System.out.println();
            }
        }
    }

    public String           getNamaFakultas() { return namaFakultas; }
    public String           getDekan()        { return dekan;        }
    public ArrayList<Prodi> getListProdi()    { return listProdi;    }
}
