package untils;


import figurky.*;

public class NiecoSaDeje {

    public char [][] trololo(char [][] sachovnica, boolean radaJeNa){
        CisloDavac cisloDavac = new CisloDavac();

        // vyber si figurku
        System.out.println("zadaj suradnice svojej figurky ktorou chces pohnut");
        System.out.print("prve cislo (riadok) : ");
        int x = cisloDavac.getCislo();
        System.out.println();
        System.out.print("druhe cislo (stlpec) : ");
        int y =cisloDavac.getCislo();
        System.out.println();

        // figurky
        Pesiak pesiak=new Pesiak();
        Strelec strelec = new Strelec();
        Kral kral = new Kral();
        Vez vez = new Vez();
        Kralovna kralovna = new Kralovna();
        Kon kon =new Kon();

        if (radaJeNa){
            // biely
            switch (sachovnica[x][y]) {
                case 'p' -> {
                    pesiak.pesiakBiely(sachovnica, x, y);
                    return sachovnica;
                }
                case 's' -> {
                    strelec.strelecBiely(sachovnica, x, y);
                    return sachovnica;
                }
                case 'k' -> {
                    kral.kralBiely(sachovnica, x, y);
                    return sachovnica;
                }
                case 'v' -> {
                    vez.vezBiela(sachovnica, x, y);
                    return sachovnica;
                }
                case 'q' -> {
                    kralovna.kralovnaBiela(sachovnica, x, y);
                    return sachovnica;
                }
                case 'h' -> {
                    kon.konikBiely(sachovnica, x, y);
                    return sachovnica;
                }
                default -> {
                    System.out.println("oh no! nieco si dodubal!");
                    trololo(sachovnica, radaJeNa);
                }
            }
        }else {
            // cierny
            switch (sachovnica[x][y]) {
                case 'P' -> {
                    pesiak.pesiakCierny(sachovnica, x, y);
                    return sachovnica;
                }
                case 'S' -> {
                    strelec.strelecCierny(sachovnica, x, y);
                    return sachovnica;
                }
                case 'K' -> {
                    kral.kralCierny(sachovnica, x, y);
                    return sachovnica;
                }
                case 'V' -> {
                    vez.vezCierna(sachovnica, x, y);
                    return sachovnica;
                }
                case 'Q' -> {
                    kralovna.kralovnaCierna(sachovnica, x, y);
                    return sachovnica;
                }
                case 'H' -> {
                    kon.konikCierny(sachovnica, x, y);
                    return sachovnica;
                }
                default -> {
                    System.out.println("oh no! nieco si dodubal!");
                    trololo(sachovnica, radaJeNa);
                }
            }
        }
        return sachovnica;
    }
}
