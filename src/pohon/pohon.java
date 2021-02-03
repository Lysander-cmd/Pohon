
package pohon;

import java.util.Scanner;


public class pohon {
   String nama;
   int tinggi;
   Scanner input = new Scanner(System.in);
   void setNama(){
       System.out.println("Masukan nama : ");
       nama = input.nextLine();
       
   }
   void setTinggi(){
       System.out.println("Masukan tinggi : ");
       tinggi = input.nextInt();
   }
   String getNama(){
       return nama;
   }
   int getTinggi(){
       return tinggi;
   }
}
