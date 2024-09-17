package lambda;

import javax.sound.midi.Soundbank;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LambdaTest {
    public static void main(String[] args) {
       /* Addition addition = ( i, j) -> {
            int z = i+j;
           return z;
        };

        int result = addition.add(2,3);
        System.out.println("Final value is: "+ result);
        */

       /* Thread1 th = new Thread1();
        Thread th1 = new Thread(th);
        th1.start();

        // New way is
        Runnable runnable = () -> {
            System.out.println("Via Lambda -The thread is running- "+ Thread.currentThread().getName());
        };
        Thread th2 = new Thread(runnable);
        th2.start();
        */

        // 3.
        List<Product> productList = new ArrayList<>();
        productList.add(new Product(1, "Pen", 10));
        productList.add(new Product(2, "Key", 20.5f));
        productList.add(new Product(3, "Shoes", 2000.5f));
        productList.add(new Product(4, "Apple", 100.6f));

        //Collections.sort(productList, new ProductNameComparator());

        // New way to do
        Collections.sort(productList, (o1, o2) -> {
            if(o1.price < o2.price) return 1;
            else if(o1.price > o2.price) return -1;
            else return 0;
        });

        for (Product p : productList) {
            System.out.println(p);
        }
        System.out.println("I have added this line in master/main.");
        System.out.println("Updating this line into feature/changes-01.");
    }
}

class Thread1 implements Runnable{

    @Override
    public void run() {
        System.out.println("The thread is running- "+ Thread.currentThread().getName());
    }
}
