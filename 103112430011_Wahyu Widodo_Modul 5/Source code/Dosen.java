/**
 *
 * @author wahyuuuwid
 */

public class Dosen {
    private String namaDosen;
    private String nidn;

    public Dosen(String namaDosen, String nidn) {
        this.namaDosen = namaDosen;
        this.nidn = nidn;
    }

    public void mengajar() {
        System.out.println(namaDosen + " sedang mengajar");
    }

    public String getNamaDosen() {
        return namaDosen;
    }
}