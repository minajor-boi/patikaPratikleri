import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double matNot,fizNot,kimNot,turNot,muzNot;
        System.out.print("Lütfen Matematik Dersinden aldığınız notu girin: ");
        matNot = input.nextInt();
        System.out.print("Lütfen Fizik Dersinden aldığınız notu girin: ");
        fizNot = input.nextInt();
        System.out.print("Lütfen Kimya Dersinden aldığınız notu girin: ");
        kimNot = input.nextInt();
        System.out.print("Lütfen Türkçe Dersinden aldığınız notu girin: ");
        turNot = input.nextInt();
        System.out.print("Lütfen Müzik Dersinden aldığınız notu girin: ");
        muzNot = input.nextInt();
        if(matNot>=0&&matNot<=100)
        {
            if (fizNot>=0&&fizNot<=100)
            {
                if (kimNot>=0&&kimNot<=100)
                {
                    if (turNot>=0&&turNot<=100)
                    {
                        if (muzNot>=0&&muzNot<=100)
                        {
                            double hesap = (matNot+fizNot+kimNot+turNot+muzNot)/5;
                            if (hesap>=55)
                            System.out.println("Tebrikler sınıfı geçtiniz ortalamanız: "+hesap);
                            else
                            {
                            System.out.println("Üzgünüm sınıfı geçemediniz ortalamanız: " + hesap);
                            }
                        }
                        else
                        {
                            System.out.println("Müzik notunuzu hatalı girdiniz tekrar deneyin!");
                        }
                    }
                    else
                    {
                        System.out.println("Türkçe notunuzu hatalı girdiniz tekrar deneyin!");
                    }
                }
                else
                {
                    System.out.println("Kimya notunuzu hatalı girdiniz tekrar deneyin!");
                }

            }
            else
            {
                System.out.println("Fizik notunuzu hatalı girdiniz tekrar deneyin!");
            }
        }
        else
        {
            System.out.println("Matematik notunuzu hatalı girdiniz tekrar deneyin!");
        }
    }
}
