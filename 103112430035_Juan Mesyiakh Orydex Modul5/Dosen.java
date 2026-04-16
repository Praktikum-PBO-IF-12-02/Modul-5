class Dosen {
    String nama;
    String nidn;

    public Dosen(String nama, String nidn) {
        this.nama = nama;
        this.nidn = nidn;
    }

    public void mengajar() {
        System.out.println(nama + " sedang mengajar");
    }
}