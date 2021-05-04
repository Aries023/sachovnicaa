package untils;

public class Vyhadzovac {

    public boolean vyhadzovacBiely(char [][] sachovnica, int x, int y){
        return switch (sachovnica[x][y]) {
            case 'x', 'p', 'v', 's', 'h', 'q', 'k' -> false;
            default -> true;
        };
    }

    public boolean vyhadzovacCierny(char [][] sachovnica, int x, int y){
        return switch (sachovnica[x][y]) {
            case 'x', 'P', 'V', 'S', 'H', 'Q', 'K' -> false;
            default -> true;
        };
    }

    public boolean vyhadzovacBielyBezX(char [][] sachovnica, int x, int y){
        if (((x<=7)&(x>=0))&((y<=7)&(y>=0))){
            return switch (sachovnica[x][y]) {
                case 'p', 'v', 's', 'h', 'q', 'k' -> false;
                default -> true;
            };
        }else {
            System.out.println("ides mimo sachovnice! skus to znova..");
            return false;
        }
    }

    public boolean vyhadzovacCiernyBezX(char [][] sachovnica, int x, int y){
        if (((x<=7)&(x>=0))&((y<=7)&(y>=0))){
            return switch (sachovnica[x][y]) {
                case 'P', 'V', 'S', 'H', 'Q', 'K' -> false;
                default -> true;
            };
        }else {
            System.out.println("ides mimo sachovnice! skus to znova..");
            return false;
        }
    }
}
