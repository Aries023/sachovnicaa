package figurky;

import untils.CisloDavac;
import untils.NiecoSaDeje;
import untils.Vyhadzovac;

public class StrelecRozhranie {
    CisloDavac cisloDavac = new CisloDavac();
    NiecoSaDeje niecoSaDeje = new NiecoSaDeje();
    Vyhadzovac vyhadzovac = new Vyhadzovac();

    public void strelecBiely(char [][] sachovnica, int x, int y, char ch){
        System.out.println("chces ist hore?(1)");
        System.out.println("chces ist dole?(lubovolna klavesa..)");
        int hore = cisloDavac.getCislo();
        System.out.println("do lava?(1)");
        System.out.println("do prava?(lubovolna klavesa)");
        int lava = cisloDavac.getCislo();
        System.out.println("a o kolko? (zadaj cislo o kolko sa chces posunut)");
        int posun = cisloDavac.getCislo();

        if (hore==1){
            //hore
            if (lava==1){
                // hore v lavo
                if (x-posun<0 & y-posun<0){
                    System.out.println("ides mimo");
                    niecoSaDeje.trololo(sachovnica, true);
                }else {
                    for (int a=1;a<=posun;a++){
                        if (a==posun) {
                            if (vyhadzovac.vyhadzovacBielyBezX(sachovnica, x - posun, y - posun)) {
                                sachovnica[x][y] = 'x';
                                sachovnica[x - posun][y - posun] = ch;
                                break;
                            } else {
                                niecoSaDeje.trololo(sachovnica, true);
                            }
                        }else {if (sachovnica[x-a][y-a]!='x'){
                            System.out.println("nieco mas v ceste! skus to znova :)");
                            niecoSaDeje.trololo(sachovnica, true);
                        }}
                    }
                }
            }else {
                //hore v pravo
                if (x-posun<0 & y+posun>7){
                    System.out.println("ides mimo");
                    niecoSaDeje.trololo(sachovnica, true);
                }else {
                    for (int a=1;a<=posun;a++){
                        if (a==posun) {
                            if (vyhadzovac.vyhadzovacBielyBezX(sachovnica, x - posun, y + posun)) {
                                sachovnica[x][y] = 'x';
                                sachovnica[x - posun][y + posun] = ch;
                                break;
                            } else {
                                niecoSaDeje.trololo(sachovnica, true);
                            }
                        }else {if (sachovnica[x-a][y+a]!='x'){
                            System.out.println("nieco mas v ceste! skus to znova :)");
                            niecoSaDeje.trololo(sachovnica, true);
                        }}
                    }
                }
            }
        }else {
            // dole
            if (lava==1){
                //dole v lavo
                if (x+posun>7 & y-posun<0){
                    System.out.println("ides mimo");
                    niecoSaDeje.trololo(sachovnica, true);
                }else {
                    for (int a=1;a<=posun;a++) {
                        if (a == posun) {
                            if (vyhadzovac.vyhadzovacBielyBezX(sachovnica, x + posun, y - posun)){
                                sachovnica[x][y] = 'x';
                            sachovnica[x + posun][y - posun] = ch;
                            break;
                        } else {
                            niecoSaDeje.trololo(sachovnica, true);
                        }
                    }else {if (sachovnica[x+a][y-a]!='x'){
                            System.out.println("nieco mas v ceste! skus to znova :)");
                            niecoSaDeje.trololo(sachovnica, true);
                        }}
                    }
                }
            }else {
                //dole v pravo
                if (x+posun>7 & y+posun>7){
                    System.out.println("ides mimo");
                    niecoSaDeje.trololo(sachovnica, true);
                }else {
                    for (int a=1;a<=posun;a++){
                        if (a==posun) {
                            if (vyhadzovac.vyhadzovacBielyBezX(sachovnica, x + posun, y + posun)) {
                                sachovnica[x][y] = 'x';
                                sachovnica[x + posun][y + posun] = ch;
                                break;
                            } else {
                                niecoSaDeje.trololo(sachovnica, true);
                            }
                        }else { if (sachovnica[x+a][y+a]!='x'){
                            System.out.println("nieco mas v ceste! skus to znova :)");
                            niecoSaDeje.trololo(sachovnica, true);
                        }}
                    }
                }
            }
        }

    }

