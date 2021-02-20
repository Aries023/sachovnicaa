package figurky;

public class Strelec extends StrelecRozhranie {

    public void strelecBiely(char[][] sachovnica, int x, int y) {
        super.strelecBiely(sachovnica, x, y,'s');
    }

    public void strelecCierny(char[][] sachovnica, int x, int y) {
        super.strelecCierny(sachovnica, x, y,'S');
    }
}
