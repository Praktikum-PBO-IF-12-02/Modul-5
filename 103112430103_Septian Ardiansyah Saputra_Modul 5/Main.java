public class Main {
    public static void main(String[] args) {

        Dosen d1 = new Dosen("001", "Dr. Ratio");
        Dosen d2 = new Dosen("002", "Th.D. Herta");
        Dosen d3 = new Dosen("003", "Prof. Anaxa");


        Prodi p1 = new Prodi("IF", "Informatika");

        p1.tambahDosen(d1);
        p1.tambahDosen(d2);

        Fakultas f1 = new Fakultas("FT", "Fakultas Teknik");

        f1.tambahProdi(p1);
        f1.listDosen(d1);
        f1.listDosen(d2);
        f1.listDosen(d3);

        f1.tampilProdi();
        f1.tampilListDosen();
        p1.tampilDosen();

        d1.mengajar();
    }
}