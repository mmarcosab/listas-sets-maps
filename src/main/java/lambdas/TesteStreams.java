package lambdas;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class TesteStreams {

    public static void main(String[] args) {

        Item item = new Item(1, "Ajkahdlkasd");

        Item item2 = new Item(2, "glçkmslksjkf");
        Item item3 = new Item(3, "bsdklojksjdfç");
        Item item4 = new Item(4, "ikjdnjksdnfskjdn");
        Item item5 = new Item(10, "psdkjfsdkjfhkjsfh");

        List<Item> itens = new ArrayList<>();

        itens.add(item);
        itens.add(item2);
        itens.add(item3);
        itens.add(item4);
        itens.add(item5);


//        itens.stream()
//                .filter(i -> i.getId() > 5)
//                .forEach(i -> System.out.println(i));

        IntStream ids = itens.stream()
                .mapToInt(i -> i.getId());

//        ids.forEach(System.out::println);

        Optional<Item> itemFiltrado = itens.stream()
                .filter(i -> i.getId() == 10)
                .findAny();


//        itens.stream()
//                .filter(i -> i.getId() == 10)
//                .findAny()
//                .ifPresent(i -> System.out.println(i));

        List<Item> itensFiltrados = itens.stream()
                .filter(i -> i.getId() < 8)
                .collect(Collectors.toList());

        Map<String, String> mapItens = itens.stream()
                .collect(Collectors.toMap(
                        i -> i.getId().toString(),
                        i -> i.getName()));

        //System.out.println("Item filtrado: " + itemFiltrado);
        System.out.println(mapItens);
    }

}
