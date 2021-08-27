import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int dg;
        String da;

        System.out.print("Doğduğunuz günü girin: ");
        dg = input.nextInt();
        System.out.print("Doğduğunuz ayı girin: ");
        da = input.next();

        if (dg>=1&&dg<=31)
        {
            if(da.equals("ocak")||da.equals("Ocak"))
            {
                if (dg>1&&dg<=21)
                {
                    System.out.println("Burcunuz Oğlak'tır!");
                }
                else
                {
                    System.out.println("Burcunuz Kova'dır!");
                }
            }
            if(da.equals("şubat")||da.equals("Şubat")||da.equals("Subat")||da.equals("subat"))
            {
                if (dg>1&&dg<=19)
                {
                    System.out.println("Burcunuz Kova'dır!");
                }
                else
                {
                    System.out.println("Burcunuz Balık'dır!");
                }
            }
            if(da.equals("Mart")||da.equals("mart"))
            {
                if (dg>1&&dg<=20)
                {
                    System.out.println("Burcunuz Balık'tır!");
                }
                else
                {
                    System.out.println("Burcunuz Koç'tur!");
                }
            }
            if(da.equals("Nisan")||da.equals("nisan"))
            {
                if (dg>1&&dg<=20)
                {
                    System.out.println("Burcunuz Koç'tur!");
                }
                else
                {
                    System.out.println("Burcunuz Boğa'dır!");
                }
            }
            if(da.equals("Mayıs")||da.equals("mayıs")||da.equals("Mayis")||da.equals("mayis"))
            {
                if (dg>1&&dg<=21)
                {
                    System.out.println("Burcunuz Boğa'dır!");
                }
                else
                {
                    System.out.println("Burcunuz İkizler'dir!");
                }
            }
            if(da.equals("Haziran")||da.equals("haziran"))
            {
                if (dg>1&&dg<=22)
                {
                    System.out.println("Burcunuz İkizler'dır!");
                }
                else
                {
                    System.out.println("Burcunuz Yengeç'tir!");
                }
            }
            if(da.equals("Temmuz")||da.equals("temmuz"))
            {
                if (dg>1&&dg<=22)
                {
                    System.out.println("Burcunuz Yengeç'tir!");
                }
                else
                {
                    System.out.println("Burcunuz Aslan'dır!");
                }
            }
            if(da.equals("Ağustos")||da.equals("ağustos")||da.equals("agustos")||da.equals("Agustos"))
            {
                if (dg>1&&dg<=22)
                {
                    System.out.println("Burcunuz Aslan'dır!");
                }
                else
                {
                    System.out.println("Burcunuz Başak'tır!");
                }
            }
            if(da.equals("Eylül")||da.equals("eylül")||da.equals("Eylul")||da.equals("eylul"))
            {
                if (dg>1&&dg<=22)
                {
                    System.out.println("Burcunuz Başak'tır!");
                }
                else
                {
                    System.out.println("Burcunuz Terazi'dir!");
                }
            }
            if(da.equals("Ekim")||da.equals("ekim"))
            {
                if (dg>1&&dg<=22)
                {
                    System.out.println("Burcunuz Terazi'dir!");
                }
                else
                {
                    System.out.println("Burcunuz Akrep'tir!");
                }
            }
            if(da.equals("Kasım")||da.equals("kasım")||da.equals("Kasim")||da.equals("kasim"))
            {
                if (dg>1&&dg<=21)
                {
                    System.out.println("Burcunuz Akrep'tir!");
                }
                else
                {
                    System.out.println("Burcunuz Yay'dır!");
                }
            }
            if(da.equals("Aralık")||da.equals("aralık")||da.equals("Aralik")||da.equals("aralik"))
            {
                if (dg>1&&dg<=22)
                {
                    System.out.println("Burcunuz Yay'dır!");
                }
                else
                {
                    System.out.println("Burcunuz Oğlak'tır!");
                }
            }
        }
        else
        {
            System.out.println("Girilen doğum günü hatalı!");
        }

    }
}
