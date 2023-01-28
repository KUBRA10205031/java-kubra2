package J08_ifStatement_TernaryOperator;

public class C01_ifStatement {
    public static void main(String[] args) {
        int krmyas=33;
        int ismlyas=40;

        if (krmyas==ismlyas){ // ---->>>  1 --->>false döndüğü için alt kod çalışmaz diğer şarta gider.
            System.out.println("kerim bey ile ismail bey aynı yaştadır.");
        }
        if(krmyas>=40){ // ------>>>  2 -->> // false döndüğü için alt kod çalışmaz diğer şarta gider.
            System.out.println("kerim bey 40 yaşından büyüktür.");
        }
        if(krmyas+ismlyas>100){// ------->>> 3 --->> false döndüğü için alt kod çalışmaz bitti.
            System.out.println("kerim bey ve ismail beyin yaşları toplamı 100'den büyüktür.");
        }
        /*TRICK -->> if'den sonra süslü parantez  (koymak zorunda değilsiniz ancak karmaşık bir yapı olmaması için
                     yazılması tavsiye edilir.) " { " koyulmazsa ilk noktalı virgüle " ; " kadar çalışır
                     sonrası if kapsamı dışındadır. */
        /* TRICK ---->> CTRL +ALT - l -->> code reformet java format yapar.yani süslü parantezleri düzenler.scope ları sıralar.*/
        /* bağımsız if statement yapıları sadece kendi (kapsamlarını ) run eder.
           birden fazla bağımsız if statement yapıları hepsinin body çalışabileceği gibi hiçbirisini body'de çalışmayabilir.*/












































    }
}
