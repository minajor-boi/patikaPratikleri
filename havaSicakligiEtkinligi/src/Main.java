import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Hava sıcaklığını girin: ");
        double sicaklik = input.nextDouble();

        if (sicaklik<5)
        {
            System.out.println("Bu havada yapılacak en güzel etkinlik KAYAK!");
        }
        else if (sicaklik>=5&&sicaklik<15)
        {
            System.out.println("Bu havada yapılacak en güzel etkinlik SİNEMA!");
        }
        else if (sicaklik>=15&&sicaklik<25)
        {
            System.out.println("Bu havada yapılacak en güzel etkinlik PİKNİK!");
        }
        else
        {
            System.out.println("Bu havada yapılacak en güzel etkinlik YÜZME!");
        }
    }
}
