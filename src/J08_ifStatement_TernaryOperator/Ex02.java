package J08_ifStatement_TernaryOperator;

import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        /*TASK -->> kullanıcıdan 100 üzerinden not isteyiniz.
                    not'u harf sistmeine çevirip yazdırın.
                    50' den küçükse "D" ,
                    =50 <60 arası "C",
                    =60  <80 aras "B",
                    =80 'nin üzerinde ise "A"   */


        /*------------>>> 1. ÇÖZÜM ----->>>> */


        Scanner scan=new Scanner(System.in);
        System.out.println("notunuzu giriniz:");
        int not =scan.nextInt();

        if (not<50 && not>=0){
            System.out.println("harf notunuz 'D' dir.");
        }else if (not>=50 && not<60){
            System.out.println("harf notunuz 'C' dir.");
        }else if(not>=60 && not<80){
            System.out.println("harf notunuz 'B' dir.");
        } else if (not >=80 && not<=100) {
            System.out.println("harf notunuz 'A' dır.");

        }else{
            System.out.println("0-100 aralığında not giriniz:");
        }


        /* --------------->>>>>>  2.ÇÖZÜM --------->>>>>>>> */

        Scanner scan1=new Scanner(System.in);
        System.out.println("notunuzu giriniz:");
        int not1 =scan.nextInt();

        if (not1<0 || not1>100){
            System.out.println("0 ile 100 arasında bir not giriniz");
        }else if (not1<50){ // 50'den küçük not alma kontrolü
            System.out.println("harf notunuz 'D' dir.");
        }else if(not1<60){
            System.out.println("harf notunuz 'C' dir.");
        } else if (not1<80) { // 80'den küçük not alma kontrolü
            System.out.println("harf notunuz 'B' dır.");

        }else{  // 80 ve büyük not alma kontrolü
            System.out.println("harf notunuz 'A' dır.");
        }

























    }
}
