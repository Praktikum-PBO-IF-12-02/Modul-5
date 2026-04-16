public class Dosen {
    private String nidn;
    private String nama;
    private String bidangKeahlian;
    private Prodi prodi; 

    public Dosen(String nidn, String nama, String bidangKeahlian) {
        this.nidn = nidn;
        this.nama = nama;
        this.bidangKeahlian = bidangKeahlian;
        this.prodi = null; 
    }

    public void mengajar() {
        if (prodi != null) {
            System.out.println("Dosen " + nama + " mengajar di Prodi " + prodi.getNamaProdi());
        } else {
            System.out.println("Dosen " + nama + " belum terdaftar di Prodi manapun, tetapi tetap ada.");
        }
    }

    public void setProdi(Prodi prodi) {
        this.prodi = prodi;
    }

    public String getNidn() {
        return nidn;
    }

    public String getNama() {
        return nama;
    }

    public String getBidangKeahlian() {
        return bidangKeahlian;
    }

    public Prodi getProdi() {
        return prodi;
    }

    @Override
    public String toString() {
        String prodiInfo = (prodi != null) ? prodi.getNamaProdi() : "Tidak terdaftar di Prodi";
        return "Dosen [NIDN: " + nidn + ", Nama: " + nama + 
               ", Keahlian: " + bidangKeahlian + ", Prodi: " + prodiInfo + "]";
    }
}