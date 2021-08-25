import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	double armut=2.14,elma=3.67,domates=1.11,muz=0.95,patlican=5.00,hesap,akg,ekg,dkg,mkg,pkg;
	Scanner input = new Scanner(System.in);
        System.out.println("--------------------------------------------------");
        System.out.println("---------------Manav Kasa Programı----------------");
        System.out.println("--------------------------------------------------");
	    System.out.print("Kaç kilogram Armut aldınız: ");
        akg = input.nextDouble();
        System.out.print("Kaç kilogram Elma aldınız: ");
        ekg = input.nextDouble();
        System.out.print("Kaç kilogram Domates aldınız: ");
        dkg = input.nextDouble();
        System.out.print("Kaç kilogram Muz aldınız: ");
        mkg = input.nextDouble();
        System.out.print("Kaç kilogram Patlıcan aldınız: ");
        pkg = input.nextDouble();

        hesap = (akg*armut)+(ekg*elma)+(dkg*domates)+(mkg*muz)+(pkg*patlican);
        System.out.println("--------------------------------------------------");
        System.out.println(akg+" Kilogram Armut Aldınız");
        System.out.println(ekg+" Kilogram Elma Aldınız");
        System.out.println(dkg+" Kilogram Domates Aldınız");
        System.out.println(mkg+" Kilogram Muz Aldınız");
        System.out.println(pkg+" Kilogram Patlıcan Aldınız");
        System.out.println("Toplam ödeyeceğiniz tutar: "+hesap+"TL");
        System.out.println("--------------------------------------------------");

    }
}
