package listandsetpractice;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Mark Van Weelden <mvanweelden1@my.wctc.edu>
 */
public class Example4 {

    public static void main(String[] args) {

        List hobbyItems = new ArrayList();

        hobbyItems.add("Kite");
        hobbyItems.add("Model train");
        hobbyItems.add("Bicycle");

        for (int i = 0; i < hobbyItems.size(); i++) {

            System.out.println((String) hobbyItems.get(i));
        }

        LivingBeing e1 = new Employee("Bob", "04/13/2001", 2565);
        LivingBeing e2 = new Employee("Bill", "05/13/2001", 2265);
        LivingBeing e3 = new Employee("Joe", "06/13/2001", 2365);
        LivingBeing d1 = new Dog("Max", 3, "a");

//        List<Employee> employees = new ArrayList<Employee>();
//
//        employees.add(e1);
//        employees.add(e2);
//        employees.add(e3);
//
//        for (Employee e : employees) {
//
//            System.out.println("Name: " + e.getName() + " \t" + "Clock Number: "
//                    + e.getClockNumber());
//        }

        List livingBeingList = new ArrayList();

        livingBeingList.add(e1);
        livingBeingList.add(e2);
        livingBeingList.add(e3);
        livingBeingList.add(d1);
        
        for(int i = 0; i < livingBeingList.size(); i++){
            LivingBeing l = (LivingBeing)livingBeingList.get(i);
            System.out.println(l.getName());
        }




    }
}
