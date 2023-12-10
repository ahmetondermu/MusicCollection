

public class kullanici {

    // Gerekli nesneler oluşturuldu.
    MuzikKoleksiyonu MK ;
        String Kullanici_adi ;
        String Kullanici_soyadi;

// Kullanıcı oluşturulması ve sarkilar üzerinde kullanıcıya ait işlemler yapılır.
       kullanici(String Kullanici_adi,String Kullanici_soyadi){

           this.Kullanici_adi = Kullanici_adi;
           this.Kullanici_soyadi = Kullanici_soyadi;
           MK = new MuzikKoleksiyonu();
        }
        public void gor_kullanicilar(kullanici kisi){

           System.out.println(kisi.Kullanici_adi);
        }

        public void sarki_ekle(String sarki_adi, String sanatci, String album, int sure){
                MK.sarki_ekle(sarki_adi,sanatci,album,sure);
        }

        public void listele(){
            MK.listele();
        }

        public int sarki_ara(String ara_sarki){
            return MK.ara(ara_sarki);
        }

        public void sarki_kaldir(String sarki){
            MK.kaldir(sarki);
        }

        public void album_bul(String album){
           MK.album_gor(album);
        }

        public int get_sure(){
           return MK.get_sure();
        }

        kullanici(){
                // constructer yapısı zorunlu bos nesne olusturmak için
        }

}
