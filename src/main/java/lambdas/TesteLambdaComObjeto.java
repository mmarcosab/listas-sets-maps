package lambdas;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class TesteLambdaComObjeto {

    public static void main(String[] args) {

        Item item = new Item(1, "Ajkahdlkasd");

        Item item2 = new Item(2, "glçkmslksjkf");
        Item item3 = new Item(3, "bsdklojksjdfç");
        Item item4 = new Item(4, "ikjdnjksdnfskjdn");
        Item item5 = new Item(5, "psdkjfsdkjfhkjsfh");

        List<Item> itens = new ArrayList<>();

        itens.add(item);
        itens.add(item2);
        itens.add(item3);
        itens.add(item4);
        itens.add(item5);

        System.out.println("sort by id");
        itens.sort((i1, i2) -> Integer.compare(i1.getId(), i2.getId()));

        itens.forEach(i -> {
            System.out.println(i);
        });

        System.out.println("sort by name");
        itens.sort((i1, i2) -> i1.getName().compareTo(i2.getName()));

        System.out.println("sort by name");
        itens.sort(Comparator.comparing(i -> i.getName()));


        itens.forEach(i -> {
            System.out.println(i);
        });


    }

}
