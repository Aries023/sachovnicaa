package figurky;

import untils.CisloDavac;
import untils.NiecoSaDeje;
import untils.Vyhadzovac;

public class Pesiak {

    CisloDavac cisloDavac = new CisloDavac();
    NiecoSaDeje niecoSaDeje=new NiecoSaDeje();
    Vyhadzovac vyhadzovac =new Vyhadzovac();
    PesiakPomoc pesiakPomoc = new PesiakPomoc();

    //Bielucky..

    public void pesiakBiely (char [][] sachovnica, int x, int y){
        if (pesiakPomoc.pomockaBiely(sachovnica, x, y)){
            while (true){
                System.out.println("mas moznost niekoho preskocit.. chces skakat do lava(1) ci prava?(lubovolne tlacidlo..)");
                if (cisloDavac.getCislo()==1){
                    if (vyhadzovac.vyhadzovacBiely(sachovnica, x+1, y-1)){
                        sachovnica[x][y]='x';
                        sachovnica[x+1][y-1]='p';
                        return;
                    }else {
                        System.out.println("nemas co preskocit!");
                    }
                }else {
                    if (vyhadzovac.vyhadzovacBiely(sachovnica, x+1, y+1)){
                        sachovnica[x][y]='x';
                        sachovnica[x+1][y+1]='p';
                        return;
                    }else {
                        System.out.println("nemas co preskocit!");
                    }
                }
            }
        }else {
            if (sachovnica[x+1][y]!='x'){
                System.out.println("niekto je pred tebou!");
                niecoSaDeje.trololo(sachovnica, true);
            }else {
                if (x==1 & sachovnica[x+2][y]=='x'){
                    System.out.println("chces ist o jedno policko?(1) alebo o dve?(lubovolna klavesa)");
                    if (cisloDavac.getCislo()==1){
                        sachovnica[x][y]='x';
                        sachovnica[x+1][y]='p';
                    }else {
                        sachovnica[x][y]='x';
                        sachovnica[x+2][y]='p';
                    }
                }else {
                    sachovnica[x][y]='x';
                    sachovnica[x+1][y]='p';
                }
            }
        }
    }

    // Ciernucky... -------------------

    public void pesiakCierny (char [][] sachovnica, int x, int y){
        if (pesiakPomoc.pomockaCierny(sachovnica, x, y)){
            while (true){
                System.out.println("mas moznost niekoho preskocit.. chces skakat do lava(1) ci prava?(lubovolne tlacidlo..)");
                if (cisloDavac.getCislo()==1){
                    if (vyhadzovac.vyhadzovacCierny(sachovnica, x-1, y-1)){
                        sachovnica[x][y]='x';
                        sachovnica[x-1][y-1]='P';
                        return;
                    }else {
                        System.out.println("nemas co preskocit!");
                    }
                }else {
                    if (vyhadzovac.vyhadzovacCierny(sachovnica, x-1, y+1)){
                        sachovnica[x][y]='x';
                        sachovnica[x-1][y+1]='P';
                        return;
                    }else {
                        System.out.println("nemas co preskocit!");
                    }
                }
            }
        }else {
            if (sachovnica[x-1][y]!='x'){
                System.out.println("niekto je pred tebou!");
                niecoSaDeje.trololo(sachovnica, false); // TU
            }else {
                if (x==6 & sachovnica[x-2][y]=='x'){
                    System.out.println("chces ist o dve policka?(1) alebo o jedno?(lubovolna klavesa)");
                    if (cisloDavac.getCislo()==1){
                        sachovnica[x][y]='x';
                        sachovnica[x-2][y]='P';
                    }else {
                        sachovnica[x][y]='x';
                        sachovnica[x-1][y]='P';
                    }
                }else {
                    sachovnica[x][y]='x';
                    sachovnica[x-1][y]='P';
                }
            }
        }
    }
}
