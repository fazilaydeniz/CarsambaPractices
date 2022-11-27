package A2_Pazar;

import java.util.Scanner;

public class Soru_5 {
    //Kullanıcıdana alınan bir stringi ters çeviren bir metod yazınız
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen bir cümle giriniz.");
        String cumle= scan.nextLine();
        tersCevir(cumle);

    }
    public static void tersCevir(String ifade){

        for (int i = ifade.length()-1; i >=0 ; i--) {

            System.out.print(ifade.charAt(i));

        }

    }
}
