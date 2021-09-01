import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sayi,bolunecekSayi=0,toplami=0;
        System.out.print("Sayı girin: ");
        sayi=input.nextInt();
        for (int i=0; i<=sayi; i++)
        {
            if(i%3==0 && i%4==0)
            {
                System.out.println(i);
                bolunecekSayi++;
                toplami+=i;
            }

        }
        double sonuc = toplami/bolunecekSayi;
        System.out.println("Sonuç: "+ sonuc);
    }
}
