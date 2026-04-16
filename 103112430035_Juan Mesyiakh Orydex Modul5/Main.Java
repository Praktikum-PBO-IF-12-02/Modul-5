public class Main {
    public static void main(String[] args) {

        Dosen d1 = new Dosen("Pak Sandi", "001");
        Dosen d2 = new Dosen("Bu Yandi", "002");

        Prodi p1 = new Prodi("Teknik Informatika");
        Prodi p2 = new Prodi("Data Science");

        p1.tambahDosen(d1);
        p2.tambahDosen(d2);

        Fakultas f1 = new Fakultas("Fakultas Informatika");

        f1.tambahProdi(p1);
        f1.tambahProdi(p2);

        f1.tampil();

        System.out.println("\nAktivitas Mengajar:");
        d1.mengajar();
        d2.mengajar();
    }
}