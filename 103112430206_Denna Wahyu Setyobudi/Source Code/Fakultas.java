import java.util.ArrayList; // Baris import harus paling atas dan tanpa kata 'public'

public class Fakultas {
    private String namaFakultas;
    private ArrayList<Prodi> daftarProdi; // Relasi Komposisi

    public Fakultas(String namaFakultas) {
        this.namaFakultas = namaFakultas;
        this.daftarProdi = new ArrayList<>();
    }

    // Method untuk menambah Prodi (Sesuai tugas: Fakultas -> Prodi adalah Komposisi)
    public void tambahProdi(String kode, String nama) {
        Prodi baru = new Prodi(kode, nama);
        daftarProdi.add(baru);
    }

    public void tampilkanFakultas() {
        System.out.println("Fakultas: " + namaFakultas);
        for (Prodi p : daftarProdi) {
            System.out.println("  > Prodi: " + p.getNamaProdi());
        }
    }

    public Prodi getProdi(int index) {
        if (index >= 0 && index < daftarProdi.size()) {
            return daftarProdi.get(index);
        }
        return null;
    }
}