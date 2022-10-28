import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        float yas, km, yolculukTipi, mesafeBasinaUcret = 0.10f, biletFiyati, ucret;
        double a;


        Scanner input = new Scanner(System.in);

        System.out.println("Yaşınızı giriniz: ");
        yas = input.nextFloat();

        System.out.println("Gideceğiniz mesafe uzunluğunu giriniz: ");
        km = input.nextFloat();

        System.out.println("Yolculuk tipini seçiniz: \n 1-Tek Yön \n 2-Gidiş-Dönüş");
        yolculukTipi = input.nextFloat();

        if ((yolculukTipi != 1 && yolculukTipi != 2) || (yas < 0) || km < 0) {
            System.out.println("Hatalı bilgi girdiniz");
            return ;
        }
            if (yas < 12) {
                ucret = km * mesafeBasinaUcret;
                biletFiyati = (float) (ucret - (ucret * 0.50));

                if (yolculukTipi == 1) {

                    System.out.println("Bilet fiyatı: " + biletFiyati);
                } else {
                    a = (double) (biletFiyati - (biletFiyati * 0.20)) * 2;
                    System.out.println("Bilet fiyatı: " + a);
                }

            } else if (12 <= yas && yas < 24) {
                ucret = km * mesafeBasinaUcret;
                System.out.println(ucret);
                biletFiyati = (float) (ucret - (ucret * 0.10));
                System.out.println(biletFiyati);
                if (yolculukTipi == 1) {
                    System.out.println("Bilet fiyatı: " + biletFiyati);
                } else {
                    a = (double) (biletFiyati - (biletFiyati * 0.20)) * 2;
                    System.out.println("Bilet fiyatı: " + a);
                }

            } else if (yas > 65) {

                ucret = km * mesafeBasinaUcret;
                biletFiyati = (float) (ucret - (ucret * 0.30));
                if (yolculukTipi == 1) {
                    System.out.println("Bilet fiyatı: " + biletFiyati);
                } else {
                    a = (double) (biletFiyati - (biletFiyati * 0.20)) * 2;
                    System.out.println("Bilet fiyatı: " + a);
                }

            }
            else{
                ucret = km * mesafeBasinaUcret;
                if(yolculukTipi==1){
                    System.out.println("Bilet fiyatı: "+ucret);
                }
                else{
                    a = (double) (ucret - (ucret * 0.20)) * 2;
                    System.out.println("Bilet fiyatı: "+a);

                }
            }

    }
}
