import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        double boy,kg,vke;
        Scanner input = new Scanner(System.in).useLocale(Locale.FRANCE);

        System.out.print("Lütfen Boy Uzunluğunuzu Girin(Metre cinsimden Exmpl(179cm =1,79)): ");
        boy=input.nextDouble();
        System.out.print("Lütfen Kilonuzu Girin: ");
        kg=input.nextDouble();

        vke = kg/(boy*boy);

        if(vke<18.49)
        {
            System.out.println("Vücut Kitle Endeksiniz: "+vke +" İdeal Kilonuzun Altındasınız!");
        }
        else if (vke>=18.5 && vke<=24.99)
        {
            System.out.println("Vücut Kitle Endeksiniz: "+vke +" İdeal Kilonuzdasınız!");
        }
        else if (vke>=25&&vke<=29.99)
        {
            System.out.println("Vücut Kitle Endeksiniz: "+vke +" İdeal Kilonuzun Üzerindesiniz!");
        }
        else
        {
            System.out.println("Vücut Kitle Endeksiniz: "+vke +" İdeal Kilonuzun Çok Üzerindesiniz!");
        }



    }
}
