package deneme;

import java.util.Scanner;

public class Faiz_Uygulaması {

    public static void main(String[] args) {

        Scanner klavye = new Scanner(System.in);
        System.out.println("Banka faiz oranı %6 ' dır...");

        int anapara, vade;
        System.out.print("Yatırmak istediğiniz tutarı giriniz : ");
        anapara = klavye.nextInt();
        System.out.print("Kaç yıl vadeli yatıracaksınız ? ");
        vade = klavye.nextInt();

        double toplam_para = anapara;
        double faizOrani=0.06;
            for (int i = 1; i <=vade; i++) {
            toplam_para=toplam_para+(toplam_para*faizOrani);
                System.out.println(i+". yılın sonunda : "+ (int)toplam_para);
            }
    }
}
