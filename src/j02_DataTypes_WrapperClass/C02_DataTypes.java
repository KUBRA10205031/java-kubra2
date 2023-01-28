package j02_DataTypes_WrapperClass;

public class C02_DataTypes {
    public static void main(String[] args) {
 /*
		 Java'da  2 farkli data type vardir.
		 1)Primitive Data Type (8 tane)

		   a)boolean: Sadece True veya False değerlerini alabilir. sadece iki farkli deger alabildigi icin memory'de az(bir bit'lik) alan kaplar

		   b)char :Tek character'li (S, ?, 3, * gibi her bir sembol) ifadeler icin char data type'i kullanilir.
		   		her bir char memory'de 16 bit'lik yer kaplar.char deger mutlaka tek tirnak icine konulmalıdilir.
		   		char değerler aritmetik islemler için charlarin ASCII ("American Standard Code for Information Interchange") Table'daki degerlerini alır.

		   c)byte : -128'den +127 ye kadar tum tam sayi degerlerini alır.
		   		byte variable -> memory'de 8 bitlik alan kaplar.

		   d)short : -32768'den 32767'ye kadar tum tam sayi degerlerini alır.
		   		short variable -> memory'de 16 bıt alan kaplar.

		   e)int : -2,147,483,648'den 2,147,483,647'ye kadar tum tam sayi degerlerini alır.
		  		int variable -> memory'de 32 bit alan kaplar.

		   f)long : -9,223,372,036,854,755,808'den 9,223,372,036,854,755,807'ye kadar tum tam sayi degerlerini alır.
		   		long variable -> memory'de 64 bit alan kaplar.

		   g)float : ondalikli sayilar icin kullanilır.
		   		float variable -> memory'de 32 bit kullanir.
		   		float variable -> ondalik kisimlarinda en fazla 7 rakam barindirabilir.
		   		0.1234567
		   		Bir ondalikli sayinin float oldugunu belirlemek icin en sona(1.23f veya 1.23F) 'f' veya 'F' yazılmalıdır aksi halde variable double olarak tanımlanır.


		   h)double : ondalikli sayilar icin kullanılır.
		   		double variable -> memory'de 64 bit kullanir.
		 		double variable -> ondalik kisimlarinda en fazla 16 rakam barindirabilirler.
		 		0.1234567890123456

		 2)Non-Primitive Data Type
		 	String: Cift tirnak arasina yazilan sifir veya daha fazla character'lerden olusan variable.
		 */

        String name="özgür";
        String yas="13";
        int age=34;
        int yıl=2023;
                boolean emekliMi= true;
                boolean ıtci=true;
                char ch='$';
                char tırnak='A';



          //TASK -> 1999 yılında doğan bir kişinin yaşını yazdırınız...

        int dogumyılı=1999;
        int bulundugumuzyıl=2022;

        System.out.println("kişinin yaşı:"+(bulundugumuzyıl-dogumyılı));
        System.out.println(2022-1999);//23 sonucunu alırız ancak bu 23 değerini hafızadan alıp bir yerde kullanabilmek için
                                      // bir konteynıra bağladım.int tipinde bir konteynıra.

        float f1=12.45f;
        float f2=23.56f;
        double boy=1.85;
        System.out.println(f1 * f2);//12.45*23.56=293.322


        //TASK -> iki farklı byte tanımlayıp toplam ve farkını print ediniz.
         byte sayı1=50;              // byte sayı1=50,sayı2=55;
         byte sayı2=55;              // sout(sayı1+sayı2);
        System.out.println("sayı1+sayı2 = " + (sayı1 + sayı2));//115
        System.out.println("sayı2-sayı1 = " + (sayı2 - sayı1));//5

        //TASK -> iki farklı tamsayı türünde sayı tanımlayıp toplam ve farkını print ediniz.

        int sayı=50;
        byte sayı0=60;

        System.out.println("sayı0+sayı = " + (sayı0 + sayı));//110
        System.out.println("sayı1-sayı0 = " + (sayı1 - sayı0));//10

        //TASK -> tamsayı ve ondalıklı sayı tanımlayıp toplam ve farkını print ediniz.

        int SAYI=20;
        double SAYI0=15.5;

        System.out.println("SAYI0+SAYI0 = " + (SAYI0 + SAYI0));//35.5
        System.out.println("(SAYI-SAYI0) = " + (SAYI - SAYI0));//4.5

        //TASK -> tamsayı ve char data type iki variable tanımlayıp toplamını print ediniz.

        int rakam=10;
        char karakter='$';//(toplama girdiği için -> $ 'ın ascıı değerini getirdi)

        System.out.println("rakam+karakter = " + rakam + karakter);//$ ascıı değeri = 36 olarak aritmetiğin içine girdi 36+10=46;

        //TASK -> ad ve soyadınızı ve yaşınızı print ediniz.

        String ad="pembegül kübra",soyad="yılmaz";
        int yasım=32;
        System.out.println("ad+soyad+yasım = " + ad +" " + soyad + " " + yasım);//pembegül kübra yılmaz 32


    }
}
