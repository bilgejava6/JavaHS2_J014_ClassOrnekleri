package com.muhammet;

public class Runner_Okul {
    public static void main(String[] args) {
        Okul okul = new Okul();
        okul.ad = "Java Eğitim Okulu";
        okul.adres = "Online";
        okul.mudurAdi = "Demet TAŞ";
        okul.telefon = "0 999 888 7777";
        //-------------------------------
        Sinif sinif = new Sinif();
        sinif.ad = "4F";
        sinif.kat = "2. Kat";
        sinif.odaNo = "5. Oda";
        sinif.ogrenciSayisi = 5;
        //--------------------------
        Ogrenci ogrenci = new Ogrenci();
        ogrenci.ad = "Samet";
        ogrenci.adres = "Ankara";
        ogrenci.soyad = "TAŞ";
        ogrenci.veli = "HAYRİ";
        //--
        Ogrenci ogrenci2 = new Ogrenci();
        ogrenci2.ad = "Bahar";
        ogrenci2.adres = "Trabzon";
        ogrenci2.soyad = "TEKKE";
        ogrenci2.veli = "BAHADIR";

        Ogrenci[] ogrenciler = {ogrenci,ogrenci2}; // 2 kişilik bir dizi
        sinif.ogreciler = ogrenciler; // öğrenci listesini sınıf a ekledik
        Sinif[] sinifListesi = {sinif}; // 1 sınıflık dizi
        okul.siniflar = sinifListesi;
        //-------------------------------------------

        System.out.println("Okul adı.........: "+ okul.ad);
        System.out.println("sınıf adı........: "+ okul.siniflar[0].ad);
        System.out.println("1. öğrenci adı...: "+ okul.siniflar[0].ogreciler[0].ad);
        System.out.println("2. öğrenci adı...: "+ okul.siniflar[0].ogreciler[1].ad);

    }
}
