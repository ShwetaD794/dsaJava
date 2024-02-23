import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;

public class AssignArray {//contain Duplicate
public static boolean containDuplicate(int numbers[]){
    for(int i=0;i<numbers.length;i++){
        for(int j=i+1;j<numbers.length;j++){
            if(numbers[i] == numbers[j]){
                return true;
            }
        }
    }
    return false;
}

//rotation at pivot index                             //doubt
// public static int search(int nums[],int target){
//     //to get minimum element in an array
//     int mins = minsearch(nums);
//     //find in sorted left
//     if(nums[min] <= target && target <= nums[nums.length-1]){
//         return search(nums,min,nums.length-1,target);
//     }
//     //find in sorted right
//     else{
//         return search(nums,0,min,target);
//     }

//     //binary search to find largest in left to right boundary
//     public int search(int[] nums,int left,int right ,int target){
//         int l = left;
//         int r = right;
//         while(l <= r){
//             int mid = l + (r-l)/2;
//             if(nums[mid] == target){
//             return mid;
//             } 
//             else if (nums[mid] > target){
//             r = mid - 1;
//             }
//             else{
//             l = mid + 1;
//             }
        
//         }
//         return -1;
//    }

//    //smallest element index
//    public int minsearch(int [] nums){
//     int left = 0;
//     int right = nums.length-1;
//     while(left < right){
//         int mid = left + (right - left)/2;
//         if(mid > 0 && nums[mid-1] > nums[mid]){
//             return mid;
//         }
//         else if (nums[left] <= nums[mid] && nums[mid] > nums[right]){
//             left = mid + 1;
//         }
//         else{
//             right = mid - 1;
//         }
//     }

   
//    return left;
//    }
// }

//Maximum profit
// public static int maxProfit(int prices[]){
//     int buy = prices[0];
//     int profit = 0;
//     for(int i=1;i<prices.length;i++){
//         if(prices[i]>buy){
//             profit = Math.max(prices[i]-buy,profit);
           
//         }
//         else{
//             buy = prices[i];
//         }
        
        
//     }
//     return profit;
  
// }

public static int trap(int height[]){
    int n = height.length;
    int res = 0 ,l = 0,r = n-1;
    int rMax = height[r], lMax = height[l];

    while(l<r){
        if(lMax < rMax){
            l++;
            lMax = Math.max(lMax,height[l]);
            res += lMax -height[l];
        }else{
            r--;
            rMax = Math.max(rMax,height[r]);
            res += rMax - height[r];
        }

    }
    return res;
}

//triplets
public static List<List<Integer>> threesum(int nums[]){
    List<List<Integer>> result = new ArrayList <List<Integer>> ();

    for(int i=0;i<nums.length;i++){
        for(int j=i+1;j<nums.length;j++){
            for(int k=j+1;k<nums.length;k++){
                if(nums[i] + nums[j] + nums[k] == 0){
                    List<Integer> triplet = new ArrayList <Integer> ();
                    triplet.add(nums[i]);
                    triplet.add(nums[j]);
                    triplet.add(nums[k]);
                    Collections.sort(triplet);
                    result.add(triplet);
                }
            }
        }
    }
    result = new ArrayList<List<Integer>> (new LinkedHashSet <List<Integer>> (result));
    return result;
}
public static void main(String args[]){
    // int numbers[] = {1,2,5,4,3,7,99};
    //      System.out.println(containDuplicate(numbers));

    //     int nums[] = {4,5,6,7,0,1,2};
    //     int target = 0;
    //     System.out.println(search(nums,target));

    //     int prices[] = {7,1,5,3,6,4};
    //     System.out.println(maxProfit(prices));
        
    //     int height[] = {4,2,0,3,2,5};
    //     System.out.println(trap(height));
    
        int nums[] = {-1,0,1,2,-1,4};
        System.out.println(threesum(nums));

}

       
    
    
}
