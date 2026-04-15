public class Main {
    public static void main(String[] args) {

        // BUAT DOSEN
        Dosen d1 = new Dosen("WiwokTeTok");
        Dosen d2 = new Dosen("EughKageet");

    
        // FAKULTAS (KOMPOSISI)
        Fakultas f = new Fakultas("Fakultas Informatika");

        f.tambahProdi("Sastra Mesin");
        f.tambahProdi("Teknik Nyawit");

        // Ambil prodi
        Prodi p1 = f.getProdi(0);
        Prodi p2 = f.getProdi(1);

        // AGREGASI
        p1.tambahDosen(d1);
        p1.tambahDosen(d2);

        p2.tambahDosen(d2); 

        // ASOSIASI 
        d1.mengajarDiProdi(p1);
        d2.mengajarDiProdi(p2);

        System.out.println();

        // OUTPUT
        f.tampilProdi();

        System.out.println();

        p1.tampilDosen();
        System.out.println();
        p2.tampilDosen();
    }
}