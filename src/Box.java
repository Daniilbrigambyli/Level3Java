import java.util.ArrayList;
import java.util.List;

public class Box <T extends Fruit> {
    public List<T> fruits = new ArrayList<>();

    public double weight() {
        double t = 0;
        for(T fruit : fruits) {
            t = t + fruit.weight();
        }
        return t;
    }

    public boolean compare(Box<?> nextBox) {
        return (this.weight() == nextBox.weight());
    }

    public void boxToBox(Box<T> nextBox) {
        for (T fruit : fruits) {
            nextBox.add(fruit);
        }       fruits.clear();
    }

    public void addBox(T fruit) {
        this.fruits.addAll(List.of(fruit));
    }

    public void add(T fruit) {
        fruits.add(fruit);
    }
}
