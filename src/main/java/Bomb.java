import java.util.ArrayList;
import java.util.List;

public class Bomb implements gameElement {
    private int x;
    private int y;
    private String type = "B";

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
