import java.util.ArrayList;

public class Prodi {
    private String namaProdi;
    // Agregasi: ArrayList menyimpan referensi objek Dosen yang berdiri sendiri
    private ArrayList<Dosen> daftarDosen;

    // Constructor
    public Prodi(String namaProdi) {
        this.namaProdi = namaProdi;
        this.daftarDosen = new ArrayList<>();
    }

    // Method tambahDosen (mengimplementasikan Agregasi dan Asosiasi)
    public void tambahDosen(Dosen dosen) {
        this.daftarDosen.add(dosen);
    }

    public String getNamaProdi() {
        return namaProdi;
    }

    public void infoProdi() {
        System.out.println("  Program Studi: " + namaProdi);
        System.out.println("  Daftar Dosen Pengajar:");
        if (daftarDosen.isEmpty()) {
            System.out.println("    (Belum ada dosen yang terdaftar)");
        } else {
            for (Dosen d : daftarDosen) {
                System.out.print("    ");
                d.infoDosen();
            }
        }
    }
}
