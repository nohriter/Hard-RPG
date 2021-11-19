import java.util.List;

public interface gameElement {
    void setPosition(int x, int y);
    List<Integer> getPosition();
    String getType();
}
