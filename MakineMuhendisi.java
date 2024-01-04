package Interfacedersleri;

public class MakineMuhendisi implements IMuhendsi  , ICalısma {


    @Override
    public void calis() {
        System.out.println("Makine Mühendisi Çalışıyor ");
    }


    private boolean askerlik;
    private boolean adli_sicil;

    public MakineMuhendisi(boolean askerlik, boolean adli_sicil) {
        this.askerlik = askerlik;
        this.adli_sicil = adli_sicil;
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
        if (adli_sicil){
            System.out.println("Adli Sicil kayd bulunuyor ");
        }else {
            System.out.println("Adli Sicil Temiz " );
        }
    }

    @Override
    public void is_tecrube(String[] array) {

        if (array.length == 0 ){
            System.out.println("İş tecrübesi yok ");
        }else {

            System.out.println("Tecrübeler : ");  for (int i = 0; i < array.length; i++) {
                System.out.println(array[i]);
            }
        }
    }

    public void  referans_getir (String[] array){
        if (array.length==0){
            System.out.println("Referans Yok ");
        }else {
            System.out.println("Referanslar  : " );
            for (int i = 0; i < array.length; i++) {
                System.out.println(array[i]);
            }
        }
    }



}
