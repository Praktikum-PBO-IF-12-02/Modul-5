/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dev.renwxyz.praktikum_modul5;
import java.util.ArrayList;

/**
 *
 * @author Rendhi
 */
public class Prodi {
    private String nama;
    private String kodeProdi;
    private String jenjang;
    private String akreditasi;
    private ArrayList<Dosen> daftarDosen;

    // Constructor
    public Prodi(String nama, String kodeProdi, String jenjang, String akreditasi) {
        this.nama = nama;
        this.kodeProdi = kodeProdi;
        this.jenjang = jenjang;
        this.akreditasi = akreditasi;
        this.daftarDosen = new ArrayList<>();
    }

    // Aggregation + sinkronisasi
    public void tambahDosen(Dosen dosen) {
        if (!daftarDosen.contains(dosen)) {
            daftarDosen.add(dosen);
            dosen.tambahProdi(this); // sinkron ke Dosen
        }
    }

    public void tampilkanDosen() {
        System.out.println("Prodi " + nama + " (" + jenjang + ", Akreditasi " + akreditasi + ")");
        System.out.println("Daftar Dosen:");
        for (Dosen d : daftarDosen) {
            System.out.println("- " + d.getNama());
        }
    }

    public String getNama() {
        return nama;
    }
}