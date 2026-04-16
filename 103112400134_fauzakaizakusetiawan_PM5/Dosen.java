public class Dosen {
    private String nama;
    private String nidn;

    public Dosen(String nama, String nidn) {
        this.nama = nama;
        this.nidn = nidn;
    }

    public void mengajar(String namaProdi) {
        System.out.println("Dosen " + nama + " (NIDN: " + nidn + ") sedang mengajar di " + namaProdi);
    }

    public String getNama() {
        return nama;
    }
}