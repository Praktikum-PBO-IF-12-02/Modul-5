import java.util.ArrayList;

class Dosen {
    String nama;
    Prodi prodi;

    Dosen(String nama) {
        this.nama = nama;
    }

    void mengajar(Prodi p) {
        this.prodi = p;
        System.out.println(nama + " mengajar di prodi " + p.nama);
    }
}

class Prodi {
    String nama;
    ArrayList<Dosen> daftarDosen = new ArrayList<>();

    Prodi(String nama) {
        this.nama = nama;
    }

    void tambahDosen(Dosen d) {
        daftarDosen.add(d);
        d.prodi = this;
    }

    void tampilkanDosen() {
        System.out.println("Dosen di prodi " + nama);
        for (Dosen d : daftarDosen) {
            System.out.println("- " + d.nama);
        }
    }
}

class Fakultas {
    String nama;
    ArrayList<Prodi> daftarProdi = new ArrayList<>();

    Fakultas(String nama) {
        this.nama = nama;
    }

    void tambahProdi(Prodi p) {
        daftarProdi.add(p);
    }

    void tampilkanProdi() {
        System.out.println("Prodi di fakultas " + nama);
        for (Prodi p : daftarProdi) {
            System.out.println("- " + p.nama);
        }
    }
}

public class Main {
    public static void main(String[] args) {

        Fakultas f1 = new Fakultas("Fakultas Teknik");

        Prodi p1 = new Prodi("Informatika");
        Prodi p2 = new Prodi("Data Science");

        f1.tambahProdi(p1);
        f1.tambahProdi(p2);

        Dosen d1 = new Dosen("Pak Rafi");
        Dosen d2 = new Dosen("Bu Yessy");
        Dosen d3 = new Dosen("Pak Andi");

        p1.tambahDosen(d1);
        p1.tambahDosen(d2);
        p2.tambahDosen(d3);

        d1.mengajar(p1);
        d2.mengajar(p1);
        d3.mengajar(p2);

        System.out.println();

        f1.tampilkanProdi();
        System.out.println();
        p1.tampilkanDosen();
        System.out.println();
        p2.tampilkanDosen();
    }
}