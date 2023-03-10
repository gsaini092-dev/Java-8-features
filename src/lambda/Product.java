package lambda;

public class Product {
    int id;
    String name;
    float price;

    public Product(int id, String name, float price){
        this.id = id;
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return String.format("id- %d, name - %s, price - %2f", id, name, price);
    }
}
