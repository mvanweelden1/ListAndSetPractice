package listandsetpractice;

import java.util.*;

/**
 *
 * @author Mark Van Weelden <mvanweelden1@my.wctc.edu>
 */
public class Example1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

//        List groceryList = new ArrayList();
//        groceryList.add("Beer");
//        groceryList.add("Pizza");
//        groceryList.add("Chips");
//
//        String item = (String)groceryList.get(1);
//        System.out.println(groceryList.size());
//        groceryList.remove(2);
//        System.out.println(groceryList.size());
//        
//        for(int i = 0;i < groceryList.size(); i++){
//            String s = (String)groceryList.get(i);
//            System.out.println(s);
//        }
        
//
        List<String> groceryList = new ArrayList<String>();
        groceryList.add("Beer");
        groceryList.add("Pizza");
        groceryList.add("Chips");
        groceryList.add("Beer");

        String item = groceryList.get(1);
        System.out.println(item);
        
        
        System.out.println(groceryList.indexOf("Chips"));
        System.out.println(groceryList.indexOf("Milk"));
        
//        groceryList.clear();
        groceryList.add(0, "Milk");
        
        for(String s : groceryList){
            System.out.println(s);
        }
        
        System.out.println(groceryList.size());
        System.out.println(groceryList.isEmpty());




    }
}
