package j02_DataTypes_WrapperClass;

public class C05_Interview_Qestions {
 public static void main(String[] args) {

     /*TASK :
        Verilen sayi1 ve sayi2 variable’larinin degerlerini degistiren (SWAP)
        code create edip print ediniz.
        a) 3. bir variable kulanarak
        b) 3. bir variable kullanmadan

     input	: sayi1=20 ve sayi2=34;
	 output  :  sayi1=34 ve sayi2=20

         */

      //HALUK HOCA'NIN ÇÖZÜMÜ -------------->>>>>>
        int sayi1=20;
        int sayi2=34;

        // a)
        System.out.println("*** a çözümü ***");

        System.out.println("Swaptan önce sayı1 -> " +sayi1 + " , " +" sayi2 -> " +sayi2);
        // 1. adım boş bir variable'a sayı atayalım
         int sayi3 = sayi1; /* sayi3'e yeni bir değer atadım artık sayi3'ün değeri (sayi1=20) 20;*/

         //2.adım sayi1'e yeni değerleri atayalım
        sayi1 = sayi2 ; /* sayı2'yi sayı1' e atadım yani sayı1 artık (sayı2=34) 34 olarak güncellendi.*/

        /* ---->> SON DURUM : ---->> sayı1=34 ; sayı2=34 ; sayı3=20; */

        // 3.adım sayı 2'ye temp'e yedeklediğimiz sayı1 değerini atayalım

        sayi2 = sayi3; /* sayı1'i 34 yaptım şimdi sırada sayı2' yi 20 yapmakta ; bu yüzden sayı2'ye sayı3'ün değerini atıyorum (sayı3=20)/*
                       /* artık sayı2=20;/*

         /* ----->> SON DURUM : ------->>>> sayı1=34; sayı2=20;  */

        System.out.println("Swap'tan sonraki sayı1 -> " + sayi1 + " , " + "sayi2 -> " + sayi2);


        // b)
        System.out.println("*** b çözümü ***");
        System.out.println("Swap'tan önce sayi1 -> " + sayi1 + " , " + "sayi2 -> " + sayi2);

        sayi1=sayi1+sayi2;//sayı1=54;

        sayi2=sayi1-sayi2;//sayı2=20;

        sayi1=sayi1-sayi2;//sayi1=34;

        System.out.println("Swap'tan önce sayı1 -> " + sayi1 + " , " + "sayi2 -> " + sayi2);


}
}
