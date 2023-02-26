package methodreference;

import java.util.function.BiConsumer;
import java.util.function.BiPredicate;

public class WithPredefinedFunctionalINterfaces {

    public static void add(int i, int j){
        System.out.println("Final value is: "+(i+j));
    }

    public static boolean isValid(int i, String value){
        return true;
    }

    public static void main(String[] args) {
        BiConsumer<Integer, Integer> biConsumer = WithPredefinedFunctionalINterfaces::add;
        biConsumer.accept(12,3);


        BiConsumer<Integer, Integer> biConsumer1 = (i, j) -> {

             System.out.println("This functionality is provied via lamda expresssions")    ;
        };
        biConsumer1.accept(12,3);

        // If i wana return
        BiPredicate<Integer, String> biPredicate = WithPredefinedFunctionalINterfaces::isValid;
        boolean result =  biPredicate.test(12, "my test");
        System.out.println(result);
    }
}
