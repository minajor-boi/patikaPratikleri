
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("--------------------------------------------------");
        System.out.println("Not Ortalaması Hesaplama Programı");
        System.out.println("--------------------------------------------------");
	    System.out.print("Lütfen Matematik dersinizin notunu girin : ");
	    int matNot = input.nextInt();
        System.out.print("Lütfen Fizik dersinizin notunu girin : ");
        int fizNot = input.nextInt();
        System.out.print("Lütfen Kimya dersinizin notunu girin : ");
        int kimNot = input.nextInt();
        System.out.print("Lütfen Türkçe dersinizin notunu girin : ");
        int turNot = input.nextInt();
        System.out.print("Lütfen Tarih dersinizin notunu girin : ");
        int tarNot = input.nextInt();
        System.out.print("Lütfen Müzik dersinizin notunu girin : ");
        int muzNot = input.nextInt();
        System.out.println("--------------------------------------------------");
        Double ortalama = (matNot+fizNot+kimNot+turNot+tarNot+muzNot)/6.0;

        Boolean kosul = ortalama>60;

        System.out.println("Sınıf geçme durmunuz: "+"Ortalama notunuz "+ ortalama + (kosul==true ?" Geçtiniz!":" Kaldınız!"));

        System.out.println("--------------------------------------------------");


        }


    }

