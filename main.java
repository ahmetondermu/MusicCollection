import java.util.Scanner;
import java.util.ArrayList;

public class main {

    public static void main(String[] args) {
// Gerekli kullanılanacak olan nesneler oluşturulur.
        MuzikKoleksiyonu MK = new MuzikKoleksiyonu();
        Scanner input = new Scanner(System.in);

        ArrayList<kullanici> users = new ArrayList<>() ;
        kullanici user = new kullanici();

        int control = 0;
// Bu döngü ile kullanıcının sürekli çıkış yapana kadar(8) veri girişi ve okuması yapması sağlanır.
        while (true) {
            System.out.println("Kullanici girisi(1) \nSarki eklemek icin(2) \nSarki silmek icin(3) \nSarki listelemek icin(4)" +
                    " \nSarki aramak icin(5) \nToplam sureyi ogrenmek icin(6) \nAlbum bul(7) \nCıkmak icin (8) ");
            control = input.nextInt();

            if(control == 1) {
                System.out.println("Lutfen kullanici adinizi giriniz: ");
                input.nextLine();
                String kullanici_adi = input.nextLine();
                System.out.println("Lutfen kullanici soyadinizi giriniz: ");
                String kullanici_soyadi = input.next();
                user = new kullanici(kullanici_adi, kullanici_soyadi);
                users.add(user);
                for(kullanici user_gor : users){
                    user.gor_kullanicilar(user_gor);
                }

            }

            else if(control == 2) {
                System.out.println("sarki adini giriniz : ");
                String sarki_ismi = input.next();
                System.out.println("sarkinin sanatcisini giriniz(yalnızca ismi): ");
                String sanatci_ismi = input.next();
                System.out.println("sarki album(Tek kelime ile): ");
                String album = input.next();
                System.out.println("sarkinin suresini giriniz: ");
                int sure = input.nextInt();
                user.sarki_ekle(sarki_ismi, sanatci_ismi, album, sure);
            }

            else if(control == 3) {
                System.out.println("\nSilmek istediginiz sarki adini giriniz");
                String sarki_sil = input.next();
                user.sarki_kaldir(sarki_sil);
            }

            else if(control == 4) {
                System.out.println("\nSarkilar listeleniyor... ");
                user.listele();
                System.out.print("\n");
            }

            else if(control == 5) {
                System.out.println("\nAramak istediginiz sarki adini giriniz");
                String ara_sarki = input.next();
                int sira = user.sarki_ara(ara_sarki);
                if (sira != 0) {
                    System.out.println("\nSarki " + sira + ". sirada bulundu.");
                } else {
                    System.out.println("Sarki bulunamadi! ");
                }
            }

            else if(control == 6){
                int sure = user.get_sure();
                System.out.println("Sure " + sure);
            }

            else if(control == 7){
                System.out.println("Gormek istediginiz albumun adini giriniz: ");
                String album_gir = input.next();
                System.out.println("Albumdeki sarkilar listeleniyor...");
                user.album_bul(album_gir);
            }

            else if(control == 8){
                System.out.println("Sistemden cikiliyor...");
                break;
            }
            else{
                System.out.println("Lutfen gecerli bir giris yapiniz! ");
            }
        }
    }
}
