public class Main {
    public static void main(String[] args) {

        // Buat objek Dosen
        Dosen d1 = new Dosen("Pak Budi", "001");
        Dosen d2 = new Dosen("Bu Sari", "002");

        // Buat objek Prodi
        Prodi p1 = new Prodi("Informatika");

        // Tambahkan dosen ke prodi
        p1.tambahDosen(d1);
        p1.tambahDosen(d2);

        // Buat objek Fakultas
        Fakultas f1 = new Fakultas("Fakultas Teknik");

        // Tambahkan prodi ke fakultas
        f1.tambahProdi(p1);

        // Relasi mengajar
        d1.mengajar(p1.getNamaProdi());
        d2.mengajar(p1.getNamaProdi());

        // Tampilkan data
        System.out.println();
        f1.tampilProdi();
        System.out.println();
        p1.tampilDosen();
    }
}