import java.util.Scanner;

public class pattern {
        public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                System.out.println("enter the r : ");
                int n = sc.nextInt();
                // System.out.println("enter the col : ");
               // int col = sc.nextInt();





        //        for(int i=1;i<=n;i++){
        //         for(int j=1;j<=n-i ; j++){
        //                 System.out.print(" ");
        //         }
        //         for(int j=0;j<2*i-1;j++){
        //                 System.out.print(i);
        //         }
        //         System.out.println();
        // }
// enter the r : 
// 5
//     1
//    222
//   33333
//  4444444
// 555555555



                // int l=1;
                // for(int i = 0 ; i<n;i++){
                //         for(int j =0;j<(n-l) ; j++){
                //                 System.out.print(" ");
                //         }
                //         for(int j=1;j<=i+1;j++){
                //                 System.out.print(j);
                //         }
                //         for(int j =i;j>=1;j--){

                //                 System.out.print(j);
                //         }
                //         System.out.println();
                //         l++;
                // }
//             enter the r : 
// 4
//    1
//   121
//  12321
// 1234321    

                // int l = 65 + n;
                // for(int i=1;i<=n;i++){
                //         for(int j=1;j<=i;j++){
                //                 System.out.print(" " + (char)(l - j));
                //         }
                //         System.out.println();
                // }
// enter the r : 
// 5
//  E
//  E D
//  E D C
//  E D C B
//  E D C B A

                // for(int i=1;i<=n;i++){
                //         for(int j=1;j<=i;j++){
                //                 System.out.print(" " + (char)(64 + j));
                //         }
                //         System.out.println();
                // }
// enter the r : 
// 5
//  A
//  A B
//  A B C
//  A B C D
//  A B C D E

                // int x =1;
                // for(int i = 1 ; i<=n ; i++){
                //         for(int j =1 ; j<=i ; j++){
                //                 System.out.print(" "+x);
                //                 x++;
                //         }
                //         System.out.println();
                // }
// enter the r : 
// 5
//  1
//  2 3
//  4 5 6
//  7 8 9 10



                // for(int i = 1 ; i<= n ; i++){
                //         for(int j = 1 ; j<=i ; j++){
                //                 System.out.print(""+j);
                //         }
                //         System.out.println();
                // }
// enter the r : 
// 5
// 1
// 12
// 123
// 1234
// 12345


                // for space n - l
                // for stars tow + l
                // total colums (n-l) + (row +l)

                // int l = 1;
                // for (int i = 0; i < n; i++) {
                //         for (int j = 0; j < n - l; j++) {
                //                 System.out.print(" ");
                //         }
                //         for (int j = 0; j < i + l; j++) {
                //                 System.out.print("*");
                //         }
                //         l++;
                //         System.out.println();
                //         if (i == n - 1) {
                //                 for (int j = 0; j < n - l; j++) {
                //                         System.out.print(" ");
                //                 }
                //                 for (int j = 0; j < i + l; j++) {
                //                         System.out.print("*");
                //                 }
                //         }
                // }

                // for (int i = n; i < n; i++) {
                //         for (int j = 0; j < n - l; j++) {
                //                 System.out.print(" ");
                //         }
                //         for (int j = 0; j < i + l; j++) {
                //                 System.out.print("*");
                //         }
                //         l++;
                //         System.out.println();
                // }
//         enter the r : 
// 5
//     *
//    ***
//   *****
//  *******
// *********
// **********
        


                // int l =1;
                // for(int i =0 ; i<n;i++){
                // for(int j =0 ; j < n-l ; j++){
                // System.out.print(" ");
                // }
                // for(int j =0 ; j <(i+l);j++){
                // if(j == 0 || j == (i+l)-1 || i == n-1){
                // System.out.print("*");
                // }
                // else{
                // System.out.print(" ");
                // }
                // }
                // l++;
                // System.out.println();
                // }
                // enter the r :
                // 5
                // *
                // * *
                // * *
                // * *
                // *********
                // for(int i =0 ; i<n ; i++){
                // for(int j =0 ; j <= i;j++){
                // if(j == 0 || j == i || i == n-1){
                // System.out.print("*");
                // }
                // else{
                // System.out.print(" ");
                // }
                // }
                // System.out.println();
                // }
                // enter the r :
                // 5
                // *
                // **
                // * *
                // * *
                // *****

