/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan701;

/**
 *
 * @author PC-A-30
 */
public class Persegi extends BangunRuang {
    private int panjang, lebar;

    // Konstruktor untuk menginisialisasi panjang dan lebar
    public Persegi(int panjang, int lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }

    // Setter untuk panjang
    public void setPanjang(int panjang) {
        this.panjang = panjang;
    }

    // Setter untuk lebar
    public void setLebar(int lebar) {
        this.lebar = lebar;
    }

    // Implementasi method hitungLuas untuk menghitung luas persegi panjang
    @Override
    public void hitungLuas() {
        this.luas = this.panjang * this.lebar;
        System.out.printf("Menghitung luas persegi panjang\n");
        System.out.printf("````````````````````````````\n");
        System.out.printf("Luas = panjang x lebar\n");
        System.out.printf("  = %d x %d\n\n", this.panjang, this.lebar);
        System.out.printf("  = %.2f\n", this.luas);
    }
}