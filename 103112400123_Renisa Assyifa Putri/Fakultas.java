import java.util.ArrayList;

public class Fakultas {
    private String namaFakultas;
    private ArrayList<Prodi> daftarProdi;

    public Fakultas(String namaFakultas) {
        this.namaFakultas = namaFakultas;
        this.daftarProdi = new ArrayList<>();
    }

    public void tambahProdi(String namaProdi) {
        Prodi prodiBaru = new Prodi(namaProdi);
        this.daftarProdi.add(prodiBaru);
    }

    public Prodi getProdi(int index) {
        return this.daftarProdi.get(index);
    }

    public void tampilkanData() {
        System.out.println("Fakultas: " + this.namaFakultas);
        for (Prodi p : daftarProdi) {
            p.tampilkanData();
        }
    }
}
