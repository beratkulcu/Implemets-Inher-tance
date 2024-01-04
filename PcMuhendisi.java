package Interfacedersleri;

import java.util.Arrays;

public class PcMuhendisi implements IMuhendsi{

    private boolean askerlik ;
    private boolean adlisicl ;

    public PcMuhendisi(boolean askerlik, boolean adlisicl) {
        this.askerlik = askerlik;
        this.adlisicl = adlisicl;
    }

    @Override
    public void askerlik_durumu_sorgula() {

        if ( askerlik){
            System.out.println("Askerlik Yapıldı ");
        }else {
            System.out.println("Askerlik yapılmadı ");
        }
    }

    @Override
    public String mezuniyet_ort(double derece) {
       return  "Ortalama : " + derece ;
    }

    @Override
    public void adli_sicil() {

            if (adlisicl){
                System.out.println("Adli Sicil kayd bulunuyor ");
            }else {
                System.out.println("Adli Sicil Temiz " );
            }
    }

    @Override
    public void is_tecrube(String[] array) {
        System.out.println("Software Developer olarak şu şirketlerde çalıştım  : " );

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);

        }
    }
}
