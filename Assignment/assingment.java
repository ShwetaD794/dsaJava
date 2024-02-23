
public class assingment{
     public static void rhombus(int n){
            for(int i=1;i<=n;i++){
              for(int j=1;j<=(n-i);j++){
                System.out.print(" ");
              }
              for(int j=1;j<=n;j++ ){
                System.out.print("*");
              
              System.out.println();
            }
          }
     }
    public static void main(String args[]){
        rhombus(4);
        
    }
}
//         Scanner sc=new Scanner(System.in);
        // String name=sc.nextLine();
        // System.out.println(name);

        //assigment 1
    //     System.out.println("enter three numbers");
    //     float a=sc.nextFloat();
    //     float b=sc.nextFloat();
    //     float c=sc.nextFloat();
    //   float avg=(a+b+c)/3;
    //     System.out.println("Average is "+ avg);


        //assignment 2
        // System.out.println("enter the side");
        // float side=sc.nextFloat();
        // float area=side*side;
        // System.out.println("area is " + area);
        

        //assignment 3
        // System.out.println("enter the price of pen");
        // float pen=sc.nextFloat();
        // System.out.println("enter the price of pencil");
        // float pencil=sc.nextFloat();
        // System.out.println("enter the price of eraser");
        // float eraser=sc.nextFloat();
        // float total=pen + pencil + eraser;
        // System.out.println("total amount is" + total);
        // System.out.println("with 18% GST");
        // float GST = (total*18)/100;
        // System.out.println("final amount is" + GST);

        //assignment 5

        // int $=9;


        
        //lectue 2
        //assignment 1
        // int x=2,y=5;
        // int exp1=(x*y/x);
        // int exp2=(x*(y/x));
        // System.out.println(exp1 + " , " + exp2);
     

        //assignment 2
        // int x=200, y=50, z=100;
        // if(x>y && y>z)
        // {
        //     System.out.println("hello");
        // }
        // if( z>y && z<x)
        // {
        //     System.out.println("java");
        // }
        // if((y+200) < x && (y+150) <z)
        // {
        //     System.out.println("hello java");
        // }

        //assignment 3
        // int x,y,z;
        // x = y = z =2;
        // x += y;
        // y -=z;
        // z /= (x+y);
        // System.out.println(x + " , " + y + " , " + z);

        //assignment 4
        // int x=9, y=12;
        // int a=2,b=4,c=6;
        // int exp = 4/3 * (x+34) + 9 * (a+b*c) + (3+y*(2+a)) /(a+b*y);
        // System.out.println(exp);

        //assignment 5
        // int x=10 ,y=5;
        // int exp1=(y*(x/y + x/y));
        // int exp2=(y*x/y +y*x/y);
        // System.out.println(exp1);
        // System.out.println(exp2);



        //lecture 3
        //assignment 1
        //  System.out.println("enter a number");
        //  int num=sc.nextInt();
        //  if(num>0)
        //  {
        //      System.out.println("number is positive");
        //  }
        //  else{
        //      System.out.println("numnber is negative");
        //  }


        //assignment 2
        // double temp=103.5;
        // if(temp>100)
        // {
        //      System.out.println("You have a fever");
        // }
        // else 
        // {
        //      System.out.println("You don't have a fever");
        // }


        //assignment 3
        //  System.out.println("enter a number of week from 1-7");
        //  int num=sc.nextInt();
        //  switch(num)
        //  {
        //     case 1: System.out.println("monday");
        //             break;
        //     case 2: System.out.println("tuesday");
        //             break;
        //     case 3: System.out.println("wednesday");
        //             break;
        //     case 4: System.out.println("thursday");
        //             break;
        //     case 5: System.out.println("friday");
        //             break;
        //     case 6: System.out.println("saturday");
        //             break;
        //     case 7: System.out.println("sunday");
        //             break;
        //     default: System.out.println("invalid input! enter a number from 1-7");        
        //  }
        


        //assignment 4
        // int a=63, b=36;
        // boolean x=(a<b) ? true : false;
        // int y = (a>b) ? a : b;
        //  System.out.println(x);
        //   System.out.println(y);


        //assignment 5
        //  System.out.println("enter year:");
        //  int year=sc.nextInt();
        // boolean x = (year % 4) == 0;
        // boolean y = (year % 100) != 0;
        // boolean z = ((year % 100==0) && (year % 400 ==0));                                                                                                                                                     
        // if(x && (y || z))
        // {
        //   System.out.println( year + " this is a leap year ");
        // }
        // else{
        //      System.out.println(year + " this is not a leap year ");
        // }
        // }



        //lecture 3
        //assignment 1
        // for( int i=0;i<5;i++)
        // {
        //     System.out.println("Hello");
        //     i += 2;
        // }

        //question 2
    //     System.out.println("enter a number");
    //     int number=sc.nextInt();
    //     int choice;
    //     int sumeven =0;
    //     int sumodd =0;
    //     do{
    //         if(number % 2 == 0)
    //         {
    //             sumeven += number;
    //         }else{
    //             sumodd += number;
    //         }
    //         System.out.println("do you want to continue? press 1 to continue and 0 to not");
    //         choice=sc.nextInt();
    //     }while(choice == 1);
        
    //         System.out.println("sum of even numbers: " + sumeven);
    //         System.out.println(" sum of odd numbers: " + sumodd);
    // }


  //Question 3
//   System.out.println("enter a number");
//   int n=sc.nextInt();
//   int fact = 1;
//   for(int i=1;i<=n;i++)
//   {
//     fact *= i;
//   }
//   System.out.println("factorial of the number is " + fact);


//Question 4
// System.out.println("enter a number");
// int n=sc.nextInt();
// for(int i=1;i<=10;i++)
// {
// System.out.println(n + "*" + i + "=" + n*i);
// }



//inverted half pyramid

// for(int i=5;i>=1;i--)
// {
//     for(int j=1;j<=i;j++)
//     {
//         System.out.print(j);
//     }
//     System.out.println();
// }


//FLOYD'S triangle
// int num = 1;
// for(int i=1;i<=5;i++)
// {
//     for(int j=1;j<=i;j++)
//     {
//         System.out.print( num + " " );
//         num++;
//     }
//     System.out.println();
// }


//0-1 triangle
// for(int i=1;i<=5;i++)//no.of lines
// {
//     for(int j=1;j<=i;j++)
//     {
//         if((i+j)%2 == 0)
//         {
//             System.out.print(1 + " ");
//         }else{
//             System.out.print(0 + " ");
//         }
       
//     }
//     System.out.println();
// }






//     }

//     }


// import java.util.*;
// public class assingment{
//     public static void Average(double a,double b ,double c)
//         {
//             double avg = (a + b + c)/3;
//              System.out.println("the average of the numbers is " + avg);
          
//         }
//         public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         System.out.println("enter first number");
//         double a = sc.nextDouble();
//         System.out.println("enter second number");
//         double b = sc.nextDouble();
//         System.out.println("enter third numnber");
//         double c = sc.nextDouble();
//         Average(a,b,c);
//         }
// }

// import java.util.*;
// public class assingment{
    
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         System.out.println("enter a number");
//         int n = sc.nextInt();
//         if(IsEven(n)){
//             System.out.println("number is even");
//         }else{
//             System.out.println("number is odd");
//         }
//     }
// public static boolean IsEven(int n){
     
//         if(n % 2 == 0){
//            return true;
//     }else{
//         return false;
//     }
//     }
        
    
//     }
