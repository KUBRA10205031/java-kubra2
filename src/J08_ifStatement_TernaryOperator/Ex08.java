package J08_ifStatement_TernaryOperator;

import java.util.Scanner;

public class Ex08 {
    public static void main(String[] args) {
        /*TASK --->> kullanıcıdan bir sayı alınız.
        eğer sayı pozitifse 10 dan büyük olup olmadığını kontrol edin.
        eğer 10'dan büyükse "büyüksün" yazdırın.
        eğer 10 dan küçükse "normalsin" yazdırın.

        eğer sayı pozitif değilse
        -10 dan büyük olup olmadığını kontrol edin
        eğer -10 dan büyükse "negatifsin" yazdırın
        eğer -10 dan küçükse "çok negatifsin" yazdırın.

         */
        Scanner scan=new Scanner(System.in);
        System.out.println("bir sayı giriniz:");
        int sayı =scan.nextInt();

        if(sayı>0) {
              if(sayı>10) {
                  System.out.println("büyüksün");

              }else{
                  System.out.println("normalsin.");
              }


        }  else if(sayı<0) {
                if(sayı>-10){
                    System.out.println("negatifsin.");
                }else{
                    System.out.println("çok negatifsin.");
                }

        }else {
            System.out.println("düzgün bir sayı giriniz");
        }
    }
}
