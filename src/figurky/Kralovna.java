package figurky;

import untils.CisloDavac;
import untils.NiecoSaDeje;
import untils.Vyhadzovac;

public class Kralovna extends VezRozhranie {
    CisloDavac cisloDavac = new CisloDavac();
    NiecoSaDeje niecoSaDeje = new NiecoSaDeje();
    Vyhadzovac vyhadzovac = new Vyhadzovac();

    public void kralovnaBiela(char [][] sachovnica, int x, int y){
        System.out.println("chces sa pohnut ako veza? (1)");
        System.out.println("alebo sa chces pohnut ako strelec?(lubovolna klavesa)");
        int what = cisloDavac.getCislo();
        if (what==1){
            super.vezBiela(sachovnica, x, y, 'q');
                }else {
            super.strelecBiely(sachovnica, x, y, 'q');
            }
        }
    public void kralovnaCierna(char [][] sachovnica, int x, int y){
        System.out.println("chces sa pohnut ako veza? (1)");
        System.out.println("alebo sa chces pohnut ako strelec?(lubovolna klavesa)");
        int what = cisloDavac.getCislo();
        if (what==1){
            super.vezCierna(sachovnica, x, y, 'Q');
        }else {
            super.strelecCierny(sachovnica, x, y, 'Q');
        }
    }
}
