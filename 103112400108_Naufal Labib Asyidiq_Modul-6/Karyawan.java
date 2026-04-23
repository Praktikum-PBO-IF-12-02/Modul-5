public class Karyawan {
    protected String nama;
    protected String nip;
    protected double gajiPokok;

    public Karyawan(String nama, String nip, double gajiPokok) {
        this.nama = nama;
        this.nip = nip;
        this.gajiPokok = gajiPokok;
    }

    public double hitungGaji() {
        return gajiPokok;
    }

    public void tampilInfo() {
        System.out.println("Nama      : " + nama);
        System.out.println("NIP       : " + nip);
        System.out.println("Gaji Pokok: Rp " + gajiPokok);
    }
}