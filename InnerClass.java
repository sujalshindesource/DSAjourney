// # inner class + anonymous inner class

class A{
    public void show(){

    }
    public class B {
        public void config(){
        System.out.println("hey from B");
        }
    }

    public static class C{
        public  void show(){
            System.out.println("hey form C");
        }
    }
    
}
// so herer B is part of A 
// rest of it is in main()


// anonymous class
class Anon{
    public void show(){
                System.out.println("hey there anon class");
            }
};

abstract class Ab {
    abstract public void show();
}





public class InnerClass {
    public static void main(String[] args) {
        // how to create ofbj of B
        A obj = new A();
        A.B obj1 = obj.new B();
        // even i fill what the hell syntax... so this is it 
        obj1.config();

        // we need object of class A to create the Obj of class B
        // unless its a static class ..
        // as we know the static things are belong to the class right .. 
        // so if we declare the class static then its obj can be created without his outer class obj creation

        A.C o = new A.C(); // and done bro we got the obj
        o.show();


        // Anonymsu class / unknnown class
        // what if while creating the obj we also want to define the class defination
        // every time we want to override the method we need another class that extends it then override the method
        // instead we can use this and override method as we want 
        Anon an = new Anon(){
            @Override 
            public void show(){
                System.out.println("hey there anon n class");
            }
        };
        an.show();
        /// this is it we can define the class while declaring it crazy though
        /// 
        /// Crazy part is we can even create the obj of the abstract class using this 
        /// which is normally not psbl we have to create the class and the overide/define the method;
        Ab abs = new Ab() {
            public void show(){
                System.out.println("hey there from Ab class using anonymous class method ");
            }
        };
    }
}
