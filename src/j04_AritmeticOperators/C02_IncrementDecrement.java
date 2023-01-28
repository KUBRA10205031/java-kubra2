package j04_AritmeticOperators;

public class C02_IncrementDecrement {
    public static void main(String[] args) {
        System.out.println("   ****** Increment / Artırma  ********");

        int a=7;

        System.out.println(++a);       // 8 a=8
        System.out.println(a++);       // 8 önce a'yı yazdır -> 8 , sonra a'yı bir arttır. a=8+1=9; a'nın yeni değeri =9 atandı
        System.out.println(a);         // 9
        System.out.println(a++ + ++a); // önce a'yı yazdırır sonra 1 arttırır.
                                       // a=9 -> yazıldı -> a+1=9+1 =10 -> a'nın yeni değeri artık 10
                                       // ++a önce a'yı arttır -> a+1=10+1=11 --> a'nın yeni değeri =11 -> sonra yazdır.
                                       // SONUC: 9+11=20;


    }
}
