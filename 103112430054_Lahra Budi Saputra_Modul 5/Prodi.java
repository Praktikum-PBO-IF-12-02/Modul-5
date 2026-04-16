import java.util.ArrayList;

public class Prodi {
    public String namaProdi;
    public ArrayList<Dosen> daftarDosen;

    public Prodi(String namaProdi) {
        this.namaProdi = namaProdi;
        this.daftarDosen = new ArrayList<>();
    }

    // Agregasi: Menambahkan dosen yang sudah ada
    public void tambahDosen(Dosen d) {
        daftarDosen.add(d);
    }

    public void tampilkanData() {
        System.out.println("Prodi: " + namaProdi);
        System.out.println("Dosen Pengajar:");
        for (Dosen d : daftarDosen) {
            System.out.println("- " + d.nama);
        }
    }
}