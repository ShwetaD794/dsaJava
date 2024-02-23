
import java.util.*;
//arrays are call by referance
public class Array1 {
    


    // public static void update(int marks[],int nonChangable){
    //     nonChangable = 10;
    //     for(int i=0;i<marks.length;i++){
    //         marks[i] = marks[i] + 1;
        // }
 //           linear search
        public static int linearSearch(int num[],int key){
            for(int i=0;i<num.length;i++){
                if(num[i] == key){
                    return i;
                }
            }
            return -1;
        }

//        largest in array

         public static int getlargest(int numbers[]){
        int largest = Integer.MIN_VALUE;  //-infinity
        int smallest = Integer.MAX_VALUE;

        for(int i=0;i<numbers.length;i++){
            if(largest<numbers[i]){
                largest = numbers[i];
            }
            if(smallest > numbers[i]){
                smallest = numbers[i];
            }
        }
        System.out.println("smallest value is:" + smallest);
        return largest;

    }

    //     Binary Search
    public static int binarysearch(int numbers[],int key){
        int start = 0,end = numbers.length-1;
        while(start <= end){
            int mid = (start + end)/2;

            //comparisons
            if(numbers[mid] == key){
                return mid;
            }
            if(numbers[mid]<key){
                start = mid+1;
            }else{
                end = mid-1;
            }
        }
        return -1;
    }

    //        Reverse an array
    public static void reverse(int numbers[]){
        int first = 0,last = numbers.length-1;
        while(first<last){
            //swap
            int temp = numbers[last];
            numbers[last] = numbers[first];
            numbers[first] = temp;

            first++;
            last--; 
        }
    }

    //pairs in array
    public static void printpairs(int numbers[]){
        int tp = 0;
        for(int i=0;i<numbers.length;i++){
            int curr = numbers[i];
            for(int j=i+1;j<numbers.length;j++){
                System.out.println(" (" + curr + " , " + numbers[j] + " ) ");
                tp++;
            }
            System.out.println();
        }
        System.out.println("total pairs : " + tp);

    }


    //print Subarrays
    public static void printSubarrays(int numbers[]){
        int ts = 0;
        for(int i=0;i<numbers.length;i++){
            int start = i;
            for(int j=i;j<numbers.length;j++){
                int end = j;
                for (int k=start;k<=end;k++){
                    System.out.print(numbers[k] + " ");
        
                }
                ts++;
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("total subarrays =" + ts);
    }

  


       
    
    public static void main(String args[]){
    //     // int marks[] = new int[50];
        Scanner sc = new Scanner(System.in);

        // System.out.println("length of array: " + marks.length);
        // marks [0] = sc.nextInt();
        // marks [1] = sc.nextInt();
        // marks [2] = sc.nextInt();

        // System.out.println("physics:" +  marks[0]);
        // System.out.println("maths:" +  marks[1]);
        // System.out.println("chemistry:" +  marks[2]);

        // marks[2]=100;
        // System.out.println("maths : " + marks[2]);

        // marks[1]=marks[1] + 1;
        // System.out.println("maths : " + marks[1]);

        // int percentage = (marks[0] + marks[1] + marks[2]) / 3;
        // System.out.println("percentage :" + percentage + "%");

        // int marks[] = {97,98,99};
        // int nonChangable = 5;
        // update(marks,nonChangable);  //nonChangable won't change but marks will be change
        // System.out.println(nonChangable);
       

        //to print marks
        // for(int i=0;i<marks.length;i++){
        //     System.out.print(marks[i] + " ");
        // }
        //  System.out.println();

        // int num[] ={2,4,5,6,8,9};
        // int key = 5;
        // int index = linearSearch(num,key);
        // if(index == -1){
        //     System.out.print("not found");
        // }else{
        //     System.out.print("key is found at index " + index);
        // }

        // int numbers[] = {2,3,5,6,11,8,9};
        // System.out.println("largest value is: " + getlargest(numbers));

        // int numbers[] = {2,3,4,5,6,9};
        // int key = 4;
        // System.out.println("key is found at index" + binarysearch(numbers,key));

        // int numbers[] = {2,4,6,8,9};
        // reverse(numbers);
        // for(int i=0;i<numbers.length;i++){
        //     System.out.print(numbers[i] + " ");

        // }
        // System.out.println();

        // int numbers[] = {2,4,7,8,9,11};
        // printpairs(numbers);

        int numbers[] = {2,4,6,8,9,15};
        printSubarrays(numbers);

       sc.close();

        
    }

   
    
}



    

