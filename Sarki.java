public class Sarki {

    String sarki_adi ;
    private String sanatci; // Sarkinin sanatcisi degistirilemez ve erşilemez
    String album;
    int sure;


    // Constructer olusturuldu
    Sarki(String sarki_adi,String sanatci,String album,int sure){

        this.sarki_adi = sarki_adi;
        this.sanatci = sanatci;
        this.album = album;
        this.sure = sure;

    }

    // Ekrana sarki bilgileri yazdırıldı
    public void yazdir_ekrana_sarki_bilgileri(){
        System.out.println("Sarki adi: " + sarki_adi);
        System.out.println("Sanatci: " + sanatci);
        System.out.println("Sarki albumu: " + album);
        System.out.println("Sarkinin suresi: " + sure + "\n");
    }
}