    // ----------------------------------------------------------------------------

    public void strelecCierny(char [][] sachovnica, int x, int y, char ch){
        System.out.println("chces ist hore?(1)");
        System.out.println("chces ist dole?(lubovolna klavesa..)");
        int hore = cisloDavac.getCislo();
        System.out.println("do lava?(1)");
        System.out.println("do prava?(lubovolna klavesa)");
        int lava = cisloDavac.getCislo();
        System.out.println("a o kolko? (zadaj cislo o kolko sa chces posunut)");
        int posun = cisloDavac.getCislo();

        if (hore==1){
            //hore
            if (lava==1){
                // hore v lavo
                if (x-posun<0 & y-posun<0){
                    System.out.println("ides mimo");
                    niecoSaDeje.trololo(sachovnica, false);
                }else {
                    for (int a=1;a<=posun;a++){
                        if (a==posun) {
                            if (vyhadzovac.vyhadzovacCiernyBezX(sachovnica, x - posun, y - posun)) {
                                sachovnica[x][y] = 'x';
                                sachovnica[x - posun][y - posun] = ch;
                                break;
                            } else {
                                niecoSaDeje.trololo(sachovnica, false);
                            }
                        }else { if (sachovnica[x-a][y-a]!='x'){
                            System.out.println("nieco mas v ceste! skus to znova :)");
                            niecoSaDeje.trololo(sachovnica, false);
                        }}
                    }
                }
            }else {
                //hore v pravo
                if (x-posun<0 & y+posun>7){
                    System.out.println("ides mimo");
                    niecoSaDeje.trololo(sachovnica, false);
                }else {
                    for (int a=1;a<=posun;a++){
                        if (a==posun) {
                            if (vyhadzovac.vyhadzovacCiernyBezX(sachovnica, x - posun, y + posun)) {
                                sachovnica[x][y] = 'x';
                                sachovnica[x - posun][y + posun] = ch;
                                break;
                            } else {
                                niecoSaDeje.trololo(sachovnica, false);
                            }
                        }else { if (sachovnica[x-a][y+a]!='x'){
                            System.out.println("nieco mas v ceste! skus to znova :)");
                            niecoSaDeje.trololo(sachovnica, false);
                        }}
                    }
                }
            }
        }else {
            // dole
            if (lava==1){
                //dole v lavo
                if (x+posun>7 & y-posun<0){
                    System.out.println("ides mimo");
                    niecoSaDeje.trololo(sachovnica, false);
                }else {
                    for (int a=1;a<=posun;a++){
                        if (a==posun) {
                            if (vyhadzovac.vyhadzovacCiernyBezX(sachovnica, x + posun, y - posun)) {
                                sachovnica[x][y] = 'x';
                                sachovnica[x + posun][y - posun] = ch;
                                break;
                            } else {
                                niecoSaDeje.trololo(sachovnica, false);
                            }
                        }else { if (sachovnica[x+a][y-a]!='x'){
                            System.out.println("nieco mas v ceste! skus to znova :)");
                            niecoSaDeje.trololo(sachovnica, false);
                        }}
                    }
                }
            }else {
                //dole v pravo
                if (x+posun>7 & y+posun>7){
                    System.out.println("ides mimo");
                    niecoSaDeje.trololo(sachovnica, false);
                }else {
                    for (int a=1;a<=posun;a++){
                        if (a==posun) {
                            if (vyhadzovac.vyhadzovacCiernyBezX(sachovnica, x + posun, y + posun)) {
                                sachovnica[x][y] = 'x';
                                sachovnica[x + posun][y + posun] = ch;
                                break;
                            } else {
                                niecoSaDeje.trololo(sachovnica, false);
                            }
                        }else { if (sachovnica[x+a][y+a]!='x'){
                            System.out.println("nieco mas v ceste! skus to znova :)");
                            niecoSaDeje.trololo(sachovnica, false);
                        }}
                    }
                }
            }
        }

    }
}
