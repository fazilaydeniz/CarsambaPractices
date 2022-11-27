package A2_Pazar;

public class Soru_10 {
    public static void main(String[] args) {
        /*
         * Java dilini kullanarak, TimeConvert(num) methodunun kullanicidan integer veri tipinde num parametresini almasını sağlayın
         * ve parametrenin dönüştürdüğü saat ve dakika sayısını döndürun (yani, num = 63 ise, çıktı 1:3 olmalıdır).
         *
         * Saat ve dakika sayısını iki nokta üst üste ile ayırın. Ornegin giris 126 ise output 2:6 seklinde olmalidir...
         */

        String str = "186#$";


        str = str.replaceAll("\\D", "");
        // removeSpecialCharacter(str);
        System.out.println(zaman(Integer.parseInt((str))));
    }

    public static String zaman(int ti) {

        String saat, min;

        if (ti < 60) {
            saat = "0";
            min = Integer.toString(ti);

        } else {
            saat = Integer.toString(ti / 60);
            min = Integer.toString(ti % 60);
        }
        return saat + ":" + min;
    }
}
