import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        int dy,sonuc;
        System.out.print("Doğum yılınızı girin: ");
        dy=input.nextInt();

        sonuc = dy%12;

       if (sonuc>=0&&sonuc<=11)
       {
           if (sonuc==0)
           {
               System.out.println("Çin Zodyağı Burcunuz: Maymun");
           }
           else if (sonuc==1)
           {
               System.out.println("Çin Zodyağı Burcunuz: Horoz");
           }
           else if (sonuc==2)
           {
               System.out.println("Çin Zodyağı Burcunuz: Köpek");
           }
           else if (sonuc==3)
           {
               System.out.println("Çin Zodyağı Burcunuz: Domuz");
           }
           else if (sonuc==4)
           {
               System.out.println("Çin Zodyağı Burcunuz: Fare");
           }
           else if (sonuc==5)
           {
               System.out.println("Çin Zodyağı Burcunuz: Öküz");
           }
           else if (sonuc==6)
           {
               System.out.println("Çin Zodyağı Burcunuz: Kaplan");
           }
           else if (sonuc==7)
           {
               System.out.println("Çin Zodyağı Burcunuz: Tavşan");
           }
           else if (sonuc==8)
           {
               System.out.println("Çin Zodyağı Burcunuz: Ejderha");
           }
           else if (sonuc==9)
           {
               System.out.println("Çin Zodyağı Burcunuz: Yılan");
           }
           else if (sonuc==10)
           {
               System.out.println("Çin Zodyağı Burcunuz: At");
           }
           else {
               System.out.println("Çin Zodyağı Burcunuz: Koyun");
           }
       }
       else
       {
           System.out.println("Hatalı bir işlem yaptınız tekrar deneyin!");
       }
    }
}
