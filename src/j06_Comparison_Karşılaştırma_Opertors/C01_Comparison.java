package j06_Comparison_Karşılaştırma_Opertors;

public class C01_Comparison {
    public static void main(String[] args) {
   /*
    == 	    Esit                x == y
    != 	    Esit degil	        x != y
    >  	    buyuk	            x > y
    <  	    kucuk               x < y
    >=     buyuk esit        	x >= y
    <= 	    kücük esit          x <= y

     */
        int slmyas=33;
        int krmyas=41;

        System.out.println("kerim bey'in yaşı selim bey'in yaşına eşitmidir?:" + (krmyas == slmyas)); //false
        System.out.println("kerim bey'in yaşı selim bey'in yaşına eşit değil mi?:" + (krmyas != slmyas)); //true
        System.out.println("kerim bey'in yaşı selim bey'in yaşından küçük mü? :" + (krmyas < slmyas)); //false
        System.out.println("kerim bey'in yaşı selim bey'in yaşından büyük mü? :" + (krmyas > slmyas)); //true

         /* TRICK --->> s1 ve s2 String constant pool içerisinde aynı referans değere (reference) sahiptir.
                        s1 == s2 , s1 ve s2 ‘nin hafızadaki adres değerlerini karşılaştırır ve
                        String constant pool üzerinde aynı adresi gösterirler.
                        Böylece ekrana TRUE yazdırır. */

        String name = "Kerem bey ";      // ---> " == ""  --> hem referans değerine hem variable değerine bakılır
        String name1 = "kerem bey ";
        System.out.println(name==name1);// false






    }
}
