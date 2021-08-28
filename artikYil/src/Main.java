import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int yil;
        Scanner input = new Scanner(System.in);
        System.out.print("Yil giriniz: ");
        yil = input.nextInt();

        if (yil%4==0)
        {
            System.out.println(yil+" Artık bir yıldır!");
        }
        else
        {
            System.out.println(yil+" Artık bir yıl değildir!");
        }

    }
}
