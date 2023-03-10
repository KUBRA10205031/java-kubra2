package j07_Logical_Mantıksal_Operators;

public class C01_MantıksalOperator {
    public static void main(String[] args) {

         /*
          -------- && - and - (ve)---------

               True   &&    True    -->  True
               True   &&    False   -->  False
               False  &&    True    -->  False
               False  &&    False   -->  False


              -------- ||- or - (veya)---------

               True   ||    True    -->  True
               True   ||    False   -->  True
               False  ||    True    -->  True
               False  ||    False   -->  False
          */
/* TRICK -->>
                // && ile & arasindaki fark
                // && de boolean sonuc 3 te bir tane false bulunca durur tum satırı kontrol etmeye calısmaz.
                // Ancak & tum satırı kontrol eder ondan sonra durur.
                // sonucta fark yok sadece biri ilk hatayı buldugunda durur dığeri sonuna kadar gider.&& tekliye gore daha hizli calisir*/



        boolean b1=true;
        int a=3;
        int c=7;

        //and->ve

        System.out.println(b1 & (a < c));//true
        System.out.println(b1 & (a > c));//false
        System.out.println(b1 & (a == c));//false

        //or -> veya

        System.out.println(b1 && (a < c));// true
        System.out.println(b1 && (a > c));// true
        System.out.println(b1 && (a == c));// true

        //not -> !
        System.out.println(!(b1 & (a < c)));//false
        System.out.println(!(b1 & (a > c)));// true
        System.out.println(!(b1 & (a == c)));// true



    }
}
