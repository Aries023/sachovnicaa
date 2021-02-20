package figurky;

import untils.Vyhadzovac;

// Pomocnik služi k tomu aby pesiak uplne na lavo alebo pravo, nepozeral na obe strany lebo by pozrel mimo pole..

public class PesiakPomoc {
    Vyhadzovac vyhadzovac = new Vyhadzovac();

    boolean pomockaBiely (char [][] sachovnica, int x, int y){
        if (y==0){
            // dole do prava
           return vyhadzovac.vyhadzovacBiely(sachovnica,x+1,y+1);
        }else {
            if (y==7){
                // dole do lava
                return vyhadzovac.vyhadzovacBiely(sachovnica,x+1,y-1);
            }else {
                // dole do lava aj prava
                return vyhadzovac.vyhadzovacBiely(sachovnica,x+1,y-1)|vyhadzovac.vyhadzovacBiely(sachovnica,x+1,y+1);
            }
        }
    }


    boolean pomockaCierny (char [][] sachovnica, int x, int y){
        if (y==0){
            // hore do lava
            return vyhadzovac.vyhadzovacCierny(sachovnica, x-1, y+1);
        }else {
            //hore do prava
            if (y==7){
                return vyhadzovac.vyhadzovacCierny(sachovnica, x-1, y-1);
            }else {
                // hore do lava aj prava
                return vyhadzovac.vyhadzovacCierny(sachovnica, x-1, y-1) | vyhadzovac.vyhadzovacCierny(sachovnica, x-1, y+1);
            }
        }
    }
}
