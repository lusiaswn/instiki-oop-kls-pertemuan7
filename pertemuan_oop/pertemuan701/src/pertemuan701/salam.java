/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan701;

/**
 *
 * @author PC-A-30
 */
public class salam {
   private String tx="Tuliskan pesan anda";
   
   public void tulispesan(){
       System.out.println(this.tx);
   } 
   public void tulispesan(String txt1){
       System.out.print(txt1);
   }
 
   // Metode dengan satu parameter String, menampilkan pesan yang diberikan
   public void buatpesan(String txt1) {
       System.out.println(txt1);
   }

}
