import java.util.List;
import java.util.Random;

public class Game {
    private static final int DEFAULT_X_POSITION = 2;
    private static final int DEFAULT_Y_POSITION = 2;

    private Player player;
    private Monster monster1;
    private Monster monster2;
    private Bomb bomb;
    private RpgMap rpgMap;

    public Game() {
        this.rpgMap = createRpgMap();
        this.player = createPlayer();
        this.monster1 = createMonster();
        this.monster2 = createMonster();
        this.bomb = createBomb();
    }

    public Player createPlayer() {
        Player player = new Player();
        player.setPosition(DEFAULT_X_POSITION, DEFAULT_Y_POSITION);
        arrange(player);
        return player;
    }

    public RpgMap createRpgMap() {
        return new RpgMap();
    }

    public Monster createMonster() {
        Monster monster = new Monster();
        setRandomPosition(monster);
        arrange(monster);
        return monster;
    }

    public Bomb createBomb() {
        Bomb bomb = new Bomb();
        setRandomPosition(bomb);
        arrange(bomb);
        return bomb;
    }

    public void printMap() {
        for (int i = 0; i < rpgMap.rpgMap.length; i++) {
            for (int j = 0; j < rpgMap.rpgMap.length; j++) {
                System.out.print(rpgMap.rpgMap[i][j]+"\t");

            }
            System.out.println();
        }
    }

    public void arrange(gameElement element) {
        String[][] map = rpgMap.getRpgMap();
        List<Integer> position;
        int x;
        int y;
        while (true) {
            position = element.getPosition();
            x = position.get(0);
            y = position.get(1);

            if ((map[x][y].equals("+"))) {
                if(element.getType().equals("B")) {
                    return;
                }
                map[x][y] = element.getType();
                return;
            }
            setRandomPosition(element);
        }
    }

    public void setRandomPosition(gameElement element) {
        Random random = new Random();
        int x = random.nextInt(4);
        int y = random.nextInt(4);
        element.setPosition(x, y);
    }
}
