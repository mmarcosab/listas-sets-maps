package lambdas;

import java.util.ArrayList;
import java.util.List;

public class TesteOrdenacaoLambda {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(6);
        list.add(3);
        list.add(10);
        list.add(9);

        list.sort((item1, item2) -> Integer.compare(item1, item2));

        list.forEach(item -> {
            System.out.println(item);
        });


    }

}
