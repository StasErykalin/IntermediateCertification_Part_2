import java.util.Random;

public class Toy {
    private static int countId = 1;
    private int id;
    private String name;
    private int weight;
    private Random rnd = new Random();

    public Toy() {
        this.id = setId();
        this.name = setName();
        this.weight = setWeight();
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }

    private int setId(){
        return countId++;
    }
    private int setWeight(){

        return this.rnd.nextInt(1, 101);

    }

    private String setName(){
        return String.valueOf(NamesOfToys.values()[new Random().nextInt(NamesOfToys.values().length - 1)]);
    }

    @Override
    public String toString() {
        return "Toy{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", weight=" + weight +
                '}';
    }
}
