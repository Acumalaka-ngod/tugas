/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ttklp3oop;

/**
 *
 * @author orang
 */
import java.util.Scanner;
public class kopi {
    String Jenis;
    String Asal;
    String Stok;
    double jumlah;
    Scanner scan = new Scanner(System.in);
    
    public void Timbang(){
        System.out.println("sudah timbang");
    }
    public void jenis(String newNama){
        this.Jenis = newNama; 
    }
    public String getNama() {
        return Jenis;
    }            
    public void seduh(){
        System.out.println("sudah di seduh");
    }
    public void tambah(int a, int b){        
        System.out.println(a + b);
    }
    public void tambah(int a ,int b, int c){  //overload      
        System.out.println(a + b + c);
    }
    public void tambah(int a ,int b, int c, int d){        
        System.out.println(a + b + c + d);
    }
}
