package dama;

import untils.CisloDavac;
import untils.NiecoSaDeje;

// PesiakZlyhanie v skutocnosti nie je zlyhanie ale bola to uplne prva figurka ktora mala fungovat v sachu,
// ale spravil som ju vhodnu na dámu.. ponechal som ju tu s tym ze v buducnosti mozno doplnim aj dámu

public class PesiakZlyhanie {
    CisloDavac cisloDavac = new CisloDavac();
    NiecoSaDeje niecoSaDeje=new NiecoSaDeje();

    // Biely..
    public char [][] pesiakBiely (char [][] sachovnica, int x, int y){
        if ((x-2<0 & sachovnica[x-1][y+1]!='x')|(x+2>7 & sachovnica[x+1][y+1]!='x')){
            while (true){
                System.out.println("mas moznost niekoho preskocit.. chces skakat do lava(1) ci prava?(lubovolne tlacidlo..)");
                if (cisloDavac.getCislo()==1){
                    if (x-2<0|sachovnica[x-1][y+1]=='x'){
                        System.out.println("nemas co preskocit!");
                    }else {
                        sachovnica[x][y]='x';
                        sachovnica[x-2][y+2]='p';
                        break;
                    }
                }else {
                        if (x+2>7|sachovnica[x+1][y+1]=='x'){
                            System.out.println("nemas co preskocit!");
                        }else {
                            sachovnica[x][y] = 'x';
                            sachovnica[x + 2][y + 2] = 'p';
                            break;
                        }
                }
            }
        }else {
            if (sachovnica[x][y+1]!='x'){
                System.out.println("niekto je pred tebou!");
                niecoSaDeje.trololo(sachovnica, true);
            }else {
                if (y==1 & sachovnica[x][y+2]=='x'){
                    System.out.println("chces ist o dve policka?(1) alebo o jedno?(lubovolna klavesa)");
                    if (cisloDavac.getCislo()==1){
                        sachovnica[x][y]='x';
                        sachovnica[x][y+2]='p';
                    }else {
                        sachovnica[x][y]='x';
                        sachovnica[x][y+1]='p';
                    }
                }else {
                    sachovnica[x][y]='x';
                    sachovnica[x][y+1]='p';
                }
            }
        }
        return sachovnica;
    }
    //--------------------------------------------------------------------------------------
    // CIERNY!! .........
    public char [][] pesiakCierny (char [][] sachovnica, int x, int y){
        if ((x+2>7 & sachovnica[x+1][y-1]!='x')|(x-2<0 & sachovnica[x-1][y-1]!='x')){
            while (true){
                System.out.println("mas moznost niekoho preskocit.. chces skakat do lava(1) ci prava?(lubovolne tlacidlo..)");
                if (cisloDavac.getCislo()==1){
                    if (x+2>7|sachovnica[x+1][y-1]=='x'){
                        System.out.println("nemas co preskocit!");
                    }else {
                        sachovnica[x][y]='x';
                        sachovnica[x+2][y-2]='p';
                        break;
                    }
                }else {
                    if (x-2<0|sachovnica[x-1][y-1]=='x'){
                        System.out.println("nemas co preskocit!");
                    }else {
                        sachovnica[x][y] = 'x';
                        sachovnica[x - 2][y - 2] = 'p';
                        break;
                    }
                }
            }
        }else {
            if (sachovnica[x][y-1]!='x'){
                System.out.println("niekto je pred tebou!");
                niecoSaDeje.trololo(sachovnica, false); // TU
            }else {
                if (y==6 & sachovnica[x][y-2]=='x'){
                    System.out.println("chces ist o dve policka?(1) alebo o jedno?(lubovolna klavesa)");
                    if (cisloDavac.getCislo()==1){
                        sachovnica[x][y]='x';
                        sachovnica[x][y-2]='p';
                    }else {
                        sachovnica[x][y]='x';
                        sachovnica[x][y-1]='p';
                    }
                }else {
                    sachovnica[x][y]='x';
                    sachovnica[x][y-1]='p';
                }
            }
        }
        return sachovnica;
    }
}
