public class Dosen {
    private String nidn;
    private String nama;
    private Prodi prodi;

    public Dosen(String nidn, String nama) {
        this.nidn = nidn;
        this.nama = nama;
        this.prodi = null;
    }

    public String getNidn() {
        return nidn;
    }

    public String getNama() {
        return nama;
    }

    public Prodi getProdi() {
        return prodi;
    }

    public void setProdi(Prodi prodi) {
        this.prodi = prodi;
    }

    public void mengajar() {
        if (prodi != null) {
            System.out.println("Dosen " + nama + " mengajar di Prodi " + prodi.getNamaProdi());
        } else {
            System.out.println("Dosen " + nama + " belum terdaftar di prodi manapun.");
        }
    }
}