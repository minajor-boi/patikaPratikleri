import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    double km,perKm=2.20,hesap,acilisTutar=10.0,minTutar=20.0;
    System.out.println("--------------------------------------------------");
    System.out.println("------------Taksimetre Ücret Hesaplama------------");
    System.out.println("--------------------------------------------------");
    System.out.print("Lütfen gidilecek Km'yi yazın: ");
    km = input.nextDouble();
    hesap = (km*perKm)+acilisTutar;
    boolean sonuc = hesap>=minTutar;
    System.out.println("--------------------------------------------------");
    System.out.println("Taksimetre ücretiniz: "+ (sonuc==true ? hesap : minTutar)+"TL");
    System.out.println("--------------------------------------------------");
    }
}
