import java.util.Scanner;

class Solution2 {
    public int findKthLargest(int[] nums, int k){
        int max = -2147483648  , index = 0 , largest_elem = nums[0];
        while(k -- >= 1){
            for(int p = 0 ; p < nums.length ; p ++){
                if(nums[p] > max) {
                    max = nums[p];
                    index = p ;
                }
            }
            largest_elem = nums[index] ;
            nums[index] = -2147483648 ;
            max = -2147483648 ;
        }
        return largest_elem ;
    }
}
public class K_th_Largest_element {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
//        System.out.println("Enter the size of the array.");
        int n = sc.nextInt() ;
        int[] ar = new int[n] ;
        for(int i = 0 ; i < n ;  i ++){
            ar[i] = sc.nextInt() ;
        }
        int k = sc.nextInt() ;
        Solution2 ob = new Solution2() ;
        int ret = ob.findKthLargest(ar , k) ;
        System.out.println(ret);
    }
}
