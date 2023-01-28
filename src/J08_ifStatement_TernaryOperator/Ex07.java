package J08_ifStatement_TernaryOperator;

import java.util.Scanner;

public class Ex07 {
    public static void main(String[] args) {
        /*TASK-->> kullanıcının ehliyetinin varlığını kontrol ediniz.
        ehliyeti varsa yıl tecrübesi 7 yıl ve üstü ise aldığı mesafe 100.000 km ve üzeri ise kontak anahtarı veriniz.
        aksi durumda tecrübe yılı vve mesafe eksikliklerini print eden code create ediniz.*/

        Scanner scan=new Scanner(System.in);
        System.out.println("ehliyetiniz var mı? var ise 'E' yok ise 'H' giriniz.");
        char cevap=scan.next().toUpperCase().charAt(0);

       if(cevap=='E') {
           System.out.println("kaç yıl tecrübeniz var?");
           int tecrübe=scan.nextInt();
            if(tecrübe>7){
                System.out.println("kattetiğiniz yol bilgisini km olarak giriniz.");
                int mesafe= scan.nextInt();
                 if(mesafe>100000){
                     System.out.println("tebrikler anahtarı alabilirsiniz.");


                 }else{
                     System.out.println("anahtarı almanıza " + (100000 - mesafe) + " km kaldı.");
                 }
            }else {
                System.out.println("anahtarı alabilmeniz için" + (7 - tecrübe) + "yıl daha tecrübe kazanmalısınız.");
            }



       }else if (cevap=='H') {
           System.out.println("önce ehliyetinizi alınız.");


       }else {
           System.out.println("dü<gün bir ifade giriniz:");
       }





    }
}
