package lambda;

@FunctionalInterface
public interface Addition {
    int add(int i, int j);

    int hashCode();

    public static void print(){
        System.out.println("I am Dino, enjoying my life.");
    }

    public static void print2(){
        System.out.println("I am Dino, enjoying my life.");
    }

    default void type(){
        System.out.println("I am a good writer.");
    }

    default void type2(){
        System.out.println("I am a good writer.");
    }
}
