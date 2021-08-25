import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	double aKenar,bKenar,cKenar,alan,x;
	System.out.println("-----------------------------------------------");
	System.out.println("-----Dik üçgen Hipotenüs ve Alan Hesaplama-----");
	System.out.println("-----------------------------------------------");
	System.out.print("Lütfen üçgenimizin a kanerını girin: ");
	aKenar = input.nextInt();
	System.out.print("Lütfen üçgenimizin b kanerını girin: ");
	bKenar = input.nextInt();

	cKenar = Math.sqrt((aKenar*aKenar)+(bKenar*bKenar));

	cKenar = Math.sqrt ((aKenar*aKenar) + (bKenar*bKenar));

	x = (aKenar+bKenar+cKenar)/2.0;
	alan = Math.sqrt (x*(x-aKenar)*(x-bKenar)*(x-cKenar));

	System.out.println("-----------------------------------------------");
	System.out.println("Üçgenimizin Hipotenusu(c kenarı):"+cKenar );
	System.out.println("Üçgenimizin Alanı:"+alan );
	System.out.println("-----------------------------------------------");





    }
}
