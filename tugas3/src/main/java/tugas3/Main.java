
package tugas3;
import java.util.Scanner;
//import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        //GUI g = new GUI();
        int p,l,t=0,kell,luas,v,lp;
        System.out.println("Masukan : ");
        Scanner input = new Scanner(System.in);
        System.out.println("panjang = ");p = input.nextInt();
        System.out.println("lebar = ");l = input.nextInt();
        System.out.println("tinggi = ");t = input.nextInt();
        
        luas = p*l;
        kell = 2*(p+l);
        v = p*l*t;
        lp = 2*(p*l+p*t+l*t);
        
        System.out.println("Luas =  " + luas + " Keliling = " + kell + " Volume = " + v + " Luas Permukaan = " +lp);
    }
    
}
