package Collections;

import java.util.ArrayList;
import java.util.Collections;

public class SortNames {
    public static void main(String[] args) {

        ArrayList<String> employees = new ArrayList<>();

        employees.add("John");
        employees.add("David");
        employees.add("Alex");

        Collections.sort(employees);

        System.out.println(employees);
    }
}
