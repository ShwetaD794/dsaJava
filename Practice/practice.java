// import java.util.*;
// public class practice{
//     public static void main(String args[]){
//         Scanner sc= new Scanner(System.in);
    // int a=2;
      // int b=1;
      // System.out.println(a>=b && a==b);

      // int a=2, b=4;
      // int c=(a+b*a-b/a%b);
      // System.out.println(c);


      //swapping of two nos.

      // System.out.println("enter value of two numbers");
      // float a=sc.nextFloat();
      // float b=sc.nextFloat();
      // float t=a;
      // a=b;
      // b=t;
      // System.out.println("a=" + a);
      // System.out.println("b=" + b);


      //adding two strings
      // System.out.println("enter a string1");
      // String a=sc.nextLine();
      // System.out.println("enter a string2");
      // String b=sc.nextLine();
      // System.out.println(a + b);


      // System.out.println(1 +1);
      // System.out.println("1" + "1");
      // System.out.println('1' + '1');

      //even and odd number
      // System.out.println("enter the value of num");
      // int num= sc.nextInt();
      // if(num%2==0)
      // {
      //   System.out.println("the number is even");
      // }
      // else
      // {
      //   System.out.println("the number is odd");
      // }
      
      
      //greatest number among three numbers
      // System.out.println("enter num1");
      // int num1=sc.nextInt();
      // System.out.println("enter num2");
      // int num2=sc.nextInt();
      // System.out.println("enter num3");
      // int num3=sc.nextInt();
      // if(num1>num2 && num1>num3)
      // {
      //    System.out.println("num1 is greater");
      // }
      // else if(num3>num2)
      // {
      //    System.out.println("num3 is greater");
      // }
      // else
      // {
      //    System.out.println("num2 is greater");
      // }
      


      //income tax calculator
      
      // System.out.println("income :");
      // int income=sc.nextInt();
      // int tax;
       
      //  if(income<500000)
      //  {
      //     tax=0;
      //  }
      //  else if(income>500000 && income<1000000)
      //  {
      //    tax=(int)(0.2*income);
      //  }
      //  else 
      //  {
      //  tax=(int)(0.3*income);
      //  }
      //   System.out.println(income+tax);



      //Ternary operator
      // System.out.println("enter the number");
      // int num=sc.nextInt();
      // String n=((num % 2) == 0) ? "even" : "odd";
      // System.out.println(n);



      //switch statement
      // System.out.println("enter a choice");
      // int choice=sc.nextInt();
      
      // switch(choice)
      // {
      //    case 1:
      //      System.out.println("pen");
      //      //if break is not used then all cases after a case is true will be executed therefore to stop the process after one case is found true we use break
      //      break;
      //      case 2:
      //       System.out.println("pencil");
      //       break;
      //       case 3:
      //          System.out.println("eraser");
      //          break;
      //          default:
      //             System.out.println("invalid input");

      // }



      //calculator
      // System.out.println("a:");
      // int a=sc.nextInt();
      // System.out.println("b:");
      // int b=sc.nextInt();
      // //we use .charAt(0) because we want only one char
      //  System.out.println("operator:");
      // char operator=sc.next().charAt(0);
      // switch(operator)
      // {
      //    case '+' : System.out.println(a+b);
      //                  break;

      //    case '-' : System.out.println(a-b);
      //                  break;
      //    case '*' : System.out.println(a*b);
      //                  break;
      //    case '/' : System.out.println(a/b);
      //                  break;
      //    case '%' : System.out.println(a%b);
      //                  break;      
      //    default :  System.out.println("invalid input");
         
                                                         
      // }

      public class practice{
        public static void hollow_rectangle(int row,int col){
        
          for(int i = 1;i<= row;i++){
            for(int j=1;j<=col;j++){
              if(i == 1 || i == row || j == 1 || j == col){
                System.out.print("*");
              }else{
                System.out.print(" ");
              }
            }
            System.out.println();
          }
        }

        public static void inverted_pyramid(int n){
          for(int i=1;i<=n;i++){
            //spaces
            for(int j=1;j<=n-i;j++){
              System.out.print(" ");
            }
            //stars
              for(int j=1;j<=i;j++){
                System.out.print("*");
              }
             
            
            System.out.println();
          }
        }

          public static void inverted_pyramid_numbers(int n){
          
            for(int i=1;i<=n;i++){
              for(int j=1;j<=n-i+1;j++){
                System.out.print(j);
            
              }
              System.out.println();
            }
          }

          public static void butterfly(int n){
            for(int i=1;i<=n;i++){
              for(int j=1;j<=i;j++){
                //stars
                System.out.print("*");
              }
              //spaces
              for(int j=1;j<=2*(n-i);j++){
                System.out.print(" ");
              }
              System.out.println();
            }
          
          //2nd half
          for(int i=n;i>=1;i--){
             for(int j=1;j<=i;j++){
                //stars
                System.out.print("*");
              }
              //spaces
              for(int j=1;j<=2*(n-i);j++){
                System.out.print(" ");
              }
              System.out.println();

          }
          }

          public static void rhombus(int n){
            for(int i=1;i<=n;i++){
              for(int j=1;j<=(n-i);j++){
                System.out.print(" ");
              }
              for(int j=1;j<=n;j++ ){
                System.out.print("*");
              
            }
            System.out.println();
          }
          }

          public static void hollow_rhombus(int n){
            for(int i=1;i<=n;i++){
              for(int j=1;j<(n-i);j++){
                System.out.print(" ");
              }
              //hollow rectangle stars
              for(int j=1;j<=n;j++){
              if(i == 1 || i == n || j == 1 || j == n){
                System.out.print("*");
              }else{
                System.out.print(" ");
              }
            }
            System.out.println();
            }
          }

          public static void diamond(int n){
            for(int i=1;i<=n;i++){
              for(int j=1;j<=(n-i);j++){
                 System.out.print(" ");
              }
              for(int j=1;j<=(2*i)-1;j++){
                 System.out.print("*");
              }
               System.out.println();
            }
            //2nd half
            for(int i=n;i>=1;i--){
              for(int j=1;j<=(n-i);j++){
                 System.out.print(" ");
              }
              for(int j=1;j<=(2*i)-1;j++){
                 System.out.print("*");
              }
               System.out.println();

            }
          }
        
          public static void main(String[] args){
            // hollow_rectangle(4,5);
            // inverted_pyramid(4);
            // inverted_pyramid_numbers(5);
            // butterfly(4);
            // rhombus(5);
            // hollow_rhombus(5);
            diamond(5);

            
          }
        
      
      }



      


      



      


      






  
