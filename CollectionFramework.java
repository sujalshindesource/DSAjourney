/// Collectio -- > List , Queue ,  Set 
/// List --> ArrayList , LinkedList , 
/// Qeu --> Dqueu 
/// Set --> Hashset , LinkedHashSet , SortedSet 
/// Map --> SortedMap , Iterator --> ListIterator 
/// 


import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;
import java.util.Vector;

/// Collection 
class Collectionn {
    // parent of all collections 
    // have some basic methods 4
    // ALso the Linked list okay
    void basicMethod(){
        LinkedList<Integer> c = new LinkedList<Integer>();
        //add()
        c.add(10);
        ////addfirst()
        c.addFirst(20);
        c.remove(0);
        c.removeFirst();
        c.add(25);
        c.add(30);
        c.removeLast();
        System.out.println("get the last e"+c.getLast());
        System.out.println("get the i element"+c.get(0));
        System.out.println(c);
        System.out.println(c.getFirst());
        System.out.println("get the head of the list"+c.peek());
        System.out.println("return and remove the first element : "+c.poll());
        System.out.println("final Linked List : "+c);
    } 
}

class Vectorr {
    void BasicMethods(){
        Vector<Integer> v = new  Vector<>();
        // and then again those basic methods mentioned above 

        // vector is less effiecient 
        // it has synchronised each operation 
        // it is thread safe 
    }
}

class Stackk{
    void basicMethod(){
        // Collection <--extend List <--implement Vector <--extend Stack
        Stack<Integer> s = new Stack<>();
        // push : to push an eleemnt 
        s.push(10);
        s.push(12);
        s.push(11);
        // pop() : remove the top element 
        s.pop();
        // peek() fetch top elemetn 
        System.out.println("fetch top elemetn "+s.peek());
        // return -1 if not found if found retrun the index 
        // int st = s.search(s.firstElement());
        // System.out.println(s.get(st));
        s.empty();

    }
}

public class CollectionFramework {

    public static void main(String[] args) {
        Collectionn a = new Collectionn();
        a.basicMethod();
        System.out.println("---");
        Stackk s = new Stackk();
        s.basicMethod();
        
    }
}