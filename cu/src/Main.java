import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // OTEL 1
        OtelOdasi o11 = new OtelOdasi("Allah Konutlari",1, true, true, true ,true, true,true,1,2,true, true,100,true);
        OtelOdasi o12 = new OtelOdasi("Allah Konutlari", 1,true, true, true ,true, true,true,2,2,true, false,100,false);
        OtelOdasi o13 = new OtelOdasi("Allah Konutlari",1, true, true, true ,true, true,true,3,2,false, false,90,false);
        OtelOdasi o14 = new OtelOdasi("Allah Konutlari",1, true, true, true ,true, true,true,4,1,true, true,70,true);
        OtelOdasi o15 = new OtelOdasi("Allah Konutlari", 1,true, true, true ,true, true,true,5,1,true, true,70,true);
        OtelOdasi[] otel1 = {o11, o12, o13, o14, o15};

        // OTEL 2
        OtelOdasi o21 = new OtelOdasi("cu Otel Plus", 2, false, true, false ,true, false,true,1,4,true, false,100,false);
        OtelOdasi o22 = new OtelOdasi("cu Otel Plus", 2,false, true, false ,true, false,true,2,4,true, false,100,false);
        OtelOdasi o23 = new OtelOdasi("cu Otel Plus", 2,false, true, false ,true, false,true,3,4,true, false,100,false);
        OtelOdasi o24 = new OtelOdasi("cu Otel Plus", 2,false, true, false ,true, false,true,4,2,true, false,70,false);
        OtelOdasi o25 = new OtelOdasi("cu Otel Plus", 2,false, true, false ,true, false,true,5,2,true, false,70,false);
        OtelOdasi[] otel2 = {o21,o22,o23,o24,o25};

        OtelOdasi[][] oteller = {otel1,otel2};
        Scanner s = new Scanner(System.in);
        System.out.println("nerede (istanbul icin 1, bursa icin 2)");
        int z = s.nextInt();
        System.out.println("kac kisi");
        int x = s.nextInt();
        System.out.println("sezon 1 veya sezon 2");
        int y = s.nextInt();
        System.out.println("kac gun");
        int g = s.nextInt();

        System.out.println(z);


        for(int i=0; i < oteller.length; i++){
           int uzunluk = oteller[i].length;
            for(int j=0; j < uzunluk; j++){
                if(z == oteller[i][j].konum && x == oteller[i][j].yatakSayisi ){
                        System.out.println(oteller[i][j].isim + " Otelinin " + oteller[i][j].odaNO + ". odasi");
                        System.out.println(oteller[i][j].FiyatHesap()*g + " Dolar ");
                }
            }
        }


    }
}