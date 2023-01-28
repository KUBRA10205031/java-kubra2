package J08_ifStatement_TernaryOperator;

import java.util.Scanner;

public class Ex06 {
    public static void main(String[] args) {

     /*TASK --> kullanıcının cinsiyeti kadın ise 60 yaşından büyük ve prim günü 6000 den fazla ise emekliliğini
                kullanıcının cinsiyeti erkek  ise 65 yaşından büyük ve prim günü 7000'den fazla ise emekliliğini kontrol edip
                kalan yıl ve prim gününü print eden code create ediniz.  */

        Scanner scan=new Scanner(System.in);

        System.out.println("lütfen cinsiyetinizi kadın ise 'K' erkek ise 'E' giriniz:");
        char cinsiyet =scan.next().charAt(0);




        if(cinsiyet=='K') {
            System.out.println("lütfen yaşınızı giriniz:");
            int yaş=scan.nextInt();
            if (yaş > 60) {
                System.out.println("prim gününüzü giriniz:");
                int prımgunu = scan.nextInt();
                if (prımgunu > 6000) {
                    System.out.println("tebrikler emekli olabilrsiniz.");
                } else System.out.println("emekliliğiniz için" + (6000 - prımgunu) + "primgününü yatırmanız lazım");
            } else System.out.println("emekliliğinize " + (60 - yaş) + "yıl var");



        }else if(cinsiyet=='E'){
            System.out.println("lütfen yaşınızı giriniz:");
            int yaş=scan.nextInt();
            if (yaş >65 ) {
                System.out.println("prim gününüzü giriniz:");
                int prımgunu =scan.nextInt();
                if (prımgunu>7000){
                    System.out.println("tebrikler emekli olabilirsiniz.");

                }else {
                    System.out.println("emekliliğinize" + (7000 - prımgunu) + "primgünü kaldı");
                }
            }else {
                System.out.println("emekliliğinize " + (65 - yaş) + "yıl kaldı");
            }



        }else {
            System.out.println("lütfen bir cinsiyet giriniz.");
        }







    }
}
