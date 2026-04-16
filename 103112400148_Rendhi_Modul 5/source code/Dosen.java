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
public class Dosen {
    private String nama;
    private String nidn;
    private String email;
    private String jabatan;
    private ArrayList<Prodi> daftarProdi;

    // Constructor
    public Dosen(String nama, String nidn, String email, String jabatan) {
        this.nama = nama;
        this.nidn = nidn;
        this.email = email;
        this.jabatan = jabatan;
        this.daftarProdi = new ArrayList<>();
    }

    // Relasi association
    public void tambahProdi(Prodi prodi) {
        if (!daftarProdi.contains(prodi)) {
            daftarProdi.add(prodi);
        }
    }

    // Method utama
    public void mengajar() {
        System.out.println(nama + " (" + jabatan + ") mengajar di:");
        for (Prodi p : daftarProdi) {
            System.out.println("- " + p.getNama());
        }
    }

    public String getNama() {
        return nama;
    }
}