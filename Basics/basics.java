import java.util.*;

public class basics{
    public static void main(String args[]){
        // System.out.println("* * * *");
        // System.out.println("* * *");
        // System.out.println("* *");
        // System.out.println("* ");


        // int a=10;
        // int b=5;
        // System.out.println(a);
        // System.out.println(b);


        // String name="tony stark";
        // System.out.println(name);


        // byte b=8;
        // System.out.println(b);
        // char ch='a';
        // System.out.println(ch);
        // boolean var=true;
        // float price = 10.56f;             
        // System.out.println(price);
        // int number=25;
    //    double price=1.1;
    //    System.out.println(price);



//     int a=2;
//     int b=3;
//    int  sum=a+b;
//    int product=a*b;
//     System.out.println(sum);
//     System.out.println(product);



         Scanner sc= new Scanner(System.in);
    //    String input= sc.next();
    //    System.out.println(input);

    //    String name=sc.nextLine();
    //    System.out.println(name);

    //    int number=sc.nextInt();
    //    System.out.println(number);

    //    float price = sc.nextFloat();
    //    System.out.println(price);



    // System.out.println("enter two numbers");
    //    int a=sc.nextInt();
    //    int b=sc.nextInt();
    //    int sum=a+b;
    //    System.out.println(sum);


    // System.out.println("enter the radius");
    // float rad=sc.nextFloat();
    // float area = 3.14f*rad*rad;
    // System.out.println(area);



    //type casting

    // float a=25.99f;
    
//     int c=(int)a;
//     System.out.println(c);




    //ascii value
//    char a='a';
    
//     int c=(int)a;
//     System.out.println(c);



//type promotion
// char a='a';
// short b='b';
// System.out.println((int)(b));
// System.out.println((int)(a));
// System.out.println(b-a);


// short a=99;
// char c=a;
// System.out.println(c);


//binary operator
// int a=2;
// int b=4;
// System.out.println(a+b);

//unary operator
// int a=2;
// //preunary operator
// int b=++a;
// System.out.println(a);
// System.out.println(b)
// ;


// int a=2;
// //postunary operator
// int b=a++;
// System.out.println(a);
// System.out.println(b)
// ;

//relational operator
// int a=4;
// int b=7;
// int c=4;
// System.out.println(a==b);
// System.out.println(a==c);

//logical operator
// System.out.println(3>2 && 2>0);
// System.out.println(3>2 && 0>2);
// System.out.println(3>2 || 0>2);
// System.out.println(!(3>2));

//assignment operator
// int A = 2;
// // A = A + 2;
// A+=2;
// System.out.println(A);


//while loop
// int count=0;
// while(count<100)
// {
//     System.out.println("hello world");
//     count++;
// }
// System.out.println("printed hello world 100 times");


//print numbers from 1 to 10
// int number=1;
// while(number<=10)
// {
//     System.out.println(number);
//     number++;
// }


//print sum of n numbers
// System.out.println("enter the value of i");
// int n=sc.nextInt();
// int i=1;
// int sum=0;
// while(i<=n)
// {
//     sum+=i;
  
//     i++;
// }
//   System.out.println("sum is " + sum);


//for loop
// int i;
// for(i=0;i<=4;i++)
// {
//       System.out.println("hello world");
// }


//print square pattern
// for(int line=1;line<=4;line++)
// {
//       System.out.println("* * * *" );
// }


// print reverse of the number
//   System.out.println("enter a number");
// int n=sc.nextInt();
// while(n>0)
// {
//     int lastdigit = n % 10;
//       System.out.print(lastdigit + " ");
//     n = n / 10;
// }


//reverse of given number
//   System.out.println("enter a number");
//   int n=sc.nextInt();
//   int reverse=0;
//   while(n>0)
//   {
//     int lastdigit = n % 10;
//     n = n / 10;
//     reverse = reverse * 10 +lastdigit;
//   }
//   System.out.print( reverse + " " );


//do while loop
// int counter=0;
// do{
//     System.out.println("hello world");
//     counter++;
// }
// while(counter<0);


//break statement
// for(int i=1;i< 10;i++)
// {
// if(i==3)
// {
//     break;
// }

// System.out.println(i);
// }
// System.out.println("i is out of the loop");


//break keyword
// do{
//     System.out.println("enter a number");
//     int n=sc.nextInt();
//     if(n % 10 == 0)
//     {
//         break;
//     }
//     System.out.println(n + " ");
// } while(true);


//continue statement
// do{
//      System.out.println("enter a number");
//      int n=sc.nextInt();
//      if(n % 10 == 0)
//      {
//         continue;
//      }
//      System.out.println(n + " ");
//      }
//      while(true);

// for(int i=1;i<=5;i++)
// {
//     if(i==3)
//     {
//         continue;
//     }
//     System.out.println(i);
// }



//prime or not
// System.out.println("enter a number");
// int n=sc.nextInt();
// if( n == 2)
// {
//     System.out.println( n + " is prime");
// }
// else{
// boolean isprime = true;
// for(int i=2;i<=n-1;i++)
// for(int i=2;i<=Math.sqrt(n);i++)
// {
//     if(n % i ==0)
//     {
//         isprime = false;
//     }
    
   
// }
// if(isprime == true)
// {
//     System.out.println( n + " is a prime number ");
// }
// else
// {
//     System.out.println( n + " is not a prime number ");
    
// }
// }


//printing a right triangle star pattern
// for(int line=1;line<=4;line++)
// {
//     for(int star=1;star<=line;star++)
//     {
//         System.out.print( " * ");
//     }
//     System.out.println();  //next line
    
// }


//inverted star pattern
// System.out.println("enter the number of lines");
// int n = sc.nextInt();
// for(int line=1;line<=n;line++)
// {
//     for(int star=1;star<(n-line+1);star++)
//     {
//         System.out.print(" * ");
//     }
//     System.out.println();
// }


//Half Pyramid Pattern(printing numbers)
// System.out.println("enter number of lines");
// int n = sc.nextInt();
// for(int line=1;line<=n;line++)
// {
//     for(int num=1;num<=line;num++)
//     {
        
//         System.out.print( num );
        
        
//     }
//     System.out.println();
    
// }


int n=4;
char chars = 'A';
for(int line=1;line<=n;line++)
{
    for(int ch=1;ch<=line;ch++)
    {
        System.out.print(chars);
        chars++;
    }
    System.out.println();

    sc.close();
}





    
    


       


    }
}