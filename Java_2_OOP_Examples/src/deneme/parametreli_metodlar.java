package deneme;

import java.util.Scanner;

public class parametreli_metodlar {

    public static void topla(int sayi1, int sayi2) {
        System.out.println("Toplam sonucu = " + (sayi1 + sayi2));
    }

    public static int toplama(int x, int y) {

        return x + y;
    }

    public static int ikiilecarp(int a) {
        return a * 2;
    }

    public static int ikiiletopla(int a) {
        return a + 2;
    }

    public static int dortilecarp(int a) {
        return a * 4;
    }

    public static void main(String[] args) {
        Scanner klavye = new Scanner(System.in);
        int sayi1 = 4;
        int sayi2 = 5;
        topla(sayi1, sayi2);
////////////////////////////////////////////////////////////////
        System.out.println("İki adet sayı giriniz : ");
        int x = klavye.nextInt();
        int y = klavye.nextInt();
        System.out.println("Toplama Sonucu = " + toplama(x, y));
//////////////////////////////////////////////////////////////////////
        System.out.println("Triple combo sonucu : " + dortilecarp(ikiiletopla(ikiilecarp(8))));
        
    }
}