                // for(int i =0 ; i<n;i++){
                // for(int j=1 ; j<=6;j++){
                // if(j ==1 || j == 6 || i == 0 || i == n-1 ){
                // System.out.print(" *");
                // }
                // else{
                // System.out.print(" ");
                // }
                // }
                // System.out.println();
                // }
                // enter the r :
                // 4
                // * * * * * *
                // * *
                // * *
                // * * * * * *

                // int l =1 ;
                // for(int i =0 ; i <n ; i++){
                // for(int j = 0 ; j < i ; j++){
                // System.out.print(" ");
                // }

                // for(int j = 0 ; j < ((n-i) + (n-l)) ; j++){
                // System.out.print("*");
                // }
                // l++;
                // System.out.println();
                // }
                // enter the r :
                // 5
                // *********,
                // *******
                // *****
                // ***
                // *

                // int l = 1;
                // for (int i = 0; i < n; i++) {
                // for (int j = 1; j <= (n - i); j++) {
                // if (j == (n - i)) {
                // for (int m = 0; m < (i + l); m++) {
                // System.out.print("*");
                // }
                // }
                // System.out.print(" ");
                // }
                // System.out.println();
                // l++;
                // }

                // for (int i = 0; i < n; i++) {
                // for (int j = 1; j <= (n - i); j++) {
                // System.out.print(" ");
                // }
                // for (int m = 0; m < (i + l); m++) {
                // System.out.print("*");
                // }
                // System.out.println();
                // l++;
                // }
                // enter the r :
                // 5
                // *
                // ***
                // *****
                // *******
                // *********

                // for(int i =0 ; i < n ; i ++){
                // for(int j =0 ; j < (n - i); j++){
                // System.out.print(" *");
                // }
                // System.out.println();
                // }
                // enter the r :
                // 5
                // * * * * *
                // * * * *
                // * * *
                // * *
                // *
                // int scol = 0;
                // for(int i =1 ; i <= r ; i++){
                // scol = col + (r-i);
                // for(int j = 1 ; j <= scol ; j++){
                // if(j <= (r-i) ){
                // System.out.print(" ");
                // }
                // else{
                // System.out.print("*");
                // }
                // }
                // System.out.println();
                // }
                // enter the r :
                // 5
                // enter the col :
                // 5
                // *****
                // *****
                // *****
                // *****
                // *****

                // for(int i =0 ; i < s ; i++){
                // for(int j =0 ; j <= i ; j++){
                // if( j == 0 || j == i || i == (s-1)){
                // System.out.print("*");
                // }
                // else{
                // System.out.print(" ");
                // }
                // }
                // System.out.println();
                // }
                // enter the s :
                // 8
                // *
                // **
                // * *
                // * *
                // * *
                // * *
                // * *
                // ********

                // for(int i = 0 ; i < s ; i++){
                // for(int j = 0 ; j <= i ; j++){
                // System.out.print(" *");
                // }
                // System.out.println();
                // }
                // enter the s :
                // 10
                // *
                // * *
                // * * *
                // * * * *
                // * * * * *
                // * * * * * *
                // * * * * * * *
                // * * * * * * * *
                // * * * * * * * * *
                // * * * * * * * * * *

                // System.out.println("enter the row : ");
                // int row = sc.nextInt();
                // int j ;
                // int i;
                // for (i = 0; i < row; i++) {
                // for (j = 0; j < col; j++) {
                // System.out.print(" *");
                // }
                // System.out.println();
                // }
                // sc.close();

                // enter the col :
                // 8
                // enter the row :
                // 4
                // * * * * * * * *
                // * * * * * * * *
                // * * * * * * * *
                // * * * * * * * *

                sc.close();

        }
}