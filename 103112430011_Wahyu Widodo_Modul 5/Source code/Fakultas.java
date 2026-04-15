/**
 *
 * @author wahyuuuwid
 */

import java.util.ArrayList;

public class Fakultas {
    private String namaFakultas;
    private ArrayList<Prodi> daftarProdi;

    public Fakultas(String namaFakultas) {
        this.namaFakultas = namaFakultas;
        this.daftarProdi = new ArrayList<>();
    }

    public void tambahProdi(String namaProdi) {
        Prodi p = new Prodi(namaProdi);
        daftarProdi.add(p);
    }

    public void tampilkanProdi() {
        System.out.println("Fakultas: " + namaFakultas);
        for (Prodi p : daftarProdi) {
            System.out.println("- " + p.getNamaProdi());
        }
    }

    public ArrayList<Prodi> getDaftarProdi() {
        return daftarProdi;
    }
}