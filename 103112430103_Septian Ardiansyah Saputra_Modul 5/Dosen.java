public class Dosen {
    private String nidn;
    private String nama;

    public Dosen(String nidn, String nama) {
        this.nidn = nidn;
        this.nama = nama;
    }

    public void mengajar() {
        System.out.println(nama + " sedang mengajar.");
    }

    public String getNama() {
        return nama;
    }
}