package j04_AritmeticOperators.tasks;

import java.util.Scanner;

public class Task06 {

    public static void main(String[] args) {

        /*
         * Kullanicidan uc basamakli bir sayi alin
         * ve sayinin rakamlarini birler,onlar ve yuzler basamagi olarak yazdirin
         *
         *
         * Ornek : Inputs : 853
         * Output : Girdiginiz sayinin birler basamagi : 3
         *          Girdiginiz sayinin onlar basamagi : 5
         *          Girdiginiz sayinin yuzler basamagi : 8
         *
         *
         */

        Scanner scan=new Scanner(System.in);
        System.out.println("üç basamaklı bir sayı giriniz:");
        int sayı= scan.nextInt();

        System.out.println("girdiğiniz sayının yüzler basamağı:" + sayı/ 100);
        System.out.println(("girdiğiniz sayının onlar basamağı:"+ (sayı % 100) / 10)); // ve ya sayı /=10; int onlar=sayı%10=kalan 5;
        System.out.println("girdiğiniz sayının birler basamağı :" + sayı % 10); //



          /* -------->>>> 2.ÇÖZÜM  ---------->>>>       */


        Scanner scan1=new Scanner(System.in);
        System.out.println("3 basamaklı bir sayı giriniz:");

        int sayı1=scan1.nextInt();
        // 1'ler basamağı -> bir sayının 10 bölümünden kalan 1'ler basamağıdır...
        int birler = sayı1 % 10 ; // sayının birler basamağı
        sayı1 /= 10; // sayının 10 ' bölümünden kalanı verir. 853/10 -> 85 ;
        int onlar = sayı1 %10; // 85'in 10' a bölümünden kalan ->5;
        int yüzler = sayı1 =sayı1 / 10 ; //852in 10' a bölümü -> 8 ;
        System.out.println("girdiğiniz sayının birler basamağı :" + birler
                            + "\n girdiğiniz sayının onlar basamağı :" + onlar
                            + " \n girdiğiniz sayının yüzler basamağı:" + yüzler);


    }
}
