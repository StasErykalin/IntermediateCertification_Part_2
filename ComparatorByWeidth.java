import java.util.Comparator;

public class ComparatorByWeidth implements Comparator<Toy> {
    @Override
    public int compare(Toy toy, Toy t1) {
        return Integer.compare(toy.getWeight(), t1.getWeight());
    }
}
