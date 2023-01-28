package J08_ifStatement_TernaryOperator;

import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {


        /* TASK --> girilen yılın artık (leap) olup olmamasını kontrol eden code create ediniz.
        artık yıl :
        Kural 1 : 4 ile bölünemeyen yıllar artık yıl değildir.
        Kural 2 : 4 ile bölünüp 100 ile bölünemeyen yıllar artık yıldır.
        Kural 3 : 4 'ün katı olmasına rağmen 100 ile bölünebilen yıllardan sadece 400'ün katı olan yıllar artık yıldır. */

        Scanner scan=new Scanner(System.in);
        System.out.println("bir yıl giriniz:");
        int yıl =scan.nextInt();

        if (yıl%4==0 && yıl%100!=0){
            System.out.println("girilen yıl artık yıldır.");
        }else if (yıl%4!=0){
            System.out.println("girilen yıl artık yıl değildir.");
        }else if (yıl%400==0){
            System.out.println("girilen yıl artık yıldır.");
        }else {
            System.out.println("düzgün bir ifade giriniz.");
        }

        Scanner scan1=new Scanner(System.in);
        System.out.println("bir yıl giriniz:");
        int yıl1 =scan.nextInt();
        //4'ün katı    100!ün katı olmaması  400'ün katı olması
        if (yıl1 %4==0 && yıl1 %100!=0  || yıl1%400==0){
            System.out.println("girilen yıl artık yıldır.");

        }else {
            System.out.println("girdiğiniz yıl artık yıl değildir.");
        }

    }
}
