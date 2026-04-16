import java.util.ArrayList;

class Fakultas {
    String namaFakultas;
    ArrayList<Prodi> daftarProdi;

    public Fakultas(String namaFakultas) {
        this.namaFakultas = namaFakultas;
        this.daftarProdi = new ArrayList<>();
    }

    public void tambahProdi(Prodi p) {
        daftarProdi.add(p);
    }

    public void tampil() {
        System.out.println("Fakultas: " + namaFakultas);
        for (Prodi p : daftarProdi) {
            p.tampilDosen();
        }
    }
}