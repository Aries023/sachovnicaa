package figurky;

import untils.CisloDavac;
import untils.NiecoSaDeje;
import untils.Vyhadzovac;

public class VezRozhranie extends StrelecRozhranie {
    CisloDavac cisloDavac = new CisloDavac();
    NiecoSaDeje niecoSaDeje = new NiecoSaDeje();
    Vyhadzovac vyhadzovac = new Vyhadzovac();

    public void vezBiela(char [][] sachovnica, int x, int y,char ch){
        //kade a o kolko..
        System.out.println("chces ist hore?(1)");
        System.out.println("chces ist dole?(2)");
        System.out.println("chces ist do lava?(3)");
        System.out.println("chces ist do prava?(4)");
        int smer = cisloDavac.getCislo();
        System.out.println("a o kolko? (zadaj cislo o kolko sa chces posunut)");
        int posun = cisloDavac.getCislo();

        if (smer<5 & smer>0){
            if (smer==2){
                // DOLE!!!
                for (int a=1; a<=posun; a++){
                    if (a==posun){
                        if (vyhadzovac.vyhadzovacBielyBezX(sachovnica,x+posun,y)){
                            sachovnica[x][y]='x';
                            sachovnica[x+posun][y]= ch;
                            break;
                        }else {
                            System.out.println("fck you! mas tam svoju figurku.. ak tam chces 2, musis drzat dietu");
                            niecoSaDeje.trololo(sachovnica,true);
                        }
                    }
                    if (sachovnica[x+a][y]!='x'){
                        System.out.println("nieco mas v ceste!");
                        System.out.println("fck you and try it again!");
                        niecoSaDeje.trololo(sachovnica,true);
                    }
                }
            }else {
                if (smer==1){
                    // Hore!!!
                    for (int a=1; a<=posun; a++){
                        if (a==posun){
                            if (vyhadzovac.vyhadzovacBielyBezX(sachovnica,x-posun,y)){
                                sachovnica[x][y]='x';
                                sachovnica[x-posun][y]=ch;
                                break;
                            }else {
                                System.out.println("fck you! mas tam svoju figurku.. ak tam chces 2, musis drzat dietu");
                                niecoSaDeje.trololo(sachovnica,true);
                            }
                        }
                        if (sachovnica[x-a][y]!='x'){
                            System.out.println("nieco mas v ceste!");
                            System.out.println("fck you and try it again!");
                            niecoSaDeje.trololo(sachovnica,true);
                        }
                    }
                }else {
                    if (smer==3){
                        // lavo
                        for (int a=1; a<=posun; a++){
                            if (a==posun){
                                if (vyhadzovac.vyhadzovacBielyBezX(sachovnica,x,y-posun)){
                                    sachovnica[x][y]='x';
                                    sachovnica[x][y-posun]=ch;
                                    break;
                                }else {
                                    System.out.println("fck you! mas tam svoju figurku.. ak tam chces 2, musis drzat dietu");
                                    niecoSaDeje.trololo(sachovnica,true);
                                }
                            }
                            if (sachovnica[x][y-a]!='x'){
                                System.out.println("nieco mas v ceste!");
                                System.out.println("fck you and try it again!");
                                niecoSaDeje.trololo(sachovnica,true);
                            }
                        }
                    }else {
                        // pravo
                        for (int a=1; a<=posun; a++){
                            if (a==posun){
                                if (vyhadzovac.vyhadzovacBielyBezX(sachovnica,x,y+posun)){
                                    sachovnica[x][y]='x';
                                    sachovnica[x][y+posun]=ch;
                                    break;
                                }else {
                                    System.out.println("fck you! mas tam svoju figurku.. ak tam chces 2, musis drzat dietu");
                                    niecoSaDeje.trololo(sachovnica,true);
                                }
                            }
                            if (sachovnica[x][y+a]!='x'){
                                System.out.println("nieco mas v ceste!");
                                System.out.println("fck you and try it again!");
                                niecoSaDeje.trololo(sachovnica,true);
                            }
                        }
                    }
                }
            }
        }else{
            System.out.println("wtf dude? skus to znova a zadaj mi normalny smer!");
            niecoSaDeje.trololo(sachovnica,true);
        }
    }


