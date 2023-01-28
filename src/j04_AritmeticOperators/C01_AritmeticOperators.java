package j04_AritmeticOperators;

public class C01_AritmeticOperators {
    public static void main(String[] args) {
        int a=13;
        int b=17;
        int c=47;

        System.out.println(b + a * c);//628
        System.out.println(c - a / (b - c) + a * b); //268



        int g =2;
        int h=3;
        String s ="javacan";  /* TASK ->>> g h s variable'leri kullanarak 61javacan-1 print eden code yazınız*/
        System.out.println((g*h)+""+(h-g)+""+s+(g-h));//61javacan-1


    }
}
