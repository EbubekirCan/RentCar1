package RENTCAR;

public class PojoClass {

    //Kiralama Bilgileri
    private String alinacakSehir;

    private String alinacakgun;

    private double alissati;

    private String TeslimGunu;

    private double TeslimSaati;

    //Arac Bilgileri
    private String marka;

    private String model;

    private String yakitTuru;

    private String vites;

    private double gunlukKiralamaUcreti;

    public PojoClass( String marka, String model, String yakitTuru, String vites, double gunlukKiralamaUcreti) {
        this.marka = marka;
        this.model = model;
        this.yakitTuru = yakitTuru;
        this.vites = vites;
        this.gunlukKiralamaUcreti = gunlukKiralamaUcreti;
    }

    public PojoClass(String alinacakSehir, String alinacakgun, double alissati, String teslimGunu, double teslimSaati) {
        this.alinacakSehir = alinacakSehir;
        this.alinacakgun = alinacakgun;
        this.alissati = alissati;
        TeslimGunu = teslimGunu;
        TeslimSaati = teslimSaati;
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public String getModel() {
        return model;
    }

    public PojoClass() {
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getYakitTuru() {
        return yakitTuru;
    }

    public void setYakitTuru(String yakitTuru) {
        this.yakitTuru = yakitTuru;
    }

    public String getVites() {
        return vites;
    }

    public void setVites(String vites) {
        this.vites = vites;
    }

    public double getGunlukKiralamaUcreti() {
        return gunlukKiralamaUcreti;
    }

    public void setGunlukKiralamaUcreti(double gunlukKiralamaUcreti) {
        this.gunlukKiralamaUcreti = gunlukKiralamaUcreti;
    }

    public String getAlinacakSehir() {
        return alinacakSehir;
    }

    public void setAlinacakSehir(String alinacakSehir) {
        this.alinacakSehir = alinacakSehir;
    }

    public String getAlinacakgun() {
        return alinacakgun;
    }

    public void setAlinacakgun(String alinacakgun) {
        this.alinacakgun = alinacakgun;
    }

    public double getAlissati() {
        return alissati;
    }

    public void setAlissati(double alissati) {
        this.alissati = alissati;
    }

    public String getTeslimGunu() {
        return TeslimGunu;
    }

    public void setTeslimGunu(String teslimGunu) {
        TeslimGunu = teslimGunu;
    }

    public double getTeslimSaati() {
        return TeslimSaati;
    }

    public void setTeslimSaati(double teslimSaati) {
        TeslimSaati = teslimSaati;
    }

    @Override
    public String toString() {
        return "Araçlarımız{" +
                "marka='" + marka + '\'' +
                ", model='" + model + '\'' +
                ", yakitTuru='" + yakitTuru + '\'' +
                ", vites='" + vites + '\'' +
                ", gunlukKiralamaUcreti=" + gunlukKiralamaUcreti +
                '}';
    }
}
