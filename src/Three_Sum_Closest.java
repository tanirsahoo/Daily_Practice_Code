import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

class Solution{
    int threeSumClosest(int[] nums , int target){
        int[] ar = new int[3] ;
        ar[0] = nums[0] ;
        ar[1] = nums[1] ;
        ar[2] = nums[2] ;
        Arrays.sort(ar);
        int po = ar[0] ;
        ar[0] = ar[2] ;
        ar[2] = po ;
        int sum1 = ar[0] + ar[1] + ar[2] ;
        int min = Math.abs(target - sum1) ;
        int p = -1 , i ;
        for(int k = 3 ; k < nums.length ; k ++) {
            for (i = 0; i < 3; i++) {
                int sum = 0;
                for (int j = 0; j < 3; j++) {
                    if (i != j)
                        sum += ar[j];
                    else
                        sum += nums[k];
                }
                if (Math.abs(target - sum) <= min) {
                    min = Math.abs(target - sum);
//                    ar[i] = nums[k];
//                    break ;
                    p = i ;
                }
            }
            if(p > -1)
                ar[p] = nums[k] ;
            p = -1 ;
        }
        return (ar[0] + ar[1] + ar[2]) ;
    }
}
public class Three_Sum_Closest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        int n = sc.nextInt() ;
        int[] nums = new int[n] ;
        for(int i = 0 ; i < n ; i ++){
            nums[i] = sc.nextInt() ;
        }
        int target = sc.nextInt() ;
        Solution ob = new Solution() ;
        int ret = ob.threeSumClosest(nums , target) ;
        System.out.println(ret);
    }
}
