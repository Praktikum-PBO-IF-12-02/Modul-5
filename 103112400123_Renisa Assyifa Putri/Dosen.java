public class Dosen {
    private String namaDosen;
    private String nip;

    public Dosen(String namaDosen, String nip) {
        this.namaDosen = namaDosen;
        this.nip = nip;
    }

    public void mengajar(Prodi prodi) {
        System.out.println("Dosen " + this.namaDosen
                + " sedang mengajar di Program Studi " + prodi.getNamaProdi());
    }

    public String getNama() {
        return this.namaDosen;
    }

    public String getNip() {
        return this.nip;
    }
}