    public void vezCierna(char [][] sachovnica, int x, int y,char ch){
        //kade a o kolko..
        System.out.println("chces ist hore?(1)");
        System.out.println("chces ist dole?(2)");
        System.out.println("chces ist do lava?(3)");
        System.out.println("chces ist do prava?(4)");
        int smer = cisloDavac.getCislo();
        System.out.println("a o kolko? (zadaj cislo o kolko sa chces posunut)");
        int posun = cisloDavac.getCislo();

        if (smer<5 & smer>0){
            if (smer==2){
                // DOLE!!!
                for (int a=1; a<=posun; a++){
                    if (a==posun){
                        if (vyhadzovac.vyhadzovacCiernyBezX(sachovnica,x+posun,y)){
                            sachovnica[x][y]='x';
                            sachovnica[x+posun][y]=ch;
                            break;
                        }else {
                            System.out.println("fck you! mas tam svoju figurku.. ak tam chces 2, musis drzat dietu");
                            niecoSaDeje.trololo(sachovnica,false);
                        }
                    }
                    if (sachovnica[x+a][y]!='x'){
                        System.out.println("nieco mas v ceste!");
                        System.out.println("fck you and try it again!");
                        niecoSaDeje.trololo(sachovnica,false);
                    }
                }
            }else {
                if (smer==1){
                    // Hore!!!
                    for (int a=1; a<=posun; a++){
                        if (a==posun){
                            if (vyhadzovac.vyhadzovacCiernyBezX(sachovnica,x-posun,y)){
                                sachovnica[x][y]='x';
                                sachovnica[x-posun][y]=ch;
                                break;
                            }else {
                                System.out.println("fck you! mas tam svoju figurku.. ak tam chces 2, musis drzat dietu");
                                niecoSaDeje.trololo(sachovnica,false);
                            }
                        }
                        if (sachovnica[x-a][y]!='x'){
                            System.out.println("nieco mas v ceste!");
                            System.out.println("fck you and try it again!");
                            niecoSaDeje.trololo(sachovnica,false);
                        }
                    }
                }else {
                    if (smer==3){
                        // lavo
                        for (int a=1; a<=posun; a++){
                            if (a==posun){
                                if (vyhadzovac.vyhadzovacCiernyBezX(sachovnica,x,y-posun)){
                                    sachovnica[x][y]='x';
                                    sachovnica[x][y-posun]=ch;
                                    break;
                                }else {
                                    System.out.println("fck you! mas tam svoju figurku.. ak tam chces 2, musis drzat dietu");
                                    niecoSaDeje.trololo(sachovnica,false);
                                }
                            }
                            if (sachovnica[x][y-a]!='x'){
                                System.out.println("nieco mas v ceste!");
                                System.out.println("fck you and try it again!");
                                niecoSaDeje.trololo(sachovnica,false);
                            }
                        }
                    }else {
                        // pravo
                        for (int a=1; a<=posun; a++){
                            if (a==posun){
                                if (vyhadzovac.vyhadzovacCiernyBezX(sachovnica,x,y+posun)){
                                    sachovnica[x][y]='x';
                                    sachovnica[x][y+posun]=ch;
                                    break;
                                }else {
                                    System.out.println("fck you! mas tam svoju figurku.. ak tam chces 2, musis drzat dietu");
                                    niecoSaDeje.trololo(sachovnica,false);
                                }
                            }
                            if (sachovnica[x][y+a]!='x'){
                                System.out.println("nieco mas v ceste!");
                                System.out.println("fck you and try it again!");
                                niecoSaDeje.trololo(sachovnica,false);
                            }
                        }
                    }
                }
            }
        }else {
            System.out.println("wtf dude? skus to znova a zadaj mi normalny smer!");
            niecoSaDeje.trololo(sachovnica,false);
        }
    }
}
