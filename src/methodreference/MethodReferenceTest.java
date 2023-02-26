package methodreference;

@FunctionalInterface
interface Sayable {
    void say();
}

public class MethodReferenceTest {

    public static void saySomething(){
        System.out.println("I am saying somethings.");
    }

    public static void dinoMethod(){
        System.out.println("this is Dino's methods");
    }

    public static void main(String[] args) {
      Sayable sayable = MethodReferenceTest::saySomething;
      sayable.say();
    }
}
