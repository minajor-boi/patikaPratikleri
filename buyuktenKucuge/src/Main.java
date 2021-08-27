import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sayi1,sayi2,sayi3;
        System.out.print("Birinci sayıyı girin: ");
        sayi1 = input.nextInt();
        System.out.print("İkinci sayıyı girin: ");
        sayi2 = input.nextInt();
        System.out.print("Üçüncü sayıyı girin: ");
        sayi3 = input.nextInt();


        if (sayi1>sayi2 && sayi2>sayi3)
        {
            if (sayi2>sayi3)
            {
                System.out.println("Sayılar büyükten küçüğe: "+ sayi1+">"+sayi2+">"+sayi3);
            }
            else
            {
                System.out.println("Sayılar büyükten küçüğe: "+ sayi1+">"+sayi3+">"+sayi2);
            }
        }
        else if (sayi2>sayi1 && sayi2>sayi3)
        {
            if (sayi1>sayi3)
            {
                System.out.println("Sayılar büyükten küçüğe: "+ sayi2+">"+sayi1+">"+sayi3);
            }
            else
            {
                System.out.println("Sayılar büyükten küçüğe: "+ sayi2+">"+sayi3+">"+sayi1);
            }
        }
        else if (sayi3>sayi2 && sayi3>sayi1)
        {
            if (sayi2>sayi1)
            {
                System.out.println("Sayılar büyükten küçüğe: "+ sayi3+">"+sayi2+">"+sayi1);
            }
            else
            {
                System.out.println("Sayılar büyükten küçüğe: "+ sayi3+">"+sayi1+">"+sayi2);
            }

        }
    }
}
