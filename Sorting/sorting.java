// import java.util.Arrays;
// import java.util.Collections;
// import java.util.*;

public class sorting{
    public static void bubblesort(int arr[]){
        for(int turn=0;turn<arr.length;turn++){
            for(int j=0;j<arr.length-1-turn;j++){
                if(arr[j] > arr[j+1]){
                    //swap
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    public static void selectionsort(int arr[]){
        for(int i=0;i<arr.length-1;i++){
           int minpos = i;
           for(int j=i+1;j<arr.length;j++){
            if(arr[minpos] < arr[j]){
            minpos = j;
           }
           }
           
    //swap
    int temp = arr[minpos];
    arr[minpos] = arr[i];
    arr[i] = temp;
    }
    }

    public static void insertionsort(int arr[]){
        for(int i=1;i<arr.length;i++){
            int curr = arr[i];
            int prev = i-1;
            //finding out the correct pos to insert
            while(prev >= 0 && arr[prev] > curr){
                arr[prev + 1] = arr[prev];
                prev--;
            }
            //insertion
            arr[prev+1] = curr;

        }
    }

    public static void countingsort(int arr[]){
        int largest = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            largest = Math.max(largest,arr[i]);
        }
        int count[] = new int [largest + 1];
        for(int i=0;i<arr.length;i++){
            count[arr[i]]++;
        }
        //sorting 
        int j = 0;
        for(int i=0;i<count.length;i++){
            while(count[i] > 0){
            arr[j] = i;
            j++;
            count[i]--;
            }

        }
    }
    
public static void printArr(int arr[]){
    for(int i=0;i<arr.length;i++){

     System.out.print(arr[i] + " ");
    }
    System.out.println();
}
public static void main(String args[]){
//  Integer arr[] = {5,4,1,3,2};  //we can't do reverse order by int so we have to write Interger because int is primitive type of variable and reverse work on objects so here Integer is object
// // insertionsort(arr);
// //inbuilt sort[o(n logn)]   
// Arrays.sort(arr,0,5);
// //reverse
// Arrays.sort(arr,0,3,Collections.reverseOrder()); //Integer
// printArr(arr);
int arr[] = {5,4,1,3,2};
countingsort(arr);
printArr(arr);

}
}