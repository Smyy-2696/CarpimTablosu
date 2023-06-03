package w3resourcecomsorularivecozumleri;

import java.sql.SQLOutput;
import java.util.Scanner;

public class CarpimTablosu {
    public static void main(String[] args) {
        /*Girdi olarak bir sayı alan ve 10'a kadar olan çarpım tablosunu yazdıran bir Java programı yazınız.
        Test Verisi:
        Bir sayı giriniz: 8
        Beklenen Çıktı :
        8 x 1 = 8
        8 x 2 = 16
        8 x 3 = 24 */

        Scanner scan=new Scanner(System.in);
        System.out.println("bir sayı giriniz");
        int i=scan.nextInt();

        for (int j = 1; j < 11; j++) {
            System.out.println(i+"*"+j+"="+(i*j));
        }









    }
}
