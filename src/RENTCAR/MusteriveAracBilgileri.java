package RENTCAR;


import java.util.ArrayList;
import java.util.Scanner;

public class MusteriveAracBilgileri {
    public static void slowPrint(String text, int delay) {
        for (char c : text.toCharArray()) {
            System.out.print(c);
            try {
                Thread.sleep(delay);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    static Scanner input = new Scanner(System.in);
    static int kiralanacakgunsayisi;
    static String ad;
    static int yas;
    static String Soyad;
    static String telNo;
    static int id;
    static String AlinacakSehir;
    static String teslimEdilecek;

    static ArrayList<PojoClass> evet = new ArrayList<>();


    public static void aracTalep() {
//    pojo classdan obje oluştur ve alınacak sehıt get set falan kullan
        //12 den fazla ve 30 dan fazla gırme durumuna bak

        slowPrint("\u001B[35m" + "Aracı alacağınız şehri yazınız...", 10);
        AlinacakSehir = input.next().toUpperCase();
        slowPrint("\u001B[30m" + "Aracı teslim edeceğiniz şehri yazınız...", 10);
        teslimEdilecek = input.next().toUpperCase();
        slowPrint("\u001B[31m" + "Aracı alacağınız ayı giriniz...(8/9/10)gibi", 10);
        int alacakAy = input.nextInt();
        if (alacakAy > 12 || alacakAy < 1) {
            System.out.println("YANLIŞ SEÇİM TEKRAR DENEYİNİZ");
            aracTalep();
        }
        slowPrint("\u001B[32m" + "Aracı alacağınız gunu gırınız...(8/9/10)gibi", 10);
        int alacakgun = input.nextInt();
        if (alacakgun > 31 || alacakgun < 1) {
            System.out.println("YANLIŞ SEÇİM TEKRAR DENEYİNİZ");
            aracTalep();
        }
        slowPrint("\u001B[33m" + "Aracı teslim edeceğiniz ay'ı giriniz...(8/9/10)gibi", 10);
        int teslimAy = input.nextInt();
        if (teslimAy > 12 || teslimAy < 1) {
            System.out.println("YANLIŞ SEÇİM TEKRAR DENEYİNİZ");
            aracTalep();
        }
        slowPrint("\u001B[34m" + "Aracı teslim edeceğiniz günü giriniz...(8/9/10)gibi", 10);
        int teslimGun = input.nextInt();
        if (teslimGun > 31 || teslimGun < 1) {
            System.out.println("YANLIŞ SEÇİM TEKRAR DENEYİNİZ");
            aracTalep();
        }

        //gün hesaplama
        int ayHesap = 0;
        int gunHesap = 0;
        if (alacakAy > teslimAy) {
            slowPrint("Alacağınız ay teslim edeceğiniz ay'dan büyük olamaz sizi tekrar deneme kısmına" +
                    " yönlendiriyorum ...", 15);
            aracTalep();
        } else if (alacakAy < teslimAy) {
            ayHesap = (teslimAy - alacakAy);
        }
        if (alacakgun < teslimGun) {
            gunHesap = teslimGun - alacakgun;

        } else if (alacakgun > teslimGun) {
            gunHesap = alacakgun - teslimGun;
        }

        kiralanacakgunsayisi = (ayHesap * 30) + gunHesap;
        System.out.println(kiralanacakgunsayisi);


    }


    public static void araclarEkle() {
        double toplamTutar = 0;
        PojoClass arac1 = new PojoClass("HONDA", "ACCORD", "DİESEL", "OTOMATİK", 400);
        PojoClass arac2 = new PojoClass("BMW", "320", "DİESEL", "OTOMATİK", 650);
        PojoClass arac3 = new PojoClass("BMW", "520", "BENZİN", "MANUEL", 590);
        PojoClass arac4 = new PojoClass("AUDİ", "A-3", "DİESEL", "OTOMATİK", 550);
        PojoClass arac5 = new PojoClass("HONDA", "CİVİC", "BENZİN", "MANUEL", 350);
        PojoClass arac6 = new PojoClass("MERCEDES", "A-200", "DİESEL", "MANUEL", 800);
        PojoClass arac7 = new PojoClass("PORSCHE", "911", "DİESEL", "OTOMATİK", 990);
        PojoClass arac8 = new PojoClass("RANGE ROVER", "SPORT", "BENZİN", "otomatik", 550);
        evet.add(arac1);
        evet.add(arac2);
        evet.add(arac3);
        evet.add(arac4);
        evet.add(arac5);
        evet.add(arac6);
        evet.add(arac7);
        evet.add(arac8);
        islem(arac1, arac2, arac3, arac4, arac5, arac6, arac7, arac8, toplamTutar);

    }

    public static void islem(PojoClass arac1, PojoClass arac2, PojoClass arac3, PojoClass arac4,
                             PojoClass arac5, PojoClass arac6, PojoClass arac7, PojoClass arac8, double toplamTutar) {
        System.out.println("------------------------------------------------------------------------");
        System.out.printf("%-8s | %-10s | %-10s | %-10s | %-3s \n", "Marka", "Model ", "Yakıt Türü", "Vites", "Günlük Ücret");
        for (PojoClass w : evet) {
            System.out.printf("%-8s | %-10s | %-10s | %-10s | %-3s \n",
                    w.getMarka(), w.getModel(), w.getYakitTuru(), w.getVites(), w.getGunlukKiralamaUcreti());
        }
        slowPrint("\u001B[35m" + "LÜTFEN İSTEDİĞİNİZ ARACI SIRA NUMARASI İLE SEÇİNİZ EFENDİM...", 15);
        int secim;
        secim = input.nextInt();
        System.err.println("SEÇMİŞ OLDUĞUNUZ ARAÇ...");
        System.out.println("------------------------------------------------------------------------");
        System.out.printf("%-8s | %-10s | %-10s | %-10s | %-3s \n", "MARKA", "MODEL ", "YAKIT TÜRÜ", "VİTES", "TOPLAM TUTAR");

        System.out.println("asf");


         switch (secim) {
            case 1:
                toplamTutar = kiralanacakgunsayisi * arac1.getGunlukKiralamaUcreti();
                System.out.printf("%-8s | %-10s | %-10s | %-10s | %-3s \n",
                        arac1.getMarka(), arac1.getModel(), arac1.getYakitTuru(), arac1.getVites(), toplamTutar + " TL");
                Islemler();
                break;
            case 2:
                toplamTutar = kiralanacakgunsayisi * arac2.getGunlukKiralamaUcreti();
                System.out.printf("%-8s | %-10s | %-10s | %-10s | %-3s \n",
                        arac2.getMarka(), arac2.getModel(), arac2.getYakitTuru(), arac2.getVites(), toplamTutar + " TL");
                Islemler();
                break;
            case 3:
                toplamTutar = kiralanacakgunsayisi * arac3.getGunlukKiralamaUcreti();
                System.out.printf("%-8s | %-10s | %-10s | %-10s | %-3s \n",
                        arac3.getMarka(), arac3.getModel(), arac3.getYakitTuru(), arac3.getVites(), toplamTutar + " TL");
                Islemler();
                break;
            case 4:
                toplamTutar = kiralanacakgunsayisi * arac4.getGunlukKiralamaUcreti();
                System.out.printf("%-8s | %-10s | %-10s | %-10s | %-3s \n",
                        arac4.getMarka(), arac4.getModel(), arac4.getYakitTuru(), arac4.getVites(), toplamTutar + " TL");
                Islemler();
                break;
            case 5:
                toplamTutar = kiralanacakgunsayisi * arac1.getGunlukKiralamaUcreti();
                System.out.printf("%-8s | %-10s | %-10s | %-10s | %-3s \n",
                        arac5.getMarka(), arac5.getModel(), arac5.getYakitTuru(), arac5.getVites(), toplamTutar + " TL");
                Islemler();
                break;
            case 6:
                toplamTutar = kiralanacakgunsayisi * arac2.getGunlukKiralamaUcreti();
                System.out.printf("%-8s | %-10s | %-10s | %-10s | %-3s \n",
                        arac6.getMarka(), arac6.getModel(), arac6.getYakitTuru(), arac6.getVites(), toplamTutar + " TL");
                Islemler();
                break;
            case 7:
                toplamTutar = kiralanacakgunsayisi * arac3.getGunlukKiralamaUcreti();
                System.out.printf("%-8s | %-10s | %-10s | %-10s | %-3s \n",
                        arac7.getMarka(), arac7.getModel(), arac7.getYakitTuru(), arac7.getVites(), toplamTutar + " TL");
                Islemler();
                break;
            case 8:
                toplamTutar = kiralanacakgunsayisi * arac4.getGunlukKiralamaUcreti();
                System.out.printf("%-8s | %-10s | %-10s | %-10s | %-3s \n",
                        arac8.getMarka(), arac8.getModel(), arac8.getYakitTuru(), arac8.getVites(), toplamTutar + " TL");
                Islemler();
                break;
            default:
                System.err.println("MAALESEF YANLIŞ KODLADINIZ...TEKRAR DENEYİNİZ!!");
                islem(arac1, arac2, arac3, arac4, arac5, arac6, arac7, arac8, toplamTutar);


        }

    }

    public static void Islemler() {
        slowPrint("İŞLEMİ ONAYLIYORSANIZ D, ONAYLAMIYORSANIZ HER HANGİ Bİ HARF GİRİNİZ...", 10);
        char asd = input.next().toUpperCase().charAt(0);
        if (asd == 'D') {
            MusteriBilgi();
        } else {
            System.out.println("TEKRAR BEKLERİZ EFENDİM GÖRÜŞMEK ÜZERE...");

        }

    }

    public static void MusteriBilgi() {
        //yas ve tel no hakkında düzenleme ve if yap
        System.out.println("\u001B[33m" + "ADINIZI GİRİNİZ");
        ad = input.next().toUpperCase();
        System.out.println("\u001B[33m" + "SOY ADINIZI GİRİNİZ");
        Soyad = input.next().toUpperCase();
        System.out.println("\u001B[33m" + "ID GİRİNİZ");
        id = input.nextInt();
        System.out.println("\u001B[33m" + "YAŞINIZI GİRİNİZ");
        yas = input.nextInt();
        if (yas < 18) {
            System.out.println("YAŞINIZ TÜRK KANUNUNA GÖRE EHLİYET ALMAYA VE ARAÇ KİRALAMAYA UYGUN DEĞİL ");
        } else {
            System.out.println("\u001B[33m" + "TELEFON NUMARANIZI GİRİNİZ");
            telNo = input.next();
            String bas = telNo.substring(0, 1);
            if (!bas.equalsIgnoreCase("0") || telNo.length() != 11) {
                System.err.println("YANLIŞ TELEFON NUMARASI SİZİ TEKRAR BİLGİ SİSTEMİNE GÖNDERİYORUM...");
                MusteriBilgi();
            } else {
                odemeBilgileri();
            }
        }


    }

    private static void odemeBilgileri() {
        System.out.println();
        System.err.println("12 HANELİ KART NUMARANIZI GİRİNİZ...");
        String kart = input.next();
        if (kart.length() > 12) {
            System.err.println("GEÇERSİZ KART");
            odemeBilgileri();
        } else if (kart.length() == 12) {
            System.out.println("KARTINIZIN 3 HANELİ GÜVENLİK KODUNU GİRİNİZ");
            String security = input.next();
            if (security.length() != 3) {
                System.err.println("YANLIŞ GÜVENLİK KODU!!!");
                odemeBilgileri();
            } else {
                System.out.println("\033[34m             ***** **** *** ** * Odemeniz basari ile gerceklestirildi * ** *** **** ***** \033[0m");
                System.err.println("BİLGİLER...");
                System.out.println("------------------------------------------------------------------------");
                System.out.printf("%-10s | %-8s | %-2s | %-5s | %-11s |%-11s|%-11s \n", "AD", "SOY AD ", "YAŞ ", "ID", "TELEFON NO", "ARACIN ALINDIĞI ŞEHİR", "ARACIN TESLİM YERİ");
                System.out.printf("%-10s | %-8s | %-2s | %-5s | %-11s |%-11s|%-11s \n", ad, Soyad, yas, id, telNo, AlinacakSehir, teslimEdilecek);
                System.out.println("\033[34m             ***** **** *** ** * ÖDEMENİZ BAŞARILI... * ** *** **** ***** \033[0m");
                System.out.println("    " +
                        "\n  ***************************************************************************************************" +
                        "\n  *     * LÜTFEN ARACI TESLİM TARİHİNDE TESLİM EDİNİZ AKSİ TAKDİRDE CEZAİ İŞLEM UYGULANICAKTIR  *" +
                        "\n  *           * BİZİ TERCİH ETTİĞİNİZ İÇİN TEŞEKKÜR EDERİZ TEKRAR BEKLERİZ                      *" +
                        "\n  *           * İHTİYACINIZ DURUMUNDA BİZE ULAŞABİLECEĞİNİZ ADRESLER                            *" +
                        "\n  *           * canCARRentLogistikA.Ş@gmail.com                                                 *" +
                        "\n  *           * +89 04 03 02 05                                                                 *" +
                        "\n  ****************************************************************************************************");

            }

        }
    }


}




