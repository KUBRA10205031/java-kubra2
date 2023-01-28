package J08_ifStatement_TernaryOperator;

import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {
        /*TASK ---->>> girilen iki sayı seçilen dört işlemden birine uygulayıp sonucu print eden code create ediniz.*/

        Scanner scan= new Scanner(System.in);
        System.out.println("birinci sayıyı giriniz:");
        System.out.println("ikinci sayıyı giriniz:");
        double sayı1 =scan.nextDouble();
        double sayı2=scan.nextDouble();

        Scanner scan1=new Scanner(System.in);
        System.out.println("dört işlemden birini seçiniz:");
        char işlem =scan1.next().charAt(0);

        if (işlem=='*'){
            System.out.println(sayı1*sayı2);
        } else if (işlem=='+') {
            System.out.println(sayı1+sayı2);

        }else if (işlem== '-'){
            System.out.println(sayı1-sayı2);
        } else if (işlem=='/') {
            System.out.println(sayı1/sayı2);

        }else{
            System.out.println("düzgün bir ifade giriniz:");
        }

        Scanner scan2= new Scanner(System.in);
        System.out.println("birinci sayıyı giriniz:");
        System.out.println("ikinci sayıyı giriniz:");
        double sayı3 =scan.nextDouble();
        double sayı4=scan.nextDouble();

        System.out.println("+ için -> 1 seçiniz \n - için -> 2 seçiniz \n * için -> 3 seçiniz \n / için -> 4 seçiniz:");
        int seçim = scan2.nextInt();

        if (seçim==1){
            System.out.println(sayı3 + sayı4);
        } else if (seçim==2) {
            System.out.println(sayı3 - sayı4);
        } else if (seçim==3) {
            System.out.println(sayı3 * sayı4);
        } else if (seçim==4) {
            System.out.println(sayı3 / sayı4);
        }else{
            System.out.println("düzgün bir ifade giriniz");
        }

    }
}
