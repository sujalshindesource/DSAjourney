// Name convention + final + object class + Abstract + Wrapper Class

import javax.swing.event.InternalFrameAdapter;

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

        
    }
}
