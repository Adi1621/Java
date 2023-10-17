import java.util.*;
public class arrayList {
    public static void main(String[] args){
        Integer n = Integer.valueOf(4); //declaring int n
        System.out.println(n);

        ArrayList<Integer> a = new ArrayList<>(); // declaring arraylist
        
        //add new element
        a.add(4);
        a.add(5);
        a.add(6);
        a.add(7);
        a.add(8);

        // get an element at index i
        System.out.println(a.get(2));

        //print with for loop
        for(int i = 0;i<a.size();i++){
            System.out.println(a.get(i));
        }
         //print arrlist without forloop
         System.out.println(a); 
         
         //add element at some index
         a.add(0,3);
         System.out.println(a);

         //modifing element at index i
        a.set(0,2);
        System.out.println(a);

        //removing an element at index i
        a.remove(0);

        //removing an element
        a.remove(Integer.valueOf(8));
        System.out.println(a);

        //check wheather element exists or not
        boolean ans =a.contains(Integer.valueOf(9));
        System.out.println(ans);

        //sorting
        for(int i= 0;i<a.size();i++){
            Collections.sort(a);
        
        }
        System.out.println(a);

        



    }



    
}
