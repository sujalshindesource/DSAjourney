import java.util.Scanner;

public class learn {

    // static int add(int a , int b){
    //     return a+b;
    // }
    // static int add (int a , int b , int c){
    //     return a+b+c;
    // }
    // static int a = 10;
    public static void main(String[] args) {

        // int arr[] ;
        // arr = new int[3];
        // int brr[]={1,2,3};

        Scanner sc = new Scanner(System.in);

        // for(int i=0;i<3;i++){
        //     arr[i] = sc.nextInt();
        // }
        // for (int val : arr){
        //     System.out.println(val);
        // }

        // int sum = 0;
        // for(int val : brr){
        //     sum = sum + val;
        // }
        // System.out.println(sum);

        // int max = brr[0];
        // for(int val : brr){
        //     if (val < max) {
        //         max = val;
        //     }
        // }
        // System.out.println("min no is : "+max);

        System.out.println("enter you  name : ");
        String a = sc.next();

        System.out.println("enter the full name : ");
        String b = sc.nextLine();

        System.out.println(" name : " + a);
        System.out.println("full name : "+b);

        // [ == ] = compares the memory location not by value ; 
        // [ .equals ] = compare the values :
        // [ .equalsIgnoreCase() ] = ignore case sensitivity 
    }
}
