import java.util.*;

public class FourSum {

    public static void main(String[] args) {
        int[] nums = {1, 0, -1, 0, -2, 2};
        int target = 0;
        List<List<Integer>> result = fourSum(nums, target);
        System.out.println(result);
    }

    public static List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> res = new ArrayList<>();
        int i,j,k,l=0;
        int n=nums.length;

        Arrays.sort(nums);

        for(i=0;i<n;i++)
        {
            for(j=i+1;j<n;j++)
            {
                k=j+1;
                l=n-1;
                while(k<l)
                {
                    int sum=nums[i]+nums[j]+nums[k]+nums[l];
                    if(sum==target)
                    {
                        res.add(Arrays.asList(nums[i],nums[j],nums[k],nums[l]));
                        while(k<l && nums[k]==nums[k+1]) k++;
                        while(k<l && nums[l]==nums[l-1]) l--;
                        k++;l--;
                    }
                    else if(sum<target)
                    {
                        k++;
                    }
                    else
                        l--;
                }
            }
        }

        return res;
    }
}
