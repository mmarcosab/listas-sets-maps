import java.util.ArrayList;
import java.util.Comparator;

public class TestandoListaItem {
    public static void main(String[] args) {
        Item item1 = new Item("Item 1", 1);
        Item item2 = new Item("Item 2", 2);
        Item item3 = new Item("Item 3", 3);
        Item item4 = new Item("Item 4", 4);
        Item item5 = new Item("Item 5", 5);

        ArrayList<Item> itens = new ArrayList<>();
        itens.add(item1);
        itens.add(item4);
        itens.add(item2);
        itens.add(item5);
        itens.add(item3);

        System.out.println(itens);

        //ordenar com lambda
        itens.sort((i1, i2) -> Integer.compare(i1.getCodigo(), i2.getCodigo()));

        System.out.println(itens);

        itens = new ArrayList<>();
        itens.add(item1);
        itens.add(item4);
        itens.add(item2);
        itens.add(item5);
        itens.add(item3);

        //ordenar com comparator

        itens.sort(Comparator.comparing(Item::getCodigo));

        System.out.println(itens);

    }
}
