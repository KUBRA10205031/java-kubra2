package J08_ifStatement_TernaryOperator;

import java.util.Scanner;

public class C02_ifElseStatement {
    public static void main(String[] args) {

        /* TASK : -> girilen yaşın 18'den büyüklüğünü control eden code create ediniz. */
        Scanner scan=new Scanner(System.in);
        System.out.println("yaşınızı giriniz:");
        int yaş=scan.nextInt();
        if (yaş>18) {
            System.out.println("girilen yaş 18'den büyüktür.");
        }
        else if (yaş==18) {
            System.out.println("girilen yaş 18'dir.");
        }
        else {
            System.out.println("girilen yaş 18 'den küçüktür.");
        }
     /* TASK --> girilen yaşın 18'den büyüklüğünü kontrol eden code create ediniz 18'den küçük ise ehliyet alamazsınız
                 print ediniz.*/

        Scanner scan1=new Scanner(System.in);
        System.out.println("yaşınızı giriniz:");
        int yaş1 =scan.nextInt();

        if (yaş1 >18) {
            System.out.println("girilen yaş 18'den büyüktür,ehliyet alabilirsiniz.");
        }
        else if (yaş1 ==18) {
            System.out.println("girilen yaş 18'dir, ehliyet alabilirsiniz");
        }
        else {
            System.out.println("girilen yaş 18 'den küçüktür, ehliyet alamazsınız.");
        }

    }
}
