public class Dosen {
    private String namaDosen;
    private String nid;

    public Dosen(String namaDosen, String nid) {
        this.namaDosen = namaDosen;
        this.nid = nid;
    }

    public void mengajar() {
        System.out.println(namaDosen + " sedang mengajar");
    }

    public String getNamaDosen() {
        return namaDosen;
    }
}