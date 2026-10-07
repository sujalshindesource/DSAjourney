/// Collectio -- > List , Queue ,  Set 
/// List --> ArrayList , LinkedList , 
/// Qeu --> Dqueu 
/// Set --> Hashset , LinkedHashSet , SortedSet 
/// Map --> SortedMap , Iterator --> ListIterator 
/// completes whole collection framwork exept the comparable method in priority qeue 


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

class ArrayDqueuee{

    // same as mention in queue interface
}

class PriorityQueuee{
    void BasicMethod(){
        Queue<Integer> q = new PriorityQeue<>();
        // deafult beahavior for integer 
        //  min/less value has hgiher priority 
        // to change this we need to define the coparable beahvior 
        Queue<Integer> q2 = new PriorityQeue<>((a,b)->b=a);
        // now in this queue here we the higher value has higher priority 
        // for string and the other s\ we ahve to defien the comparable logic
        
    }
}
// from herer ethe set interfaece starts 
// Set Interface 
//Set -- > EnumSet , Hashset , linkedhashset , TreeSet ...

// HashSet   : O(1)
// LinkedHashSet : O(n);
// Tree set BSt : O(log n)

// for the object hsah u have to override the equalstostring method hashcode 
class Sett{
    void basicMethod(){
        Set<Integer> st = new HashSet<>();
        Set<Integer> s = new HashSet<>();
        st.add(10);
        st.add(12);
        st.add(11);
        s.add(10);
        s.add(11);
        s.add(12);
        
        // Set
        // set does not preservee the order , index
        // allows all other basic method 

        // retainAll() : stores the only intersection element between teh two  set 
        st.retainAll(s);

        // containAll()  : cheack wheather the one set elemetn persent in anotehr set 
        // and other things woek neatly execpt hashset 
        
    }
}

// Map Interace 
// in java element  of map are stored in key:value pair 
// keys are unqiue values associted with individual values
// a map cannot contain duplicate keys and each key asscocited wiith a single  value 

// Collection --- > Map
// Map ---> HashMap , TreeMap , EnumMap , LinkedHashMap , weackHashMap

// NO duplicate Kyes 
// Order maintained 
class Mapp{
    void basicMethod(){
        Map<String , Integer> m = new Map<>();
        m.put("IN",90); // key value is added  
        m.put("IN",95); // but if try to put it agin with same kye it just update teh vlaue 
        System.out.println(m);
        // m.putAll(valuessss ....) too add another mapp innto this
        // + otherr some baic method 
        m.putIfAbsent("Us",95); // puts onmly if the pair in unaviable 
        m.get("IN"); // with key we can get the pair
        m.getOrDefault("Us","None"); // try to get value if not aval then returhn the default value 
        m.cotainKey("In");
        m.containValue("");
        m.replace("IN","Indontia"); // replace teh value of  in with given value
        // m.replace(K , oldval , newval);
        Set<String> s = m.keySet(); // retrun the all keys 
        // m.values(); reurn all value 
        m.entrySet(); // rerutn whole set 

        // Now the interate through teh obj 
        // we have teh Iterator 
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
