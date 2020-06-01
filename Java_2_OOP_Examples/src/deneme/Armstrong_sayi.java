package deneme;

import java.util.Scanner;

public class Armstrong_sayi {
    public static void main(String[] args) {
        Scanner klavye=new Scanner(System.in);
        System.out.println("Sayı giriniz");
        int sayi=klavye.nextInt();
        System.out.println("Basamak Sayısı : ");
        int basamak_sayisi=klavye.nextInt();
        int gecici=sayi;
        int toplam=0;
        
        do{
            int basamak_degeri = gecici % 10;
            gecici = gecici/10;
            toplam+=Math.pow(basamak_degeri, basamak_sayisi);
            
        }
        while(gecici>0);
        if(sayi==toplam){
            System.out.println("Armstrong sayıdır");
        }
        else{
            System.out.println("Armstrong sayısı değildir");
        }
    }

}
