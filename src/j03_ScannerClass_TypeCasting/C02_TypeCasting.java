package j03_ScannerClass_TypeCasting;

import java.util.Scanner;

public class C02_TypeCasting {
 public static void main(String[] args) {

 /* ---------->>>>>       1.BAŞLIK    ---->>>>>> AUTO WİDENİNG ------>>>>*/

     /* byte < short < int < long < float < double
            Auto Widening Casting -> küçük data type'larını büyük data type'larına Java otomatik olarak dönüştürür.*/



   /* --->>  1.ÖRNEK  --->>>>  */


     boolean basarılı=true;
     /*String basarı=basarılı;  ------>>> doğal uyum olmayan variable'larda casting yapılmaz "CTE" verir.derlemez. */
     boolean basarı=basarılı;
     System.out.println("basarı = " + basarı);//true
     System.out.println("basarılı = " + basarılı);//true

    /* ---->>>   2.ÖRNEK  ---->>>>  */

     double sayı=17; /* --> double normalde ondalık sayıdır ancak ben double variable'a int 17 atadım. küçük(int)->büyük(double)*/
     System.out.println("sayı = " + sayı);//17.0

     int sayı1=33;
     int sayı2=7;

     System.out.println("sayı1/sayı2 = " + sayı1 / sayı2); //4 -->> java iki int sayıyı birbirine böldüğümüzde sonucu int verir.
                                                                 // --> eğer böllme işleminde sonuç ondalık çıkarsa ondalık kısmı siler.
    byte sayı3= 127;
    int sayı4= sayı3; // byte ->int casting yaptım küçük -> büyüğe auto widening yapıldı atandı.
     System.out.println("sayı4 = " + sayı4);//127


   /*  ----->>>   3.ÖRNEK ---->>>> */

     int num=1453;
     double d=num ; //küçük -> büyük auto widening yapıldı
     System.out.println("d = " + d);//1453.0;
                 // double/int
     double db =    d    /   num ;                     /* TRICK --> iki farklı data type sayı işleme girerse
                                                         java küçük olan data type türü için Auto Widening yapar
                                                         sonucu büyük olan data type olarak verir.*/
     System.out.println("db = " + db);//1.0


     /*--------------->>>>       2.BAŞLIK  ------>>>>EXPLİCİT NARROWİNG ----->>>>*/

     /* byte < short < int < long < float < double
     Explicit Narrowing Casting -> büyük data type'larını küçük data type'larına çevirme işlemini veri kaybından dolayı
     Java otomatik olarak yapmaz< kod ile teyit ister.
      */




     /*  -->>   1.ÖRNEK   -->>  */

     double d2= 14.53;
     int num2= (int) d2;    //büyük sayıyı küçük sayıya atadım hata verdi. --> üstüne tıkladım cast et diye komut verdim.
                            // double olan büyük bir sayıyı küçük sayıya çevirdim casting yaptım.

     System.out.println("num2 = " + num2);//14

     /*  -->>   2.ÖRNEK   ->>> */

     int num3=150;
     byte b1= (byte) num3;
     System.out.println("b1 = " + b1);//b1 =-106(150-127=23,23-128=-105-1(0)=-106) byte (-128 -,0,1,2, - 127 )


     /*  -->>  3.ÖRNEK  --->>>   */

     double d3=333;
     long l = (long) d3;
     System.out.println("l = " + l);//333;

     double d4=571.4444;
     long l2= (long) d4;
     System.out.println("l2 = " + l2);//571


     /* TASK --->> kullanıcıdan bir karakter girmesini isteyin ve girilen karakteri ve ascii değerini yazın.
                  örnek:
                  Input: a
                  Output : Girdiğiniz karakterin ascii değeri :97;               */

     Scanner scan=new Scanner(System.in);
     System.out.println("bir karakter giriniz:");

      char ascii=scan.nextLine().charAt(0);
      int deger=ascii;
     System.out.println(ascii+" 'ın  ascii değeri = " + deger);//97;


 }
}
