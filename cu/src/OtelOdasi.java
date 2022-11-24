public class OtelOdasi extends Otel {
    int odaNO;
    int yatakSayisi;
    boolean tv;
    boolean konsol;
    double metre;
    boolean minibar;

    public OtelOdasi(String isim, int konum, boolean otopark, boolean wifi, boolean havuz, boolean gym, boolean spa, boolean sezon,int odaNO, int yatakSayisi, boolean tv, boolean konsol, double metre, boolean minibar){
        super(isim, konum, otopark, wifi, havuz, gym, spa, sezon);
        this.odaNO = odaNO;
        this.yatakSayisi = yatakSayisi;
        this.tv=tv;
        this.konsol = konsol;
        this.metre = metre;
        this.minibar = minibar;

    };
    public double FiyatHesap(){
        double fiyat = metre * 3;
        if(tv){
            fiyat += 10;
        }
        if(konsol){
            fiyat += 35;
        }
        if(minibar){
            fiyat += 10;
        }
        fiyat += yatakSayisi*25;
        if(otopark){
            fiyat += 50;
        }
        if(wifi)
            fiyat += 100;

        if(havuz)
            fiyat += 300;
        if(gym)
            fiyat += 50;
        if(spa)
            fiyat += 150;

        return fiyat;

    }
}
