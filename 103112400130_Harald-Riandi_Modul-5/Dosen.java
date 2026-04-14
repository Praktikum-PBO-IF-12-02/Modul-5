public class Dosen {
    private String namaDosen;
    private String nip;

    public Dosen(String namaDosen, String nip) {
        this.namaDosen = namaDosen;
        this.nip = nip;
    }

    public void mengajar() {
        System.out.println("Dosen " + this.namaDosen + " sedang mengajar.");
    }

    public String getNama() {
        return this.namaDosen;
    }

    public String getNIP() {
        return this.nip;
    }
}