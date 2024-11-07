package com.muhammet;

public class Runner {

    public static void main(String[] args) {
        /**
         *
         * Bir bilgisayar bileşenleri satış mağazası bizden ürünlerini ekleyip
         * listeleyeceği bir uygulama istedi.
         * --- BilgisayarBileseni (özellikeri ile soyutluyorsunuz)
         * ---- marka, model, ad, fiyat, stok
         * --- bir liste dizi oluşturuyorsunuz
         * --- 6 adet ürün oluşturup listeye ekliyorsunuz.
         * --- listeme yapıyorsunuz.
         */
        urunTanimlaListeyeEkle();
        listUrun();
    }


    public static void urunTanimlaListeyeEkle(){
        BilgisayarBileseni bb1 = new BilgisayarBileseni();
        bb1.ad = "Anakart";
        bb1.marka = "Asus";
        bb1.model = "i9 Anakart";
        bb1.fiyat = 25_999d;
        bilgisayarList[0] = bb1;
        BilgisayarBileseni bb2 = new BilgisayarBileseni();
        bb2.ad = "Anakart";
        bb2.marka = "Gigabyte";
        bb2.model = "i9 Anakart";
        bb2.fiyat = 25_999d;
        bilgisayarList[1] = bb2;
        BilgisayarBileseni bb3 = new BilgisayarBileseni();
        bb3.ad = "Anakart";
        bb3.marka = "Asrock";
        bb3.model = "i9 Anakart";
        bb3.fiyat = 25_999d;
        bilgisayarList[2] = bb3;
        BilgisayarBileseni bb4 = new BilgisayarBileseni();
        bb4.ad = "Anakart";
        bb4.marka = "İntel";
        bb4.model = "i9 Anakart";
        bb4.fiyat = 25_999d;
        bilgisayarList[3] = bb4;
        BilgisayarBileseni bb5 = new BilgisayarBileseni();
        bb5.ad = "Anakart";
        bb5.marka = "MSI";
        bb5.model = "i9 Anakart";
        bb5.fiyat = 25_999d;
        bilgisayarList[4] = bb5;
        BilgisayarBileseni bb6 = new BilgisayarBileseni();
        bb6.ad = "Anakart";
        bb6.marka = "HP";
        bb6.model = "i9 Anakart";
        bb6.fiyat = 25_999d;
        bilgisayarList[5] = bb6;
    }

    public static void listUrun(){
        System.out.println("""
                ****** Bilgisayar Bileşen Listesi *******
                """);
        for(int i=0;i< bilgisayarList.length;i++){
            System.out.println("ad..........: "+ bilgisayarList[i].ad);
            System.out.println("marka.......: "+ bilgisayarList[i].marka);
            System.out.println("model.......: "+ bilgisayarList[i].model);
            System.out.println("fiyat.......: "+ bilgisayarList[i].fiyat);
            System.out.println("-------------------------------");
        }
    }

    static BilgisayarBileseni[] bilgisayarList = new BilgisayarBileseni[6];

}
