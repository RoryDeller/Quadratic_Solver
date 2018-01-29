import java.util.Scanner;       //This program is incomplete

 class Main {
     private static int a;
     private static int b;
     private static int c;
     private static boolean solvable;
     private int x1;
     private int x2;

     public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         System.out.println("Enter your quadratic in the form ax^2+bx+c=0 by only typing letters A B C");
         System.out.println("Type A");
         a = input.nextInt();
         System.out.println("Type B");
         b = input.nextInt();
         System.out.println("Type C");
         c = input.nextInt();
         discriminant(a, b, c);

         if(solvable = false){
             System.out.println("There are no existing solutions");
         } else{
             int x1 = -b+
         }
     }

     public static boolean discriminant(int a, int b, int c) {
       int discrim = (b*b) - 4*a*c;
       if (discrim >=1 ){
           return solvable = true;
       } else{
           return solvable = false;
       }

     }
 }