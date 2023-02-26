package methodreference;

import java.util.function.BiConsumer;

public class OverloadingWithMethodReference {
    static void add(int v1, int v2){
        System.out.println("Addition of two values are "+ (v1+v2));
    }

    static void add(float v1, float v2){
        System.out.println("Addition of two values are "+ (v1+v2));
    }

    public static void main(String[] args) {
        BiConsumer<Integer, Integer> biInteger = OverloadingWithMethodReference::add;
        biInteger.accept(4, 7);

        BiConsumer<Float, Float> biInteger2 = OverloadingWithMethodReference::add;
        biInteger2.accept(8.5555f, 7f);
    }
}
