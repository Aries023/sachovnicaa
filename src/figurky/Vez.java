package figurky;

public class Vez extends VezRozhranie {

    public void vezBiela(char[][] sachovnica, int x, int y) {
        super.vezBiela(sachovnica, x, y, 'v');
    }

    public void vezCierna(char[][] sachovnica, int x, int y) {
        super.vezCierna(sachovnica, x, y,'V');
    }
}
