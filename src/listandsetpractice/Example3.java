package listandsetpractice;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 *
 * @author Mark Van Weelden <mvanweelden1@my.wctc.edu>
 */
public class Example3 {
    
    public static void main(String[] args) {
        
        Dog dog1 = new Dog("Fido", 3, "a");
        Dog dog2 = new Dog("Max", 2, "b");
        Dog dog3 = new Dog("Fido", 3, "a");
        
        List<Dog> dogs = new ArrayList<Dog>();
        dogs.add(dog1);
        dogs.add(dog2);
        dogs.add(dog3);
        
        Set dogSet = new HashSet(dogs);
        
        dogs = new ArrayList<Dog>(dogSet);
        
        System.out.println(dogs.size());
    }

}
