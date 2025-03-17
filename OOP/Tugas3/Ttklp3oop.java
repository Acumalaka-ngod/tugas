/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ttklp3oop;

/**
 *
 * @author orang
 */
public class Ttklp3oop {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        samgrai sangrai = new samgrai();
        kopi Kopi = new kopi();
        sangrai.jenis("Arabika"); // <----- Overloading
        System.out.println(sangrai.getNama());
        System.out.println("1");
        sangrai.Timbang();
        Kopi.Timbang();
        sangrai.seduh();        
        Kopi.tambah(3,3);
//        sangrai.tambah();
    }    
}
