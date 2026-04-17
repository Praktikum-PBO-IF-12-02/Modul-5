import java.util.ArrayList;

class Dosen {
    String nama;
    String nidn;
    String mataKuliah;

    Dosen(String nama, String nidn, String mataKuliah) {
        this.nama = nama;
        this.nidn = nidn;
        this.mataKuliah = mataKuliah;
    }

    void mengajar() {
        System.out.println(nama + " mengajar mata kuliah " + mataKuliah);
    }
}

class Prodi {
    String namaProdi;
    ArrayList<Dosen> daftarDosen;

    Prodi(String namaProdi) {
        this.namaProdi = namaProdi;
        daftarDosen = new ArrayList<>();
    }

    void tambahDosen(Dosen dosen) {
        daftarDosen.add(dosen);
    }

    void tampilkanDosen() {
        System.out.println("Prodi: " + namaProdi);
        for (Dosen d : daftarDosen) {
            System.out.println("- " + d.nama);
        }
    }
}

class Fakultas {
    String namaFakultas;
    ArrayList<Prodi> daftarProdi;

    Fakultas(String namaFakultas) {
        this.namaFakultas = namaFakultas;
        daftarProdi = new ArrayList<>();
    }

    void tambahProdi(Prodi prodi) {
        daftarProdi.add(prodi);
    }

    void tampilkanProdi() {
        System.out.println("Fakultas: " + namaFakultas);
        for (Prodi p : daftarProdi) {
            System.out.println("- " + p.namaProdi);
        }
    }
}

public class LaporanPraktikumModul05 {
  public static void main(String[] args) {
    Dosen d1 = new Dosen("Pak Budi", "D001", "PBO");
  Dosen d2 = new Dosen("Bu Sinta", "D002", "Basis Data");

    Prodi p1 = new Prodi("Teknik Informatika");
    p1.tambahDosen(d1);
    p1.tambahDosen(d2);

    Fakultas f1 = new Fakultas("Fakultas Ilmu Komputer");
    f1.tambahProdi(p1);

    d1.mengajar();
    p1.tampilkanDosen();
    f1.tampilkanProdi();
  }
}
