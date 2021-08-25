import java.util.Scanner;


public class Main
{

    public static void main(String[] args)
    {
	Scanner input = new Scanner(System.in);
	    System.out.print("1.Sayıyı giriniz: ");
	    int sayi1= input.nextInt();
        System.out.print("2.Sayıyı giriniz: ");
        int sayi2= input.nextInt();
        System.out.println("1-Toplama 2-Çıkartma 3-Çarpma 4-Bölme");
        System.out.print("Yapmak istediğiniz işlemi belirtin: ");
        int islem = input.nextInt();

        switch (islem)
        {
            case 1:
                System.out.println("Birinci ve ikinci sayının Toplamı: "+ (sayi1+sayi2));
                break;
            case 2:
                System.out.println("Birinci ve ikinci sayının Çıkartması: "+ (sayi1-sayi2));
                break;
            case 3:
                System.out.println("Birinci ve ikinci sayının Çarpması: "+(sayi1*sayi2));
                break;
            case 4:
                System.out.println("Birinci ve ikinci sayının Bölmesi: "+ (sayi1/sayi2));
                break;
            default:
                System.out.println("Yanlış sayı! Lütfen belirtilen işlem değerindeki sayıyı yazınız!");
        }
    }
}
