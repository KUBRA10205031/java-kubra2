package j04_AritmeticOperators;

import java.util.Scanner;

public class C03_RakamToplamı {
    public static void main(String[] args) {

        /* TASK --->> Kullanıcıdan alınan 3 basamaklı bir sayının rakamlar toplamını print eden code create ediniz.*/

        Scanner scan=new Scanner(System.in);
        System.out.println("3 basamaklı bir sayı giriniz:");
        int sayı =scan.nextInt();
        int sum = (sayı/100)+((sayı%100)/10)+(sayı%10);
        System.out.println("girilen sayının rakamlar toplamı :" + sum);


    }
}
