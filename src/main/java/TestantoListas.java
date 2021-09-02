import java.util.ArrayList;
import java.util.List;

public class TestantoListas {
    public static void main(String[] args) {
        String item1 = "Item 1";
        String item2 = "Item 2";
        String item3 = "Item 3";

        List<String> itens = new ArrayList<>();

        itens.add(item1);
        itens.add(item2);
        itens.add(item3);

        System.out.println(itens);

        //dentro de arraylist existe o metodo forEach
        itens.forEach(item -> {
            //executar algumn código aqui
        });

    }
}
