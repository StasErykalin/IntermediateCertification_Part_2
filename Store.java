import java.util.ArrayList;
import java.util.Collections;

public class Store {
    private  int countToys;
    private ArrayList<Toy> listToys = new ArrayList<>();
    private ArrayList<Toy> addToy(){
        while(listToys.size() < 10){
            listToys.add(new Toy());
        }
        return listToys;
    }
    public void checkWidth(){
        if(listToys.size() < 10) {
            addToy();
            System.out.println("В список добавлены игрушки");
        }else {
            System.out.println("Список полон добавление игрушек не требуется. ");
        }
    }

    public void getListToys() {
        for (Toy toy: this.listToys) {
            UI.print(String.format("%s %S %s",toy.getId(), toy.getName(), toy.getWeight()));
        }
    }

    public void getPrizeToy(){
        Collections.sort(listToys, new ComparatorByWeidth());
        Collections.reverse(listToys);
        getListToys();
        Logger.writeFile(listToys.get(0).toString());
        listToys.remove(0);
        checkWidth();
    }


}
