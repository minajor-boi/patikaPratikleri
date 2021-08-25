import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    double pi=3.14,yariCap,alan,cevre;
    Scanner input = new Scanner(System.in);
    System.out.println("--------------------------------------------------");
    System.out.println("--Dairenin Alanı ve Cevresini Hesaplayan Program--");
    System.out.println("--------------------------------------------------");
    System.out.print("Lütfen dairenizin yarıçapını girin: ");
    yariCap = input.nextDouble();

    alan = pi*yariCap*yariCap;
    cevre = 2*pi*yariCap;
    System.out.println("--------------------------------------------------");
    System.out.println("Dairenizin Alanı: "+ alan +  "birim\u00B2'dir");
    System.out.println("Dairenizin Çevresi: "+ cevre +  "birim");
    System.out.println("--------------------------------------------------");
    }
}
