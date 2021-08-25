import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen Ürününüzün fiyatını girin: ");
        int girilen = input.nextInt();
        double kdv = 18;
        if (girilen >= 1000) {
            kdv = 8;
        }
        double hesap = (girilen*kdv)/100;
        double kdvtutar = hesap + girilen;
        System.out.println("Ürününüzün  KDVsiz Fiyatı: "+girilen);
        System.out.println("Ürününüzün KDVli fiyatı: "+ kdvtutar);
        System.out.println("Ürününüzün KDVsi: "+ hesap);
    }
}
