import java.lang.reflect.Array;
import java.util.*;

public class ThreeSum {
    public static void main(String[] args) {
        int [] nums = {-1, 0, 1, 2, -1, -4};
        int target = -6;
        List<List<Integer>> result = threeSum(nums, target);
        System.out.println(result);
    }

    private static List<List<Integer>> threeSum(int[] nums, int target) {
        List<List<Integer>> res = new ArrayList<>();
        int i,j,k=0;
        int n = nums.length;
        for(i=0;i<n;i++)
        {
            j=i+1;
            k=n-1;
            while(j<k)
            {
                int sum=nums[i]+nums[j]+nums[k];
                if(sum==target)
                {
                    res.add(Arrays.asList(nums[i],nums[j],nums[k]));
                    j++;
                    k--;
                    while(j<k && nums[j]==nums[j+1]) j++;
                    while(j<k && nums[k]==nums[k-1]) k--;
                }
                else if(target>sum)
                {
                    k--;
                }
                else{
                    j++;
                }
            }
        }
        return res;
    }
    
}