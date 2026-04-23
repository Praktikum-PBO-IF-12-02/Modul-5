public class KaryawanTetap extends Karyawan {
    private double tunjangan;

    public KaryawanTetap(String nama, String nip, double gajiPokok, double tunjangan) {
        super(nama, nip, gajiPokok);
        this.tunjangan = tunjangan;
    }

    @Override
    public double hitungGaji() {
        return gajiPokok + tunjangan;
    }

    @Override
    public void tampilInfo() {
        System.out.println("=== Karyawan Tetap ===");
        super.tampilInfo();
        System.out.println("Tunjangan : Rp " + tunjangan);
        System.out.println("Total Gaji: Rp " + hitungGaji());
    }
}