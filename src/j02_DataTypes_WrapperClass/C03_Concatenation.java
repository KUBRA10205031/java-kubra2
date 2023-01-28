package j02_DataTypes_WrapperClass;// WrapperClass(SARMALAYICI)

public class C03_Concatenation {  // concatenation = birleştirme
    public static void main(String[] args) {


        String ad="pembegül kübra";
        String soyad="yılmaz";

        int a=7;
        int b =11;

        // Birden çok String ve farklı variabler " + "ile" işleme alınırsa java "birleştirme" yaparak yeni bir "String" oluşturur.

        /*
        TRICK-> Concatenation' da String mürekkep gibidir,girdiği yeri boyar ,öncesinde eğer String yoksa normal işlem yapar ,
        ama String geldikten sonra her şey String olur.Mürekkep gibi boyar geçer.
       */

        System.out.println(ad+soyad+a+b);  // -> pembegülkübrayılmaz711 (başında String bir ifade olan ad olduğu için
                                           // sonra gelen değerleri de String gibi concat etti birleştirdi.)

        System.out.println(a+ad+soyad+b); // -> 7pembegülkübrayılmaz11

        System.out.println(a+b+ad+soyad); // -> (7+11=18)pembegülkübrayılmaz ->18pembegülkübrayılmaz

        System.out.println(" "+a+b); // ->  boşluk711 (" " içi String olduğu için diğerleri de String oldu)

        System.out.println(ad + soyad + (a + b));// -> pembegülkübrayılmaz(7+11=18) -> pembegülkübrayılmaz18

        System.out.println((a + b) + ad + soyad);// ->(7+11=18)pembegülkübrayılmaz -> 18pembegülkübrayılmaz

        System.out.println(ad+(a-b)+(a-b));// ->pembegülkübraconcat(7-11=-4)concat(7-11=-4) ->pembegülkübrayılmaz-4-4

        System.out.println(ad+((a-b)+(a-b)));// ->pembegülkübraconcat((7-11=-4)+(7-11=-4) -> pembegülkübrayılmaz-8;

        char ch='1'; //
        System.out.println(ad+ch); //->pembegülkübra1;

        System.out.println(a+ch+ad); // -> (7+(1=ascı değeri=49)=56)pembegülkübra ->56pembegülkübra
                                     /*
                                     TRICK -> int ile char değeri concat olmaz charın karakter değeri ile toplanır.
                                      */

        System.out.println(ad+(ch+b)); // -> pembegülkübra((1=ascıı değeri =49)+11=60) ->pembegülkübra60;

        System.out.println(a+ad+ch);// -> 7pembegülkübra1

        /*
        TRICK -> char data türü işleme girdiği variables'in türüne göre farklı işlem yapar.
                 eğer işleme girdiği variables aritmetik bir işlemse ascii değeri ile işlem yapar.
                 1-char-String -> concat olur
                 2- char-int,byte,double -> ascii değeri ile işlem yapar.
         */

        /*
        TRICK -> bir aritmetik işlem içinde String kullanılırsa , aritmetik işlem önceliğine göre
                 işlem yapılıp String variable 'a Concatenation yapılır.
         */

        /*
        TRICK -> birden çok String variable ile farklı data type variable'ler + ile işleme alınırsa
                    java birleştirme yaparak yeni bir String oluşturur.
         */



    }
}
