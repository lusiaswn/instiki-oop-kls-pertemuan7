/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pertemuan701;

/**
 *
 * @author lusia
 * 09 Mei 2025
 */
public class Pertemuan701 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Membuat objek dari kelas Persegi
        Persegi ps = new Persegi(8, 5);
        
        // Memanggil metode untuk menghitung luas
        ps.hitungLuas();
        
        // Jika ingin mengubah panjang dan lebar setelah objek dibuat
        ps.setPanjang(10);
        ps.setLebar(6);
        
        // Menghitung luas setelah perubahan
        ps.hitungLuas();
    }
}