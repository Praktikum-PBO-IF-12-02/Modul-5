public class Dosen {

    private String namaDosen;
    private String nip;
    private String mataKuliah;
    private Prodi prodi;

    public Dosen(String namaDosen, String nip, String mataKuliah) {
        this.namaDosen  = namaDosen;
        this.nip        = nip;
        this.mataKuliah = mataKuliah;
        this.prodi      = null;
    }

    public void mengajar() {
        if (prodi != null) {
            System.out.println("Dosen " + namaDosen
                + " mengajar mata kuliah \"" + mataKuliah + "\""
                + " di Prodi " + prodi.getNamaProdi());
        } else {
            System.out.println("Dosen " + namaDosen
                + " mengajar mata kuliah \"" + mataKuliah + "\""
                + " (belum terdaftar di prodi mana pun)");
        }
    }

    public void setProdi(Prodi prodi) {
        this.prodi = prodi;
    }

    public void tampilInfo() {
        System.out.println("  [Dosen]");
        System.out.println("   Nama        : " + namaDosen);
        System.out.println("   NIP         : " + nip);
        System.out.println("   Mata Kuliah : " + mataKuliah);
        System.out.println("   Prodi       : "
            + (prodi != null ? prodi.getNamaProdi() : "Belum terdaftar"));
    }

    public String getNamaDosen()  { return namaDosen;  }
    public String getNip()        { return nip;        }
    public String getMataKuliah() { return mataKuliah; }
    public Prodi  getProdi()      { return prodi;      }
}
