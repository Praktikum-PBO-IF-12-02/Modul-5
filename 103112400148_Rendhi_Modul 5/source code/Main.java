/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dev.renwxyz.praktikum_modul5;

/**
 *
 * @author Rendhi
 */
public class Main {
    public static void main(String[] args) {

        // Fakultas
        Fakultas fakultas = new Fakultas(
            "Fakultas Informatika",
            "FI01",
            "Dr. Rahmat"
        );

        // Prodi
        Prodi teknikInformatika = new Prodi(
            "Teknik Informatika",
            "TI01",
            "S1",
            "A"
        );

        Prodi sainsData = new Prodi(
            "Sains Data",
            "SD01",
            "S1",
            "A"
        );

        // Hubungkan ke Fakultas
        fakultas.tambahProdi(teknikInformatika);
        fakultas.tambahProdi(sainsData);

        // Dosen
        Dosen d1 = new Dosen("Budi", "123", "budi@email.com", "Lektor");
        Dosen d2 = new Dosen("Sari", "456", "sari@email.com", "Asisten Ahli");

        // Relasi Dosen - Prodi
        teknikInformatika.tambahDosen(d1);
        teknikInformatika.tambahDosen(d2);

        sainsData.tambahDosen(d2); // Sari mengajar di 2 prodi

        // Output
        fakultas.tampilkanProdi();
        System.out.println();

        teknikInformatika.tampilkanDosen();
        System.out.println();

        sainsData.tampilkanDosen();
        System.out.println();

        d1.mengajar();
        System.out.println();

        d2.mengajar();
    }
}