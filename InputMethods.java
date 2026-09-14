
// import java.io.BufferedReader;
// import java.io.IOException;
// import java.io.InputStream;
import java.util.Scanner;

public class InputMethods {
    public static void main(String[] args){
        System.out.println("enter the number : ");
        int n =0;
        //Method 1 : 

        //  n = System.in.read(); 
        // System.out.println(n);

        // taken one input at a time 
        // returns the ACLL value of the input ..

        //Method 2 : 

        // InputStream in = new InputStream(System.in);
        // BufferedReader bf = new BufferedReader(in);
        // n = Integer.parseInt(bf.readLine());
        // System.out.println(n);
        // bf.close();

        // bf can take input from anywhere from files keyboard etc
        // bf is resource should be close after use ..

        //Method 3 :L 
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        System.out.println(n);
        sc.close();
    }

    
}
