import java.util.ArrayList;

public class Prodi {

    private String namaProdi;
    private String kodeProdi;
    private Fakultas fakultas;
    private ArrayList<Dosen> listDosen;

    public Prodi(String namaProdi, String kodeProdi) {
        this.namaProdi  = namaProdi;
        this.kodeProdi  = kodeProdi;
        this.listDosen  = new ArrayList<>();
        this.fakultas   = null;
    }

    public void tambahDosen(Dosen dosen) {
        if (!listDosen.contains(dosen)) {
            listDosen.add(dosen);
            dosen.setProdi(this);
            System.out.println("   >> Dosen \"" + dosen.getNamaDosen()
                + "\" berhasil ditambahkan ke Prodi " + namaProdi);
        } else {
            System.out.println("   >> Dosen \"" + dosen.getNamaDosen()
                + "\" sudah terdaftar di Prodi " + namaProdi);
        }
    }

    public void tampilInfo() {
        System.out.println("  [Prodi]");
        System.out.println("   Nama Prodi  : " + namaProdi);
        System.out.println("   Kode Prodi  : " + kodeProdi);
        System.out.println("   Fakultas    : "
            + (fakultas != null ? fakultas.getNamaFakultas() : "Belum terdaftar"));
        System.out.println("   Jumlah Dosen: " + listDosen.size());

        if (listDosen.isEmpty()) {
            System.out.println("   Dosen       : (belum ada dosen terdaftar)");
        } else {
            System.out.println("   Daftar Dosen:");
            for (Dosen d : listDosen) {
                System.out.println("     - " + d.getNamaDosen()
                    + " | " + d.getMataKuliah());
            }
        }
    }

    public void getDaftarDosen() {
        System.out.println("   Daftar Dosen di Prodi " + namaProdi + ":");
        if (listDosen.isEmpty()) {
            System.out.println("   (kosong)");
        } else {
            for (int i = 0; i < listDosen.size(); i++) {
                System.out.println("   " + (i + 1) + ". " + listDosen.get(i).getNamaDosen());
            }
        }
    }

    public String           getNamaProdi()  { return namaProdi;  }
    public String           getKodeProdi()  { return kodeProdi;  }
    public ArrayList<Dosen> getListDosen()  { return listDosen;  }
    public Fakultas         getFakultas()   { return fakultas;   }

    public void setFakultas(Fakultas fakultas) {
        this.fakultas = fakultas;
    }
}
