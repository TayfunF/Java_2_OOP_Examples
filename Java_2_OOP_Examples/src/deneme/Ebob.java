package deneme;

import java.util.Scanner;

public class Ebob {

    public static int ebob(int sayi1, int sayi2) {
        int ebob = 1;
        for (int i =1; i <=sayi1 && i<=sayi2; i++) {
            if(sayi1 % i ==0 && sayi2 % i ==0){
                ebob=i;
            }
        }
        return ebob;
    }

    public static void main(String[] args) {
        Scanner klavye = new Scanner(System.in);
        System.out.println("İki tane sayı giriniz");
        int sayi1 = klavye.nextInt();
        int sayi2 = klavye.nextInt();
        System.out.println("Sayıların Ebobu : " + ebob(sayi1, sayi2));
    }
}
