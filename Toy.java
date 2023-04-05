public class Toy {
    private static int countId = 1;
    private int id;
    private String name;
    private int weight;

    public Toy(String name, int weight) {
        this.id = setId();
        this.name = name;
        this.weight = weight;
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
}
