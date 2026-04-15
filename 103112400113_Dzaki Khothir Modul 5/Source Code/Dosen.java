class Dosen {
    String nama;

    // Constructor
    Dosen(String nama) {
        this.nama = nama;
    }

    // Method biasa
    void mengajar() {
        System.out.println(nama + " sedang mengajar");
    }

    // Method ASOSIASI dengan Prodi
    void mengajarDiProdi(Prodi p) {
        System.out.println(nama + "di Prodi " + p.namaProdi);
    }
}