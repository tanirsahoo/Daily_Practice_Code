import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

class three_sum_functions{
    int index_swap(int[] ar , int n , int target , int min){
        for(int i = 0 ; i < 3 ; i ++){
            int sum = 0 ;
            for(int j = 0 ; j < 3 ; j ++){
                if(i != j )
                    sum += ar[j] ;
                else
                    sum += n ;
            }
            if(Math.abs(target - sum) <= min) {
                min = Math.abs(target - sum);
                ar[i] = n ;
                break ;
            }
        }
        return min ;
    }
}

public class Three_Sum_Closest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
//        System.out.println("Enter the number of elements you want inside the array");
        int n = sc.nextInt() ;
        int[] nums = new int[n] ;
//        Arrays.fill(nums , 0);
        for(int i = 0 ; i < n ; i ++){
//            System.out.println("Enter the element at index: " + (i + 1));
            nums[i] = sc.nextInt() ;
        }
//        System.out.println("Enter the integer number.");
        int target = sc.nextInt() ;
        three_sum_functions ob = new three_sum_functions() ;
        int[] ar = new int[3] ;
        ar[0] = nums[0] ;
        ar[1] = nums[1] ;
        ar[2] = nums[2] ;
        Arrays.sort(ar);
//        Collections.reverse(Arrays.asList(ar));
        int sum = ar[0] + ar[1] + ar[2] ;
        int min = Math.abs(target - sum) ;
        for(int i = 3 ; i < n ; i ++){
            min = ob.index_swap(ar , nums[i] , target , min);
        }
        System.out.println(ar[0] + ar[1] + ar[2]);
    }
}
