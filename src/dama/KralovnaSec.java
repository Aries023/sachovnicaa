package dama;

// tato class je pripravena az budem chciet pridat dámu.
// funkcia tejto class je skontrolovat sachovnicu na konci tahu.
// ak je pesiak na druhej strane sachovnice, zmeni ho v kralovnu

public class KralovnaSec {

    void PesiakolkaB (char [][] sachovnica){
        for (int a = 0; a<sachovnica.length ;a++){
            for (int b=0; b<sachovnica.length ;b++) {
                if (a==0){
                    if (sachovnica[a][b] == 'P'){
                        sachovnica[a][b] = 'Q';
                    }
                }else {if (a==7){
                   if (sachovnica[a][b] == 'p'){
                       sachovnica[a][b] = 'q';
                   }
                }}}}
    }


}
