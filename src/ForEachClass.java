import methodreference.PreDefinedFunctionalInterfaces;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class ForEachClass {



    public static void main(String[] args) {
        List<String> studentNameList = new ArrayList<>();
        studentNameList.add("Dino");
        studentNameList.add("Guarav");
        studentNameList.add("Koko");
        studentNameList.add("Mabola");

        studentNameList.forEach(val -> System.out.println(val));

        System.out.println("Adding line into feature/branchA");
    }
}
