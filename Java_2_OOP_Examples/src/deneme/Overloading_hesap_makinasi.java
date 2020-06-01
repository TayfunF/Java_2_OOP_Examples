package deneme;

import java.util.Scanner;

public class Overloading_hesap_makinasi {

    public static int cikarma(int a, int b) {
        return (a - b);
    }

    public static double bolme(int a, int b) {
        return ((double) a / b);
    }

    public static int toplama(int a, int b) {
        return (a + b);
    }

    public static int toplama(int a, int b, int c) {
        return (a + b + c);
    }

    public static int carpma(int a, int b) {
        return (a * b);
    }

    public static int carpma(int a, int b, int c) {
        return (a * b * c);
    }

    public static void main(String[] args) throws InterruptedException {
        Scanner klavye = new Scanner(System.in);
        String islemler
                = "1. Toplama İşlemi\n"
                + "2. Çıkarma İşlemi\n"
                + "3. Çarpma  İşlemi\n"
                + "4. Bölme   İşlemi\n"
                + "5. İşlemi sonlandırma\n";
        System.out.println("************************");
        System.out.println(islemler);
        System.out.println("************************");
       
        int sayi1,sayi2,sayi3;
        
        while (true) {
            System.out.println("Bir işlem numarası giriniz : ");
            String islem = klavye.nextLine();
            if (islem.equals("5")) {
                System.out.println("İşlem sonlandırılıyor");
                Thread.sleep(500);
                System.out.println("İşleminiz sonlandı");
                break;
            }
            else if (islem.equals("1")){
                System.out.print("Toplanacak Sayıları giriniz :");
                sayi1=klavye.nextInt();
                sayi2=klavye.nextInt();
                sayi3=klavye.nextInt();
                klavye.nextLine();
                System.out.println("İki sayılı toplama işlemi sonucu : "+toplama(sayi1, sayi2));
                System.out.println("Üç sayılı toplama işlemi sonucu :"+toplama(sayi1, sayi2, sayi3));
            }
            else if (islem.equals("2")){
                System.out.println("Çıkarılacak iki sayı giriniz :");
                sayi1=klavye.nextInt();
                sayi2=klavye.nextInt();
                klavye.nextLine();
                cikarma(sayi1, sayi2);
          
            }
            else if (islem.equals("3")){
                System.out.println("Çarpılacak iki tane sayı giriniz :");
                sayi1=klavye.nextInt();
                sayi2=klavye.nextInt();
                sayi3=klavye.nextInt();
                klavye.nextLine();
                carpma(sayi1, sayi2);
                carpma(sayi1, sayi2, sayi3);
            }
            else if (islem.equals("4")){
                System.out.print("Çarpılacak Sayıları giriniz :");
                sayi1=klavye.nextInt();
                sayi2=klavye.nextInt();
                klavye.nextLine();
                bolme(sayi1, sayi2);
            }
            else{
                System.out.println(" ");
            }
        }
    }
}
