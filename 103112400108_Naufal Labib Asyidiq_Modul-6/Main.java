public class Main {
    public static void main(String[] args) {
        KaryawanTetap kt = new KaryawanTetap("Raden Suprianto", "KT-001", 5000000, 1500000);
        kt.tampilInfo();

        System.out.println();

        KaryawanKontrak kk = new KaryawanKontrak("Rina Dewi", "KK-001", 4000000, 6, 500000);
        kk.tampilInfo();
    }
}