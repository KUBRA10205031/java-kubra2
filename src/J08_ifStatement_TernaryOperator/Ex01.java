package J08_ifStatement_TernaryOperator;

import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        /*TASK --> girilen bir sayının negatif ve pozitifliğini kontrol eden code create ediniz.*/
        Scanner scan=new Scanner(System.in);
        System.out.println("bir sayı giriniz:");
        int sayı = scan.nextInt();

        if(sayı>0){
            System.out.println("girilen sayı pozitiftir.");
        } else if (sayı==0){
            System.out.println("girilen sayı '0' dır.");
        }
        else {
            System.out.println("girilen sayı negatiftir.");
        }



    }
}
