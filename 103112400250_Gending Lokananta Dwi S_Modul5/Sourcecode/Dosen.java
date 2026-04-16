public class Dosen {
    private String nama;
    private String nidn;

    // Constructor
    public Dosen(String nama, String nidn) {
        this.nama = nama;
        this.nidn = nidn;
    }

    // Method mengajar
    public void mengajar(String namaProdi) {
        System.out.println(nama + " mengajar di Prodi " + namaProdi);
    }

    // Getter
    public String getNama() {
        return nama;
    }

    public String getNidn() {
        return nidn;
    }
}
