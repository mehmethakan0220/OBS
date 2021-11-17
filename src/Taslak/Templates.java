package Taslak;

public class Templates {
    public static void anaTaslak(){
        String taslak = "\n" +
                "1)Personel\n" +
                "2)Ogrenci\n" +
                "0)Sistemden Çık\n" +
                "İşleminizi seçiniz\t:";
        System.out.println(taslak);
    }
    public static void personelTaslak(){
        String taslak ="\n" +
                "1)Personel Ekle\n" +
                "2)Personel Sil\n" +
                "3)Personelleri Listele\n" +
                "0)Geri";
        System.out.println(taslak);
    }
    public static void ogrenciTaslak(){
        String taslak ="\n" +
                "1)Ogrenci Ekle\n" +
                "2)Ogrencileri Listele\n" +
                "0)Geri";
        System.out.println(taslak);
    }
}
