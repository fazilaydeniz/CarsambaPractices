package A2_Pazar;

import java.util.Scanner;

public class Soru_8 {
    /*
          Kullanicidan bir cumle ve bir metin alin
          cumlede metnin durumuna gore
          1- cumle metni icermiyor
          2- cumle metni sadece 1 kere iceriyor
          3- cumle metni birden fazla iceriyor
          seceneklerinden uygun olani yazdirin
         */
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen bir cümle giriniz");
        String input = scan.nextLine();
        System.out.println("Aramak istediğiniz kelimeyi giriniz");
        String arananKelime = scan.nextLine();

        int ilkIndex = input.indexOf(arananKelime);
        int sonIndex = input.lastIndexOf(arananKelime);

        if (ilkIndex == (-1)) System.out.println("Cümle aranan kelimeyi içermiyor");
        else if (ilkIndex == sonIndex) System.out.println("Cümle araran kelimeyi 1 kere içeriyor.");
        else System.out.println("Aranan kelime cümlede birden fazla geçiyor");

    }

    }
