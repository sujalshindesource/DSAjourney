// Name convention + final + object class + Abstract + Wrapper Class + Interface + enum + Annotation + Lambda expression + exception

import java.io.ObjectInputFilter.Status;

class A{
    public int  a =0 ;
    public  void show(){
        System.out.println("hey from A");
    }
}

// #abstract 

// we cannot create the class of the abstract class
// abstract methos belong to only abstract clsass
// 
abstract class Car{
    public abstract void drive();
    // here we are saying look i dont know how to drive but who evver extends / inherits me must define how to drive ok

}
class B extends Car{
    public void drive(){
        // here i am inherting also defining how to drive bro
    }
    // if i dont want to define the drive then i must also declare as abstract class 
    // so that people aslo cant create obj of me too and who ever inheirts me must define the method

}

// # Interface
// ever wonder why we declarre class abstract it has everything undefine so insted there is special thingg to handle java
/// known as Interface 
/// interface only have abstract method
/// all are by default is public abstract
/// we cannot create obj of interface ofcourse
/// we dont extend the interface we inpmlement
/// all the variable in interface are final and static bro

interface I{
    void show();
}
class Inter implements I{
    public void show(){};
}

/// and here interface can implemetn number of interface showcasing the multiple inheritance which is not happen in class in jaava
/// even interface can extend other interface too
/// class extends class 
/// class implements interface
/// interfaec extends interface
/// 
/// # types of interface 
/// 1 normal interface : which has more than 2 methos 
/// 2 fn interface :  only has one method 
/// 4 marker : blank interface 


// # enum 
// enum is like a fiel can hold number of things based on the situation so enum helps here hold them as a array 
enum status {
Alive , Dead , HalfDead , Atma ;
    // now status can be anything out of this 
    // but one at a time 
    // enum objects are constant ok
    // enum is a class but cannot be extend by anyone 
    // rest of this in main
}

// # Annotation
// when we want to provide or tell the compiler somthing we use this annotation 
class Here{
    /// @Override :  tells that the method must be override now 
    /// @deprecated : tells i can use this method but prefer other alternatives
    /// and there are lot of it figure it oout if u want 
    
}

public class SomeBasics {
    public static void main(String[] args) {
        // Class : Nano  , Sharvary , Pranav 
        // var method :  murkh , var  , show() , showMyMarks()
        //Constant : PIE , BRAND , KILL

        // also t
        // Anonymous OBJ 
        new A(); // obj created but 
        // even can call directly .. 
        new A().show();

        // # final 
        final int PIE = 0;
        // it means that the PIE is constand cant chagne throughout the prg 
        // if we declare a class final then no one can inherit the claass 
        // if  we declare the fn final then no one can override the fn
        final class A{
            final void show (){}
        }
        // class b extends A{
        //     // uncomment this the error will be shown cuase the A class is declared final 
        //     @Override 
        //     void show(){
        //         // here we are unable to override the shoow method 
        //     }
        // }

        // # object class
        System.out.println(Object.class.getName());
        // and there are lot of methods object class provides so figure that out if u want 


        // # Wrappe Class 
        // for every premetive datatype we have the Wrapper class for it 
        Integer a = 0; // boxing into Integer class that can hold integer 

        int n  = a.intValue(); // called as unboxing simply geting value from it Integer  --> int 
        // one special thing we can do with the help of wrapper classs is tha we can covert the data types
        // like : ..
        String s = "1";
        int sint = Integer.parseInt(s); // now this well conver s into integer that will be stored in sint 
        // thats all u can discover more classes like that if u want 

        // # enum
        int i = 5;
        status st = status.Alive; //now st is alive 
        // i told its like array tight then how to get the array index of current there methods too 
        System.out.println("herre is the index of current status : " + st.ordinal());


        // Lambda expression 
        /// A obj = new A(){
        /// }  this is too obvious  
        /// so java says wait here is the shortcut 
        /// 
        /// but the thing is it only works with the fn interface not normally 
        // A obj1 = () -> {
        // };

        ///
        ///  # Exception
        /// types : 
        /// 1 compile time  2 . run time  3.Logical error
        /// so to handle it u can use try catch also us can define ladder of catch 
        
        try{
            // rsiky commands
            // # Throw : throws exception to whos calling  them 
        // when we want to throw exception explicitelty then use throw 
        
            throw new ArithmeticException();
        }catch(Exception e ){}
        
        // we can even create our own exception here
        class e extends Exception{
        }

    }
}
