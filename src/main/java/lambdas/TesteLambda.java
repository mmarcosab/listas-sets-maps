package lambdas;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class TesteLambda {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("test 1");
        list.add("test 2");
        list.add("test 3");
        list.add("test 4");
        list.add("test 5");


        list.forEach(new Consumer<String>() {
            public void accept(String item) {
                System.out.println(item);
            }
        });


        list.forEach(s -> {
            System.out.println(s);
        });

    }

}
