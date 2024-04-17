import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Entity> entities = new ArrayList<>();

        entities.add(new Character());
        entities.add(new Character());
        entities.add(new Monster());
        entities.add(new Monster());

        for (Entity entity : entities) {
            entity.fazerSom();
        }
    }
}
