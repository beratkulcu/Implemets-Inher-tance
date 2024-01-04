package Interfacedersleri;

public class Main {

    public static void main(String[] args) {

       // IMuhendsi muhendsi = new IMuhendsi(); interface obje uretemez

        PcMuhendisi muhendisi = new PcMuhendisi(true , false);
        muhendisi.askerlik_durumu_sorgula();
        muhendisi.adli_sicil();
        System.out.println(muhendisi.mezuniyet_ort(75.8));
        String[] tecrube = {"Apple  ","Samsung "};
        muhendisi.is_tecrube(tecrube);

        System.out.println("-*/-*/-*/-*/-*");

        MakineMuhendisi makineMuhendisi = new MakineMuhendisi(true , false);

        String[] tecrubelerim = {"0"};
        makineMuhendisi.is_tecrube(tecrubelerim);
        makineMuhendisi.adli_sicil();
        makineMuhendisi.mezuniyet_ort(3.58);
        makineMuhendisi.askerlik_durumu_sorgula();
        String [] referans = {"Berat Kulcu","İrem Nur ", "Steve Jobs"};
         makineMuhendisi.referans_getir(referans);
        //((MakineMuhendisi) makineMuhendisi).referans_getir(referans); //burada referansı makınemuhendısınden almıs olduk

        makineMuhendisi.calis();

    }
}
