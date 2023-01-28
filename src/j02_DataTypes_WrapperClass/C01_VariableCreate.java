package j02_DataTypes_WrapperClass;

public class C01_VariableCreate {
    public static void main(String[] args) {
        //1.YOl..(best practice)-> (Recommended) tavsiye edilen

        int yas =48;
        int maas=33000;
        System.out.println(yas);//48
        System.out.println("yas");//yas  -> (tırnak içinde burada ifadeyi yazdırır.)
        System.out.println(maas);//33000 (maaşın üzerine gelip ctrl ye basıldığında variable'nin nereden geldiğini gösterir.
        System.out.println("nur hanım başlangıç maaşı: " +maas);//nur hanım başlangıç maaşı: 33000 (+) ile ifadeye ekleyebiliyorum.

        //2.YOL...(bad practice)

         int boy;      // değeri atanmayan boy isminde bir int tanımlandı declaration.

        // System.out.println(boy); // değeri atanmamış değişkeni hiçbir aksiyonda kullanamazsınız.CTE hatası verir.

        // -> İNİTİALİZE = etmek ilk değer atamaktır.
        boy=175;
        System.out.println("boyunuz:" +boy);//175

        //3.YOL...

        int yevmiye,age,kilo; //birden fazla aynı tipte değişken tanımlandı
        age=33;
        yevmiye=10000;
        kilo=99; //tanımlanan değişkenlere değer ataması yapıldı...

        // int yevmiye=15000; //TRICK = bir variable bir kez tanımlanabilir, birden çok değer atanabilir.
                                 // double yevmiye =150000 ; yapılabilirdi. int gunluk=15000; yapılabilirdi.

        int gunluk=1500, yıl=2022, agırlık=99;

        System.out.println(gunluk);//15000
        System.out.println(yıl);//2022

        // günlük değerine yeni değer atamak istiyorum :

        gunluk=18000;
        System.out.println("gunluk son değeri:"+gunluk);//son değeri 18000 yazar.

        //SORU-> aynı satırda 3 değişkeni çağırsak 3 üne de farklı açıklama girsek yazdırır mı?

        System.out.println("gunluk değeriniz:"+gunluk + "yılınız:"+yıl + " agırlık:"+agırlık);


    }
}
