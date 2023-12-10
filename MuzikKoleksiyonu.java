import java.util.ArrayList; // Arraylist kullandım zaten ödevde arraylist yazıyordu
// dinamik bellek oluşturmak zorundayım çünlü ne kadar müzik girilecek belirsiz.

// Kullancıcı işlemleri yapmak için muzik koleksiyonundan verileri alır.
public class MuzikKoleksiyonu{

    ArrayList<Sarki> sarkilar = new ArrayList<>() ;
        static int toplam_sure;

        static int num = 0;


        public void sarki_ekle(String sarki_adi, String sanatci, String album, int sure){
            Sarki new_sarki = new Sarki(sarki_adi,sanatci,album,sure);
            System.out.println((num +1) + "." + " Sarkiniz eklendi!");
            new_sarki.yazdir_ekrana_sarki_bilgileri();
            sarkilar.add(new_sarki);
            num += 1;
            toplam_sure += sure;
        }

        public void album_gor(String album){
            for(Sarki sarki : sarkilar){
                if ((sarki.album).equals(album)){
                    System.out.println(sarki.sarki_adi);
                }
            }
        }



        public void listele(){
            for(Sarki sarki : sarkilar){
                System.out.println(sarki.sarki_adi);
            }
        }

        public  int ara(String name){
            int j = 1;
            for(Sarki sarki : sarkilar){
                    if((sarki.sarki_adi).equals(name)){
                        break;
                    }
                    j += 1;
            }
            return (j);
        }

        public void kaldir(String name){
            int i = 0;
            int flag = 0;
            System.out.println("\nMuzik kaldırılıyor... ");
            for(Sarki sarki : sarkilar){
                if((sarki.sarki_adi).equals(name)){
                    sarkilar.remove(sarki); // remove kullandım çünkü araştırma sonucu arrayLİstlerde manuel kaldırmayı bulamadım.
                    toplam_sure -= sarki.sure;
                    flag = 1;
                    break;
                }
                i += 1;
            }
            System.out.println("\n");
            if(flag == 0){
                System.out.println("Sarki bulunamadi!");
            }
        }

        public int get_sure(){
            return toplam_sure;
        }
}