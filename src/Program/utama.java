
package Program;

import java.util.Scanner;

public class utama {
  
    public static void main(String[] args) {
        int pilih;
        Scanner s = new Scanner(System.in);
        do
        {
            System.out.println("1.input data");
            System.out.println("2.tampil data");
            System.out.println("3.keluar");
            System.out.print("pilih : "); pilih = s.nextInt();
            }while(pilih!=3);
    }
    
}

