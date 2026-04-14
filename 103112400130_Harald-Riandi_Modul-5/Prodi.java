import java.util.ArrayList;

public class Prodi {
    private String namaProdi;
    private ArrayList<Dosen> daftarDosen; 

    public Prodi(String namaProdi) {
        this.namaProdi = namaProdi;
        this.daftarDosen = new ArrayList<>();
    }

    public void tambahDosen(Dosen dosen) {
        this.daftarDosen.add(dosen);
    }

    public void tampilkanData() {
        System.out.println("  Program Studi: " + this.namaProdi);
        System.out.println("  Daftar Dosen Pengajar:");
        if (daftarDosen.isEmpty()) {
            System.out.println("    - (Belum ada dosen)");
        } else {
            for (Dosen d : daftarDosen) {
                System.out.println("    - " + d.getNama());
            }
        }
    }
}