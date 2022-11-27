package A2_Pazar;

public class Soru_9 {
    public static void main(String[] args) {


        //Verilen stringi tersten yazdırınız.

        String str = "GECMİS OLSUN DÜZCE";

        String tesInput = "";


        for (int i = str.length()-1; i >=0 ; i--) {

            tesInput+=str.substring(i,i+1);

        }
        System.out.println(tesInput);
    }
}
