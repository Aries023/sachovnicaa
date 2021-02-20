package figurky;

import untils.CisloDavac;
import untils.NiecoSaDeje;
import untils.Vyhadzovac;

public class Kral {
    CisloDavac cisloDavac = new CisloDavac();
    NiecoSaDeje niecoSaDeje = new NiecoSaDeje();
    Vyhadzovac vyhadzovac = new Vyhadzovac();


    public char [][] kralBiely(char [][] sachovnica, int x, int y){
        System.out.println("zadaj kam sa chces posunut");
        System.out.print("prve cislo (riadok) : ");
        int a = cisloDavac.getCislo();
        System.out.println();
        System.out.print("druhe cislo (stlpec) : ");
        int b =cisloDavac.getCislo();
        System.out.println();

        // ak je policko o jedno a zaroven neni mimo sachovnicu
        if ((((x-a==0)|(x-a==1))|(x-a==-1)&((y-b==0)|(y-b==1)|(y-b==-1)))&(((a<=7)&(a>=0))&((b<=7)&(b>=0)))){
            if (vyhadzovac.vyhadzovacBielyBezX(sachovnica,a,b)){
            sachovnica[x][y]='x';
            sachovnica[a][b]='k';
            }else {
                System.out.println("nemozes vyhodit svoju figurku chlape.. sorry! muck");
            }
        }else {
            System.out.println("fck it.. nieco si urobil zle! skus to znova");
            niecoSaDeje.trololo(sachovnica,true);
        }
        return sachovnica;
    }

    public char [][] kralCierny(char [][] sachovnica, int x, int y){
        System.out.println("zadaj kam sa chces posunut");
        System.out.print("prve cislo (riadok) : ");
        int a = cisloDavac.getCislo();
        System.out.println();
        System.out.print("druhe cislo (stlpec) : ");
        int b =cisloDavac.getCislo();
        System.out.println();

        // ak je policko o jedno a zaroven neni mimo sachovnicu
        if ((((x-a==0)|(x-a==1))|(x-a==-1)&((y-b==0)|(y-b==1)|(y-b==-1)))&(((a<=7)&(a>=0))&((b<=7)&(b>=0)))){
            if (vyhadzovac.vyhadzovacCiernyBezX(sachovnica,a,b)){
                sachovnica[x][y]='x';
                sachovnica[a][b]='K';
            }else {
                System.out.println("nemozes vyhodit svoju figurku chlape.. sorry! muck");
            }
        }else {
            System.out.println("fck it.. nieco si urobil zle! skus to znova");
            niecoSaDeje.trololo(sachovnica,false);
        }
        return sachovnica;
    }
}
