package j02_DataTypes_WrapperClass; //Wrapper:sarmalayıcı

public class C04_WrapperClass {
    public static void main(String[] args) {
        String name="Haluk"; //String bir class'tır.class olduğu için içinde methodları,özellikleri barındırır.
        int yas=33;          // int 33 değerini saklayan bir kutudur.
        name.toLowerCase(); // name variable'ına yeni bir method create ettim.->variable bir aksiyona,işleme girdi.

        System.out.println(name.toLowerCase());//haluk
        System.out.println(name.toUpperCase());//HALUK

        // non-primitive data turleri data depolamak yaninda kullanışlı birçok method'a sahiptir
        // ancak primitive data turlerinin boyle bir ozelligi yoktur
        // primitive data turleri sadece degerleri saklarlar (container,kutu) ve hwerhangi bir özellik(method) vs bulundurmaz.
        //Ancak primitive data turleri icin de bazi işlemler için (String'den tamsayı çekme) method'lar ihtiyaç
        // olduğunda Java her bir primitive data turunu, non-primitive  Wrapper Class  oluşturarak ilgili methodlarla
        // ara çözüm imkanı sunmuştur.


       /* TASK: id ve tc String değerlerinin toplamını print eden code yazınız */

        String tc="1234455";
        String id="987654" ;

        int yeniTC=Integer.valueOf(tc); // tc String değerini int çevirdi ve yeniTC' ye atadı.
                                        // int ' lardan bir kutu oluşturdum bu kutunun değerini nereden atadım.
                                        // Integer.valueOf(tc) buradan atadım.
        int yeniID=Integer.valueOf(id);

        System.out.println("id ve tc toplamı: " + (yeniID + yeniTC)); // 2222109 -->aritmetik bir işlem var çünkü Wrapper Class yardımıyla
                                                                      // String bir ifadeyi Integer class'ına çevirdik ve aritmetik işlem yaptık.

        System.out.println("id ve tc'yi concat eder: " + (id + tc)); //1234455987654 --> çünkü String bir ifade var aritmetik işlem yapılmaz.

        String okulNo="234543l";
       // int yeniOkulNo=Integer.valueOf(okulNo); // RunTimeException--> çalışma zamanı hatası verir.(sounda "l" olduğu için int'e çeviremedi.)
        //System.out.println("yeniOkulNo = " + yeniOkulNo);

        /*TASK -> byte, short, int maximum ve minimum değerlerini print eden code create ediniz.*/


       byte maxdeğeri=Byte.MAX_VALUE;
       byte mindeğeri=Byte.MIN_VALUE;
        System.out.println("maxdeğeri = " + maxdeğeri);//127
        System.out.println("mindeğeri = " + mindeğeri);//-128

        int maxDeğeri=Integer.MAX_VALUE;
        int minDeğeri=Integer.MIN_VALUE;
        System.out.println("maxDeğeri = " + maxDeğeri);//2147483647
        System.out.println("minDeğeri = " + minDeğeri);//-2147483648

        short maxDegeri=Short.MAX_VALUE;
        short minDegeri=Short.MIN_VALUE;
        System.out.println("minDegeri = " + minDegeri);//-32768
        System.out.println("maxDegeri = " + maxDegeri);//32767

        int a=5;
        System.out.println(a);//5 --> burada önce 5 değerini kutuya atıyorum sonra yazdırıyorum.
        System.out.println(5);//5 --> burada 5 değerini direkt yazdırıyorum.


    }


    }

