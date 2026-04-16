import java.util.ArrayList;

class Prodi {
    String namaProdi;
    ArrayList<Dosen> daftarDosen;

    public Prodi(String namaProdi) {
        this.namaProdi = namaProdi;
        this.daftarDosen = new ArrayList<>();
    }

    public void tambahDosen(Dosen d) {
        daftarDosen.add(d);
    }

    public void tampilDosen() {
        System.out.println("Prodi: " + namaProdi);
        for (Dosen d : daftarDosen) {
            System.out.println("- " + d.nama);
        }
    }
}