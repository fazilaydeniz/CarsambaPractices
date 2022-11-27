package A2_Pazar;

import java.util.Scanner;

public class Soru_7 {
    // Mail kontrolü yapan bir program hazırlayın
    //-@ işareti içermiyorsa "geçersiz e-mail"
    // gmail.com içermiyorsa "gmail adrsi giriniz
    // - gmail.com ile bitmiyorsa "hatalı yazım" şeklinde sonuç yazdırın

    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Geçerli bir mail adresi giriniz");
        String mailAdresi= scan.nextLine();

        if (!mailAdresi.contains("@")) System.out.println("Geçersiz e-mail adresi girdiniz");
        else if (!mailAdresi.contains("gmail.com")) System.out.println("gmail adresi giriniz");
        else if (!mailAdresi.endsWith("gmail.com")) System.out.println("Hatalı yazım");
        else System.out.println("Mail adresiniz başarıyla kaydedildi");
    }
}
