package methodreference;

@FunctionalInterface
interface Printable{
    void print();

    int hashCode();
    boolean equals(Object obj);
    static void printWithMessage(String msg){
        System.out.println("Printable value is: "+ msg);
    }

    default void myDefaultMethod(){
        System.out.println("I am into default method.");
    }
}

public class MiscMethodInterface implements Printable {

    @Override
    public void print() {
        System.out.println("Give me a command, i would like to print for you buddy.");
    }

    public static void main(String[] args) {
        MiscMethodInterface miscMethodInterface = new MiscMethodInterface();
        miscMethodInterface.print();
        miscMethodInterface.myDefaultMethod();
        Printable.printWithMessage("Dino");
    }
}
