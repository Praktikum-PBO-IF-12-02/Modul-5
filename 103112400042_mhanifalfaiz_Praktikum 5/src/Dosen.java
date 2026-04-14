public class Dosen {
    private String nidn;
    private String nama;

    // Constructor
    public Dosen(String nidn, String nama) {
        this.nidn = nidn;
        this.nama = nama;
    }

    // Method mengajar
    public void mengajar() {
        System.out.println("Dosen " + this.nama + " (NIDN: " + this.nidn + ") sedang mengajar.");
    }

    public String getNama() {
        return nama;
    }

    public void infoDosen() {
        System.out.println("- " + nama + " (NIDN: " + nidn + ")");
    }
}
