package methodreference;

interface MyInterface {
    void print(String in);
}
public class MethodReferenceWithNonStaticMethod {

    public void printTheseBooks(String in){
        System.out.println("These are total no of books" + in);
    }


    public static void main(String[] args) {
        MethodReferenceWithNonStaticMethod obj = new MethodReferenceWithNonStaticMethod();
        MyInterface myInterface = obj::printTheseBooks;
        myInterface.print("Jagga - loyal books");
    }
}
