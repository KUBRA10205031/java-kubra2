package j03_ScannerClass_TypeCasting;

import java.util.Scanner;

public class C01_ScannerClass {
 public static void main(String[] args) {
    //kullanıcıdan veri almak için (password,ID) şu 3 adım takip edilir:
    // 1. adım --> Scanner Class^dan obje create edilir.
                                           // Scanner Class'ından Scan isminde değerini System içinden alan bir obje .
    Scanner scan =new Scanner(System.in); //Scanner'lardan scan objesi git sen yeni değerini "new Scanner(System.in)" burdan al.

     //2.adım -> Kullanıcıdan istenen veri için bildirimde bulunulur ->sout(" ....");
     System.out.println("adınızı giriniz:");

     //3.adım -> kullanıcının girdiği veri data type'na göre bir variable atanır.

     String isim =scan.nextLine(); // kullanıcıdan giren String tipinde isim verisi scan obje'ni nextLine methoduyla atandı.

     System.out.println("isim = " + isim);//kübra

  /*--------------->>                1.BAŞLIK               ------>>>*/

     /*TASK -> kullanıcın girdiği değere göre kare alanı ve çevresini hesaplayan bir code create ediniz.*/
     Scanner scan1=new Scanner(System.in);
     System.out.println("bir sayı giriniz:");
     int kenaruzunlugu=scan1.nextInt();
     System.out.println("kare alanı:" + (kenaruzunlugu * kenaruzunlugu));//225
     System.out.println("kare çevresi:" + (kenaruzunlugu * 4));//60

     /*TASK -> kullanıcının günde içtiği çay ve kullandığı şeker değerine göre bir yılda kaç kg şeker kullandığını hesaplayan
               bir code create ediniz.
      1 şeker = 1.7 gr
      Örnek : Input :1 günde içilen ->  cay sayısı :10 ; şeker sayısı :2 ; -->1 günde 34 gr şeker 365*34=12.410 gr = 12.41 kg şeker
             Output : Yılda 12.41 kg şeker kullanıyorsunuz.
      */

  Scanner scan0=new Scanner(System.in);
  System.out.println("1 günde içtiğiniz çay sayısını giriniz:");
  int çaysayısı=scan0.nextInt();
  System.out.println("1 günde kullandığınız şeker sayısı:");
  int sekersayısı=scan0.nextInt();

  System.out.println("yıllık şeker tüketim miktarınız:"+((((çaysayısı * sekersayısı) * 1.7)*365)/1000)+"kg");


/*-------------------->>>    2.BAŞLIK      ------------>>>> */


  Scanner scan2=new Scanner(System.in);
  System.out.println("isminizi giriniz:");
  char karakter=scan2.nextLine().charAt(0); // kullanıcı tarafından girilen ifadenin 0. index yani ilk karakterini alır.
  System.out.println("isminizin ilk karakteri:" + karakter);//k


  /* ------------------->>>  3.BAŞLIK  --------------->>>>>  */

  System.out.println("isminizi soyisminizi giriniz:");
  String isim3=scan.nextLine(); // --> kullanıcının girdiği tüm satırı isim'e atar.
  System.out.println("isim3 = " + isim3);//-->> kübra yılmaz


  System.out.println("adınızı ve soyadınızı giriniz:");
  String ad=scan.next(); // --> kullanıcının girdiği ilk ifadeyi ad'e atar.
  System.out.println("ad = " + ad);//--> kübra yılmaz'ın sadece kübra kısmını alır.

 }
}
