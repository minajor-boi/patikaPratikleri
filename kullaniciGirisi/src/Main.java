import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner inpt = new Scanner(System.in);

        String kullaniciAdi,sifre,yeniSifre;

        System.out.print("Kullanıcı Adınızı Girin: ");
        kullaniciAdi = inpt.nextLine();
        System.out.print("Şifrenizi girin: ");
        sifre = inpt.nextLine();

        if (kullaniciAdi.equals("patika")&&sifre.equals("java101"))
        {
            System.out.println("Giriş Yaptınız!");
        }
        else
        {
            System.out.println("Kullanıcı adınız veya şifreniz yanlış!");
            System.out.print("Lütfen bir seçim yapınız: 1-Şifreyi Sıfırla 2-İptal et!: ");
            int secim = inpt.nextInt();
            if (secim==1)
            {
                System.out.print("Lütfen yeni şifreyi girin: ");
                yeniSifre = inpt.next();
                boolean kosul = yeniSifre.equals(sifre)||yeniSifre.equals("java101");
                if (kosul)
                {
                    System.out.println("Şifre oluşturulamadı, lütfen başka şifre giriniz!");
                }
                else
                {
                    System.out.println("Şifreniz oluşturuldu!");

                }

            }

               
            else if (secim==2)
            {
                System.out.println("İşlem iptal edildi. İyi günler!");
            }
            else
            {
                System.out.println("Hatalı seçim yaptınız!");
            }
        }
    }
}
