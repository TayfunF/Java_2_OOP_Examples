package deneme;

public class Metodlara_giris {

    public static void selamlama() {
        System.out.println("Merhaba nasılsınız");
        System.out.println("Selamlar");
    }
    public static void faktoriyel_for(){
        int fakt=1;
        for (int i = 1; i <=5; i++) {
            fakt=fakt*i;
        }
        System.out.println(fakt);
    }
    public static void faktoriyel_while(){
        int faktoriyel=1;
        int sayi=5;
        while(sayi>=1){
            faktoriyel=faktoriyel*sayi;
            sayi--;
        }
        System.out.println(faktoriyel);
    }

    public static void main(String[] args) {
        selamlama(); 
        faktoriyel_for();
        faktoriyel_while();
    }
}
