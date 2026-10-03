import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

public class JavaCollection {
    public static void main(String[] args) {
        // ArrayList 
        ArrayList<Integer> arr = new ArrayList<>();
        
        //Methods
        // add() : to add element 
        arr.add(10);
        arr.add(50);
        System.out.println(arr);
        // remove() : tp reove element 
        arr.remove(1);
        System.out.println(arr);

        // addAll(): to add multiple elements
        ArrayList<Integer> arr2 = new ArrayList<>();
        arr2.add(50);
        arr2.add(100);
        arr2.addAll(arr);
        System.out.println(arr2);
        // removeall :  to remove all elemnet of collenction 
        arr2.removeAll(arr);
        System.err.println(arr2);
        // size() :  to get size 
        System.out.println(arr.size());
        // clear() : to clear all elements
        // arr.clear(); 
        // System.out.println(arr.size());



        arr.add(50);
        arr.add(100);

        // to iterate through collection 
        Iterator<Integer> i = arr.iterator(); 
        // hasNext() : if the next elemetn prsent 
        while(i.hasNext()){
            System.out.println(i.next());
        }

        // get 
        System.out.println("get index :"+ arr.get(0));
        // set 
        arr.set(0,11);
        System.out.println(arr);

        //toArray : collenction conver iinto array
        Object[] o = arr.toArray();
        for(Object Obj : o){
            System.out.println(Obj);
        }

        //contains : cheack wheather the elemetn is present or not
        System.out.println(arr.contains(100));

        // above was the methodof the collection

        // now Arraylist methods 
        //sort() : sort the array 
        arr.add(500);
        Collections.sort(arr);
        System.out.println("sorted array L: "+arr);

        //clone : create a new array with same element 
        ArrayList<Integer> c = (ArrayList<Integer>) arr.clone();
        System.out.println("clones list : "+c);

        //enusre capacity : 
        // specify tthe total elemt arrat can contain

        //isEmpty : cheak if array is empty 
        // indexOf() :  searches aspecified element in an arraylist the element

        // so now what should id o 
    }
}
