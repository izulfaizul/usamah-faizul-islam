/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package konversi;
import static java.lang.System.exit;
import java.util.Scanner;

/**
 *
 * @author Hewlett-Packard
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        // TODO code application logic here
        // deklarasi variabel
        
        int pilih;
        float d;
      
        
      
        // membuat scanner baru
        Scanner keyboard = new Scanner(System.in);
       
         

        // Tampilkan output ke user
        System.out.println("|--------------------------|");
        System.out.println(" PROGRAM KONVERSI SUHU AIR ");
        System.out.println("|--------------------------|");
        System.out.print("INPUT DATA");
        System.out.print("\n-------------");
        System.out.print("\nSuhu dalam celcius: ");
        // menyimpan nilai pada variabel d
        d = keyboard.nextFloat();
        
        
        do{
        suhu konversi = new suhu(d); //membuat objek kelas suhu
        System.out.print("\nOpsi");
        System.out.print("\n--------");
        System.out.print("\n1. Lihat Data");
        System.out.print("\n2. Edit data");
        System.out.print("\n3. Exit");
        System.out.print("\nPilih : ");
        pilih = keyboard.nextInt(); // menyimpan nilai pada variabel pilih
        if(pilih==1)
        {
        System.out.println("Celcius : " + konversi.c); 
       System.out.println("Kelvin : " + konversi.kelvin());
         System.out.println("Reamur : " + konversi.reamur());
          System.out.println("Fahrenheit : " + konversi.fahrenheit());
          System.out.println("Kondisi air " + konversi.air());
        }
        else if(pilih==2)
        {
                          System.out.print("Suhu dalam celcius: ");
        // menggunakan scanner dan menyimpan apa yang diketik di variabel konversi.c
        konversi.c = keyboard.nextFloat();
        konversi.suhu(konversi.c);
            
        }
        else if(pilih==3)
        {
            exit(0);
        }
        else
        {
            System.out.print("Opsi yang anda masukkan tidak benar, Mohon masukkan opsi yang benar!\n");
            
        }
        }while(pilih!=3);
        
    }

    }
    

