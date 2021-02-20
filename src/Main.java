import untils.CisloDavac;
import untils.NiecoSaDeje;

public class Main {
    public static void main(String[] args) {
        Guider guider = new Guider();
        NiecoSaDeje niecoSaDeje= new NiecoSaDeje();
        CisloDavac cisloDavac = new CisloDavac();

        // uvod
            guider.guide();

            // sachovnica priprava..
        char [][] sachovnicaP = new char[8][8];
        for (int a = 0; a<sachovnicaP.length ;a++){
            for (int b=0; b<sachovnicaP.length ;b++) {
                if (!(a==1||a==6)){
                sachovnicaP[a][b] = 'x';
                }else {if (a==1){
                    sachovnicaP[a][b] = 'p';
                }else {sachovnicaP[a][b] = 'P';}}}}

                // veza
                sachovnicaP[0][0]='v';
                sachovnicaP[0][7]='v';
                sachovnicaP[7][0]='V';
                sachovnicaP[7][7]='V';

                // strelec
                sachovnicaP[0][1]='s';
                sachovnicaP[0][6]='s';
                sachovnicaP[7][1]='S';
                sachovnicaP[7][6]='S';

                // kone
                sachovnicaP[0][2]='h';
                sachovnicaP[0][5]='h';
                sachovnicaP[7][2]='H';
                sachovnicaP[7][5]='H';

                // kralovna a kral
                sachovnicaP[0][3]='q';
                sachovnicaP[0][4]='k';
                sachovnicaP[7][4]='Q';
                sachovnicaP[7][3]='K';

        int kolo = 0;
        boolean hra = true;
        boolean naRadeJeBiely;
        int kralC =0;
        int kralB = 0;

        while (hra) {

            for (char[] chars : sachovnicaP) {
                System.out.print("|");
                for (int b = 0; b < sachovnicaP.length; b++) {
                    System.out.print(chars[b] + "|");
                }
                guider.mriezka();
            }

            if (kolo % 2 == 0) {
                System.out.println("na rade je biely");
                naRadeJeBiely=true;
            } else {
                System.out.println("na rade je cierny");
                naRadeJeBiely=false;
            }
            kolo++;
            niecoSaDeje.trololo(sachovnicaP,naRadeJeBiely);


            for (char[] pole:sachovnicaP) {
                for (char ch:pole) {
                    if (ch == 'k'){
                        kralB++;
                    }else if (ch=='K'){
                        kralC++;
                    }
                }}
            if (kralB==0){
                hra = false;
                System.out.println("vyhral Cierny");
                System.out.println("za tolkoto kol: "+ kolo);
            }else{
                if (kralC==0){
                hra  = false;
                System.out.println("vyhal Biely");
                System.out.println("za tolkoto kol: "+ kolo);
              }
            }
            kralB=0;
            kralC=0;
        }

        // ukoncenie Scanneru
        cisloDavac.scannerEnd();
    }
}
