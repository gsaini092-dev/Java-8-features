package methodreference;

import java.util.function.*;

public class PreDefinedFunctionalInterfaces {

    public static void myMethod(String val){
        System.out.println("value is :"+ val);
    }

    public static String add(int i, float j){
        float result = i+j;
        return "Final value is: "+ result;
    }

    public static String print(int i){
        return "Provided value is: "+ i;
    }

    public static boolean validateAge(int val){
        return val < 18;
    }

    public static void main(String[] args) {
        Consumer<String> consumer1 = PreDefinedFunctionalInterfaces::myMethod;
        consumer1.accept("hello");

        BiFunction<Integer, Float, String> biFunction =PreDefinedFunctionalInterfaces::add;
        System.out.println(biFunction.apply(12, 12.5f));

        Function<Integer, String> function = PreDefinedFunctionalInterfaces::print;
        System.out.println(function.apply(5000));

        Predicate<Integer> predicate =PreDefinedFunctionalInterfaces::validateAge;
        if(predicate.test(12)){
            System.out.println("You are not eligible to access this website.");
        } else {
            System.out.println("You are eligible, we are redirecting to you to destination site.");
        }

        BiPredicate<Integer, Integer> biPredicate = (i,j) -> {
            return i > j;
        };
        System.out.println("Final value is: "+ biPredicate.test(23, 12));
    }

}
