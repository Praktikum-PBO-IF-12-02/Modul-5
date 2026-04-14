import java.util.ArrayList;

public class Fakultas {
    private String namaFakultas;
    // Komposisi: Siklus hidup Prodi bergantung sepenuhnya pada Fakultas
    private ArrayList<Prodi> daftarProdi;

    // Constructor
    public Fakultas(String namaFakultas) {
        this.namaFakultas = namaFakultas;
        this.daftarProdi = new ArrayList<>();
    }

    // Method tambahProdi: Implementasi Komposisi (Objek diciptakan langsung melalui parent)
    public void tambahProdi(String namaProdi) {
        // Prodi di-instansiasi di dalam ruang kelas Fakultas. Jika Fakultas hancur, list Prodi-nya akan hancur
        Prodi prodiBaru = new Prodi(namaProdi);
        this.daftarProdi.add(prodiBaru);
        System.out.println("Berhasil menambahkan Prodi " + namaProdi + " ke Fakultas " + this.namaFakultas);
    }

    // Helper untuk mengambil prodi jika ingin difungsikan untuk manipulasi lebih lanjut (misal: tambah dosen)
    public Prodi getProdi(int index) {
        if(index >= 0 && index < daftarProdi.size()){
            return daftarProdi.get(index);
        }
        return null;
    }

    public void infoFakultas() {
        System.out.println("===============================");
        System.out.println("Fakultas: " + namaFakultas);
        System.out.println("===============================");
        for (Prodi p : daftarProdi) {
            p.infoProdi();
            System.out.println();
        }
    }
}
