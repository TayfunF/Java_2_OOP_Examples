package deneme;

import java.util.Scanner;

public class user_password {

    public static void main(String[] args) throws InterruptedException {
        Scanner klavye = new Scanner(System.in);

        int giris_hakki = 3; //Max 3 hakkı var .

        String user_id = "TAYFUN";
        String password = "12345";

        System.out.println("****************");
        System.out.println("Hoş Geldiniz");
        System.out.println("*****************");

        while (true) {
            System.out.print("Kullanıcı adınızı giriniz : ");
            String id = klavye.nextLine();
            System.out.print("Şifrenizi Giriniz : ");
            String sifre = klavye.nextLine();

            if (id.equals(user_id) && sifre.equals(password)) {
                System.out.println("////////////////////////////////////////");
                System.out.println("Lütfen bekleyin ...");
                Thread.sleep(2000);
                System.out.println("Giriş başarıı :)");
                break;
            } else if (id.equals(user_id) && (!sifre.equals(password))) {
                Thread.sleep(2000);
                System.out.println("Yanlış şifre girdiniz");
                giris_hakki--;
                System.out.println("Kalan giriş hakkınız : " + giris_hakki);
                System.out.println("-----------------");
            } else if (!id.equals(user_id) && (sifre.equals(password))) {
                Thread.sleep(2000);
                System.out.println("Kullanıcı adı yanlış");
                giris_hakki--;
                System.out.println("Kalan giriş hakkınız : " + giris_hakki);
                System.out.println("-----------------");
            } else {
                System.out.println("Kullanıcı adı ve şifre yanlış ");
                giris_hakki--;
                System.out.println("Kalan giriş hakkınız : " + giris_hakki);
                System.out.println("-----------------");
            }
            
            if (giris_hakki == 0) {
                System.out.println("Hakkınız doldu ! ...");
                break;

            }
        }

    }
}
