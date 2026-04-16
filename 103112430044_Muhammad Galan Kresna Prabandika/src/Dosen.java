public class Dosen {
    private String nama;
    private String nip;
    private Prodi prodi;

    public Dosen(String nama, String nip) {
        this.nama = nama;
        this.nip       = nip;
        this.prodi     = null;
    }

    public void mengajar() {
        if (prodi != null) {
            System.out.println("[Dosen] " + nama + " mengajar di Prodi " + prodi.getNamaProdi());
        } else {
            System.out.println("[Dosen] " + nama + " belum terdaftar di Prodi manapun.");
        }
    }

    public void tampilInfo() {
        System.out.println("  - Dosen : " + nama + " (NIP: " + nip + ")"
                + (prodi != null ? " | Prodi: " + prodi.getNamaProdi() : " | Prodi: -"));
    }

    public String getNama() { return nama; }
    public String getNip()        { return nip; }
    public Prodi  getProdi()      { return prodi; }

    public void setProdi(Prodi prodi) { this.prodi = prodi; }
}
