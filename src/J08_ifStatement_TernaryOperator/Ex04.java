package J08_ifStatement_TernaryOperator;

import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {
        /* TASK -->> girilen bir karakterin harf olup olmadığını kontrol eden code create ediniz. */

        Scanner scan = new Scanner(System.in);
        System.out.println("bir karakter giriniz:");
        char karakter = scan.next().charAt(0);

        if ((karakter >= 'A' && karakter <= 'Z') || (karakter >= 'a' && karakter <= 'z')) {
            System.out.println("girdiğiniz karakter harftir");
        }else{
            System.out.println("girdiğiniz karakter harf değildir.");
        }
    }}