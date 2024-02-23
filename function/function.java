//function is stored in call stack
import java.util.*;
public class function{
    public static void printhelloworld(){
        System.out.println("hello world!");}

        //inputs in function is called parameters
        public static int calculatesum(int a ,int b){//parameters or formal parameters(don't have values)
           int sum = a + b;
           return sum;
        }
        //copy of values from main function is given to the function as parameters
        public static void swap(int a,int b){
            int temp = a;
            a = b;
            b = temp;
            System.out.println("a:" + a);
            System.out.println("b:" + b);

        }
        public static int product(int a,int b){
            int product = a * b;
            return product;
        }
        public static int factorial(int n){
            int fact = 1;
            
            for(int i=1;i<=n;i++)
        {
            fact = fact * i;

        }
        return fact;
        }public static int binCoff(int n,int r)
        {
            int bincoff = (factorial(n))/((factorial(r)) * factorial(n-r));
             System.out.println(bincoff);
             return bincoff;

        }

        public static boolean Isprime(int n)
        {
         
            //corner cases
            //2
            if (n == 2){
                return true;
            }
            boolean Isprime = true;
            for(int i = 2;i <= n-1;i++)
            {
                if(n % 2 == 0)
                {
                 Isprime = false;
                
                }
              
            }
            return Isprime;
            
           
        }

        //check prime (optimized)
        public static boolean isprime(int n)
        {
            if (n == 2){
                return true;
            }
            for(int i=2;i<=Math.sqrt(n);i++){
                if ( n % i == 0)
                {
                    return false;
                }
            }
            return true;
        }

        //primes in range
        public static void primerange(int n){
            for(int i=2;i<=n;i++){
                if (isprime(i)){
                    System.out.print(i  + " " );
                  
                }
            }
            System.out.println();
        }

        public static void bindec(int n)
        {
            int mynum = n;
            int pow = 0;
            int dec = 0;
            while(n>0){
            int lastdigit = n % 10;
            dec = dec + lastdigit * (int) Math.pow(2,pow);
            pow++;
            n = n / 10;
            }
            System.out.println("decimal of " + mynum + " = " + dec);
        }

        public static void decbin(int n)
        {
            int mynum = n;
            int pow = 0 ;
            int bin = 0;
            while(n>0){
                int rem = n % 2;
                bin = bin + rem * (int)Math.pow(10,pow);
                pow++;
                n = n / 2;

            }
            System.out.println("binary of " + mynum + " = " + bin);
        }

        public static void Average(double a,double b ,double c)
        {
            double avg = (a + b + c)/3;
             System.out.println("the average of the numbers is " + avg);
          
        }
        
   
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        // printhelloworld(); 
        // int a=sc.nextInt();
        // int b=sc.nextInt();
        // //numbers is passed in function
        // //both sum is different because it comes under different scope
        // int sum = calculatesum(a,b);//arguments or actual parameters(have values)
        // System.out.println("sum is:" + sum);

        // int a = 5;
        // int b = 10;
        // swap(a,b);
        // //if we write printing logic here then a and b won't swap because in call by value we pass the copy of original values so its swapping logic will be upto swap function and not in main (in call by value changes in function doesn't affect main)

        // //java always call by value

        // int a = 2;
        // int b = 6;
        // int prod =product(a,b);
        //  System.out.println( "product : " + prod);
        //  prod = product(10,20);
        //   System.out.println( "product : " + prod);

    
        
        //  System.out.println(factorial(7));

        // System.out.println("enter the value of n");
        // int n = sc.nextInt();
        // System.out.println("enter the value of r");
        // int r = sc.nextInt();
        // binCoff(n,r);


        // System.out.println("enter a number");
        //     int n = sc.nextInt();
        // System.out.println(Isprime(n));

        // int n = sc.nextInt();
        // primerange(n);

        // int n = sc.nextInt();
        // bindec(n);
        System.out.println("enter first number");
        double a = sc.nextDouble();
        System.out.println("enter second number");
        double b = sc.nextDouble();
        System.out.println("enter third numnber");
        double c = sc.nextDouble();
        Average(a,b,c);

        sc.close();

 }


}
