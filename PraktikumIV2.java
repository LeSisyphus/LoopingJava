package praktikum;
import java.util.Scanner;

public class PraktikumIV2 {
    public static void main(String[] args) {
       Scanner input = new Scanner (System.in);
       double radius,luas;
       final double pi = 3.141592;
       System.out.print("Masukan Jari-Jari : ");
       radius = input.nextDouble();
       luas = pi * radius * radius;
        
       System.out.println("Luas lingkaran anda adalah : " + (Math.round(luas)));
    }
}
