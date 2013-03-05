package listandsetpractice;

import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author Mark Van Weelden <mvanweelden1@my.wctc.edu>
 */
public class Example2 {

    public static void main(String[] args) {
        
        Dog dog1 = new Dog("Fido", 3, "a");
        Dog dog2 = new Dog("Max", 2, "b");
        Dog dog3 = new Dog("Fido", 3, "a");
        
        if(dog1.equals(dog3)) {
            System.out.println("Dog1 and Dog3 are equal");
        }
        else {
            System.out.println("These are not equal");
        }
        
        List<Dog> dogs = new ArrayList<Dog>();
        dogs.add(dog1);
        dogs.add(dog2);
        dogs.add(dog3);
        
    }
}
