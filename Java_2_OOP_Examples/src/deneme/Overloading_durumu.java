//1 methodu 2 farklı şekilde kullanma durumuna denir...
package deneme;

public class Overloading_durumu {

    public static void topla(int a, int b) {
        System.out.println("Toplamları : " + (a + b));
    }

    public static void topla(int a, int b, int c) {
        System.out.println("Toplamları : " + (a + b + c));
    }
    public static void topla(String a,String b){
        System.out.println(a+" "+b);
    }
    public static void skorHesapla(String isim,int puan){
        System.out.println(isim+" adlı oyuncunun "+puan+" var");
    }
    public static void skorHesapla(int puan){
        System.out.println("İsimisiz oyunucunun "+puan+" puanı var");
    }
    public static void skorHesapla(String isim){
        System.out.println(isim+" adlı oyuncunun hiç puanı yok ");
    }

    public static void main(String[] args) {
        topla(3, 4, 5);
        System.out.println("------------------");
        topla(2, 5);
        System.out.println("--------------------");
        topla("MERHABA", "DÜNYA");
        System.out.println("*********************");
        skorHesapla("JAVA");
        skorHesapla(1000);
        skorHesapla("JAVA", 1000);
    }
}
