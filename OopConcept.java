// Method overloading + Array of objects + for each + Encaspulation + this + static + static block
// Every method has a stack ok .. 

 class Cal{
    public int a =0;

    static {
        var = 1;
        System.out.println("static block callaed : ");

        // static block calls only once when the falss is loaded 
        // static block calls first before construcotr becuse class loasds forst thjemn objects are created 
        // JVM has specials place caleed class loader where all loaded class are .. 
    }


    // so here the static var belongs to the class
    // it can be accessed without creating the obj 
    //  i f  chagnes the value using one obj it changes for the all the objects as it belong to the class
    // thats why the main method is static can access wthout creating of obj of main class
    static int var = 1;
    // this : 
    public Cal(){
        // here this is used to point to the current class 
        // in case the parameter is same name as class var so wwe can say this.a = a; so no one get confused :
        this.a=1;

    }


        // Polymarization , method overloading 
        //method with same name but with different signature or parameters or return type
        public int add(int a  , int b){
            return a+b;
        }
        public int add(int a  , int b , int c){
            return a+b+c;
        }
        public double add(int a  , int b , int c , int d){
            return a+b+c+d;
        }
    }


public class OopConcept {
    public static void main(String[] args) {
        Cal cal =  new Cal();
        // Accessing all the methods showing method overlaoding 
        System.out.println(cal.add(2, 2));
        System.out.println(cal.add(5, 5, 5));
        System.out.println(cal.add(10, 10, 10, 10));

        // Cal cal2[] = new Cal[5];
        // cal2[0].a=1;
        // cal2[1].a=2;
        // cal2[2].a=3;
// Introducing the  For each in Java to you :: idk why its not working after this 
        // for(Cal c : cal2){
        //     System.out.println(c);
        // }

        //Encaspulation : 
        // here we simply declare teh var private so that only mathods can acces them adn no one else
        // greate example of Encspulation is A ATM machine we want money but dont knwo how it works behinde

        

    }
}
