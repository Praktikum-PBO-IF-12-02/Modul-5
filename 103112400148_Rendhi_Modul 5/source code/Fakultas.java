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
public class Fakultas {
    private String nama;
    private String kodeFakultas;
    private String dekan;
    private ArrayList<Prodi> daftarProdi;

    // Constructor
    public Fakultas(String nama, String kodeFakultas, String dekan) {
        this.nama = nama;
        this.kodeFakultas = kodeFakultas;
        this.dekan = dekan;
        this.daftarProdi = new ArrayList<>();
    }

    // Composition
    public void tambahProdi(Prodi prodi) {
        if (!daftarProdi.contains(prodi)) {
            daftarProdi.add(prodi);
        }
    }

    public void tampilkanProdi() {
        System.out.println("Fakultas: " + nama + " (Dekan: " + dekan + ")");
        System.out.println("Daftar Prodi:");
        for (Prodi p : daftarProdi) {
            System.out.println("- " + p.getNama());
        }
    }
}

