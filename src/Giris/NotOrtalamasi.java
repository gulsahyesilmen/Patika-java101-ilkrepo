
package Giris;
import java.util.Scanner;
public class NotOrtalamasi {
    public static void main(String[] args){
        // Değişkenleri oluştur
        int mat, fizik, kimya, turkce, tarih, muzik;

        // Scanner sınıfını tanımla
        Scanner inp = new Scanner (System.in);

        // Kullanıcılardan değerleri al
        System.out.println("Matematik Notunuz : ");
        mat = inp.nextInt();

        System.out.println("Fizik Notunuz : ");
        fizik = inp.nextInt();

        System.out.println("Kimya Notunuz :");
        kimya = inp.nextInt();

        System.out.println("Türkçe Notunuz :");
        turkce = inp.nextInt();

        System.out.println("Tarih Notunuz : ");
        tarih = inp.nextInt();

        System.out.println("Müzik Notunuz : ");
        muzik = inp.nextInt();

        // Ortalamayı hesapla ve yazdır
        int toplam = (mat + fizik + kimya + turkce + tarih + muzik);
        double sonuc = toplam / 6;
        System.out.println("Ortalamanız :" + sonuc);


        /* Öğrencinin ortalaması 60 üzerinde ise ekrana "Sınıfı geçti"
         * aksi takdirde ekrana "Sınıfta kaldı" yazdır.
         */

        String str = sonuc >= 60.0 ? "Sınıfı geçti" : "Sınıfta kaldı";

        System.out.println(str);
    }
}
