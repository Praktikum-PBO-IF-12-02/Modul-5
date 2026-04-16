public class Main {
    public static void main(String[] args) {
        // 1. Membuat objek Dosen - eksis secara independen di memori
        //    (sesuai aturan: "Dosen tetap ada walaupun tidak terdaftar di Prodi")
        Dosen dosen1 = new Dosen("Nadia Tambunan", "198501012010121001");
        Dosen dosen2 = new Dosen("Renisa Assyifa Putri", "198702022011122002");
        Dosen dosen3 = new Dosen("Abu Abdirrahman Humaid", "198903032012123003");

        // 2. Membuat objek Fakultas sebagai induk hierarki
        Fakultas fasilkom = new Fakultas("Ilmu Komputer");

        // 3. KOMPOSISI: Prodi diciptakan DI DALAM Fakultas
        fasilkom.tambahProdi("Teknik Informatika");
        fasilkom.tambahProdi("Software Engineering");

        // 4. AGREGASI: mengambil referensi Prodi, lalu menambahkan Dosen
        Prodi prodiTI = fasilkom.getProdi(0);
        Prodi prodiSE = fasilkom.getProdi(1);

        prodiTI.tambahDosen(dosen1);
        prodiTI.tambahDosen(dosen2);
        prodiSE.tambahDosen(dosen3);
        prodiSE.tambahDosen(dosen1); // dosen1 dipakai 2 Prodi -> bukti shared reference

        // 5. Menampilkan seluruh hierarki data
        fasilkom.tampilkanData();

        // 6. ASOSIASI: Dosen memanggil method dengan parameter Prodi
        System.out.println("\n--- Demonstrasi Asosiasi Dosen dengan Prodi ---");
        dosen1.mengajar(prodiTI);
        dosen2.mengajar(prodiTI);
        dosen3.mengajar(prodiSE);
        dosen1.mengajar(prodiSE);
    }
}
