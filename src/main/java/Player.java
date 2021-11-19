import java.util.ArrayList;
import java.util.List;

public class Player implements gameElement {
    private int x;
    private int y;
    private int score;
    private String type = "P";

    @Override
    public void setPosition(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public List<Integer> getPosition() {
        List<Integer> position = new ArrayList<>();
        position.add(this.x);
        position.add(this.y);
        return position;
    }

    @Override
    public String getType() {
        return this.type;
    }
}
