import java.util.*;
public class bits{
    public static void oddOrEven(int n){
        int bitMask = 1;
        if((n & bitMask) == 0){
            //even number
            System.out.println("even number");
        }else{
            System.out.println("odd number");
        }
    }

    public static int getIthBit(int n,int i){
        int bitMask = 1<<i;
        if((n & bitMask)== 0){
            return 0;
        }else{
            return 1;
        }
    }

    public static int setIthBit(int n,int i){
        int bitMask = 1<<i;
        return n | bitMask;
    }
    public static void main(String args[]){
        // oddOrEven(3);
        // oddOrEven(4);
        System.out.println(getIthBit(10,3)); //10 = 1010
        System.out.println(setIthBit(10,2)); 
    }
}