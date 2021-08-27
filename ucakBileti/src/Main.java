import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        int km,yas,secim;
        double perKm=0.1,ucret,yasindirim=0,indirimliUcret,gidisDonusindirim;
        System.out.print("Yolculuk yapacağınız yere uzaklığınızı km cinsinden giriniz: ");
        km = input.nextInt();
        System.out.print("Yaşınızı girin: ");
        yas = input.nextInt();
        System.out.print("Yolculuk Tipinizi Seçin (1=Tek Yön 2=Gidiş Dönüş): ");
        secim = input.nextInt();
        ucret=km*perKm;
        if (yas<12)
        {
            yasindirim= ucret*0.5;
        }
        if (yas>=12&&yas<=24)
        {
            yasindirim= ucret*0.1;
        }
        if (yas>65) {
            yasindirim = ucret * 0.3;
        }

        indirimliUcret=ucret-yasindirim;
        gidisDonusindirim=indirimliUcret-(indirimliUcret*0.2);

        if(km>=1&&yas>=1&&secim==1||secim==2)
        {
            if (yas<12 && secim==1)
            {
                System.out.println("Toplam tutar: "+ indirimliUcret+" TL");
            }
            else if(yas<12 && secim==2)
            {
                System.out.println("Toplam Tutar: "+ gidisDonusindirim*2+" TL");
            }
            else if (yas>=12&&yas<=24 && secim==1)
            {
                System.out.println("Toplam tutar: "+ indirimliUcret +" TL");
            }
            else if(yas>=12&&yas<=24 && secim==2)
            {
                System.out.println("Toplam Tutar: "+ gidisDonusindirim*2+" TL");
            }
            else if (yas>=65 && secim==1)
            {
                yasindirim=0.3;
                System.out.println("Toplam tutar: "+ indirimliUcret +" TL");
            }
            else if(yas>=65 && secim==2)
            {
                yasindirim=0.3;
                System.out.println("Toplam Tutar: "+ gidisDonusindirim*2+" TL");
            }
            else if (secim!=2)
            {
                System.out.println("Toplam Tutar: "+ (km*perKm)+" TL");
            }
            else
            {
                System.out.println("Toplam Tutar: "+ gidisDonusindirim*2 +" TL");
            }
        }
        else
        {
            System.out.println("Seçimlerinizden bir veya birden fazlası hatalı tekrar deneyin!");
        }
    }
}
