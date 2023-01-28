package j01_Variables;

public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("merhaba dünya");// bu komut konsola yazılan metni print eder.
                                            // dan yazılan ifadelr komut ve ya koda satırı olarak değil yorum olarak kabul edilir.

        /*
        buraya yazılan her ifade yorum satırı olur java kod olarak derlemez.
        başarı gayrete aşıktır.
        bahanesi olanın başarısı olmaz.

         */

       System.out.println("javacanlara selam olsun ");// çalışmasını istemedğiniz kod satırının başına // yazarak yoruma alınır.
        // Ctrl+D -> satırı klonlar.alt satıra kopyalar.
        System.out.println("javacanlara selam olsun ");
        System.out.println("javacanlara selam olsun ");
        System.out.println("javacanlara selam olsun ");
        System.out.println("javacanlara selam olsun ");

        //TRICK : javada code satırının sonuna mutlaka ";" konulmalıdır.
        // code satırında kırmızı alt çizgi uyarısı "COMPİLE TİME ERROR " (CTE) hatası uyarısı demektir.
        //CTE düzeltmeden code yazılmaz yazılan code çalışmaz.

        // TASK : ad,soyad ,yaş , memleket, ve meslek print ediniz.(consola yazıdırnız.)
        System.out.println("adınız: Pembegül Kübra ");
        System.out.println("soyadınız:Yılmaz");
        System.out.println("yaşınız:32");
        System.out.println("memleketiniz: TOKAT");

        /* TRICK:

        print-> yazdırma işleminden sonraki komutu AYNI satırda devam ettirir.
        println-> yazdırma işleminden sonraki komutu ALT satırdan devam ettirir.
        javada space "boşluk" bir karakter olarak tanımlanır.
        h a l u k-> 9 karakter

         */
        /* java escape special characters -> https://www.w3schools.com/java/java_strings_specchars.asp

	  \n (or \r): starts from a new line : metni bir alt satırdan itibaren yazdırır.
	          \t:  horizontal tab : metni yatayda 1 tab miktarı kaydırır.
	          \\: prints a back slash :\ (ters slash) yazdırır
	          \': prints single quote :' tek tırnak yazdırır.
	          \": prints double quote :"" Çift tırnak yazdırır.
	           */








    }
}
