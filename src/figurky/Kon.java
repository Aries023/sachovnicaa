package figurky;

import untils.CisloDavac;
import untils.NiecoSaDeje;
import untils.Vyhadzovac;

public class Kon {
    CisloDavac cisloDavac = new CisloDavac();
    NiecoSaDeje niecoSaDeje = new NiecoSaDeje();
    Vyhadzovac vyhadzovac = new Vyhadzovac();

public void konikBiely(char[][] sachovnica, int x, int y){
    System.out.println("prave si zvolil ze chces pohnut konom a kedze kon ma viac moznosti ako sa hybat, priprav si logicke myslenie :D");
    System.out.println("prve cislo bude riadok cize do lava ci prava..");
    System.out.println("ak chces ist do lava, tak zadaj cislo od -1 do -2 podla toho kolko policok chces ist do lava");
    System.out.println("ak chces ist do prava, zadaj cislo od 1 do 2 podla toho o kolko chces ist do prava");
    int a;
    do {
        a = cisloDavac.getCislo();
    }
    while ((a>2)|(a<-2));
    System.out.println("druhe cislo bude ci pojdes hore alebo dole");
    System.out.println("hore(1)");
    System.out.println("dole(lubovolne cislo)");
    int b = cisloDavac.getCislo();

    if ((a==-1) & (b==1)){
        // hore v lavo
        if (vyhadzovac.vyhadzovacBielyBezX(sachovnica,x-2,y-1)){
            sachovnica[x][y]='x';
            sachovnica[x-2][y-1]='h';
        }else {
            niecoSaDeje.trololo(sachovnica,true);
        }
    }else {
        if ((a==-1)&(b!=1)){
            // dole v lavo
            if (vyhadzovac.vyhadzovacBielyBezX(sachovnica,x+2,y-1)){
                sachovnica[x][y]='x';
                sachovnica[x+2][y-1]='h';
            }else {
                niecoSaDeje.trololo(sachovnica,true);
            }
        }else {
            if ((a==-2)&(b==1)){
                //hore v lavo 2
                if (vyhadzovac.vyhadzovacBielyBezX(sachovnica,x-1,y-2)){
                    sachovnica[x][y]='x';
                    sachovnica[x-1][y-2]='h';
                }else {
                    niecoSaDeje.trololo(sachovnica,true);
                }
            }else {
                if ((a==-2)&(b!=1)){
                    // dole v lavo 2
                    if (vyhadzovac.vyhadzovacBielyBezX(sachovnica,x+1,y-2)){
                        sachovnica[x][y]='x';
                        sachovnica[x+1][y-2]='h';
                    }else {
                        niecoSaDeje.trololo(sachovnica,true);
                    }
                }else {
                    if ((a==1)&(b==1)){
                        // hore do prava
                        if (vyhadzovac.vyhadzovacBielyBezX(sachovnica,x-2,y+1)){
                            sachovnica[x][y]='x';
                            sachovnica[x-2][y+1]='h';
                        }else {
                            niecoSaDeje.trololo(sachovnica,true);
                        }
                    }else {
                        if ((a==1)&(b!=1)){
                            // dole do prava
                            if (vyhadzovac.vyhadzovacBielyBezX(sachovnica,x+2,y+1)){
                                sachovnica[x][y]='x';
                                sachovnica[x+2][y+1]='h';
                            }else {
                                niecoSaDeje.trololo(sachovnica,true);
                            }
                        }else {
                            if ((a==2)&(b==1)){
                                // hore do prava 2
                                if (vyhadzovac.vyhadzovacBielyBezX(sachovnica,x-1,y+2)){
                                    sachovnica[x][y]='x';
                                    sachovnica[x-1][y+2]='h';
                                }else {
                                    niecoSaDeje.trololo(sachovnica,true);
                                }
                            }
                            if ((a==2)&(b!=1)){
                                // dole do prava 2
                                if (vyhadzovac.vyhadzovacBielyBezX(sachovnica,x+1,y+2)){
                                    sachovnica[x][y]='x';
                                    sachovnica[x+1][y+2]='h';
                                }else {
                                    niecoSaDeje.trololo(sachovnica,true);
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}


    public void konikCierny(char[][] sachovnica, int x, int y){
        System.out.println("prave si zvolil ze chces pohnut konom a kedze kon ma viac moznosti ako sa hybat, priprav si logicke myslenie :D");
        System.out.println("prve cislo bude riadok cize do lava ci prava..");
        System.out.println("ak chces ist do lava, tak zadaj cislo od -1 do -2 podla toho kolko policok chces ist do lava");
        System.out.println("ak chces ist do prava, zadaj cislo od 1 do 2 podla toho o kolko chces ist do prava");
        int a;
        do {
            a = cisloDavac.getCislo();
        }
        while ((a>2)|(a<-2));
        System.out.println("druhe cislo bude ci pojdes hore alebo dole");
        System.out.println("hore(1)");
        System.out.println("dole(lubovolne cislo)");
        int b = cisloDavac.getCislo();

        if ((a==-1) & (b==1)){
            // hore v lavo
            if (vyhadzovac.vyhadzovacCiernyBezX(sachovnica,x-2,y-1)){
                sachovnica[x][y]='x';
                sachovnica[x+2][y-1]='H';
            }else {
                niecoSaDeje.trololo(sachovnica,false);
            }
        }else {
            if ((a==-1)&(b!=1)){
                // dole v lavo
                if (vyhadzovac.vyhadzovacCiernyBezX(sachovnica,x+2,y-1)){
                    sachovnica[x][y]='x';
                    sachovnica[x+2][y-1]='H';
                }else {
                    niecoSaDeje.trololo(sachovnica,false);
                }
            }else {
                if ((a==-2)&(b==1)){
                    //hore v lavo 2
                    if (vyhadzovac.vyhadzovacCiernyBezX(sachovnica,x-1,y-2)){
                        sachovnica[x][y]='x';
                        sachovnica[x-1][y-2]='H';
                    }else {
                        niecoSaDeje.trololo(sachovnica,false);
                    }
                }else {
                    if ((a==-2)&(b!=1)){
                        // dole v lavo 2
                        if (vyhadzovac.vyhadzovacCiernyBezX(sachovnica,x+1,y-2)){
                            sachovnica[x][y]='x';
                            sachovnica[x+1][y-2]='H';
                        }else {
                            niecoSaDeje.trololo(sachovnica,false);
                        }
                    }else {
                        if ((a==1)&(b==1)){
                            // hore do prava
                            if (vyhadzovac.vyhadzovacCiernyBezX(sachovnica,x-2,y+1)){
                                sachovnica[x][y]='x';
                                sachovnica[x-2][y+1]='H';
                            }else {
                                niecoSaDeje.trololo(sachovnica,false);
                            }
                        }else {
                            if ((a==1)&(b!=1)){
                                // dole do prava
                                if (vyhadzovac.vyhadzovacCiernyBezX(sachovnica,x+2,y+1)){
                                    sachovnica[x][y]='x';
                                    sachovnica[x+2][y+1]='H';
                                }else {
                                    niecoSaDeje.trololo(sachovnica,false);
                                }
                            }else {
                                if ((a==2)&(b==1)){
                                    // hore do prava 2
                                    if (vyhadzovac.vyhadzovacCiernyBezX(sachovnica,x-1,y+2)){
                                        sachovnica[x][y]='x';
                                        sachovnica[x-1][y+2]='H';
                                    }else {
                                        niecoSaDeje.trololo(sachovnica,false);
                                    }
                                }
                                if ((a==2)&(b!=1)){
                                    // dole do prava 2
                                    if (vyhadzovac.vyhadzovacCiernyBezX(sachovnica,x+1,y+2)){
                                        sachovnica[x][y]='x';
                                        sachovnica[x+1][y+2]='H';
                                    }else {
                                        niecoSaDeje.trololo(sachovnica,false);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}
