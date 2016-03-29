public class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> result = new ArrayList<>();
        HashSet<ArrayList<Integer>> hashset = new HashSet<ArrayList<Integer>>();
        
        if(nums == null || nums.length<4)
            return result;
        Arrays.sort(nums);
        if(nums.length==4)
        {
            if(nums[0]+nums[1]+nums[2]+nums[3]==target)
            {
                ArrayList<Integer> item = new ArrayList<>();
                item.add(nums[0]);
                item.add(nums[1]);
                item.add(nums[2]);
                item.add(nums[3]);
                result.add(item);
            }
            return result;
        }
        
        int i,j,k,l;
        for(i=0;i<nums.length;i++)
        {
            for(j=i+1;j<nums.length;j++)
            {
                k = j+1;
                l = nums.length - 1;
                int target2 = target - nums[i] - nums[j];
                while (k < l)
                {
                    int sum = nums[k]+nums[l];
                    if(target2 > sum) k++;
                    else if(target2 < sum) l--;
                    else if(target2 == sum)
                    {
                        ArrayList<Integer> item = new ArrayList<>();
                        item.add(nums[i]);
                        item.add(nums[j]);
                        item.add(nums[k]);
                        item.add(nums[l]);
                        //The solution set must not contain duplicate quadruplets
                        if(!hashset.contains(item))
                        {
                            result.add(item);
                            hashset.add(item);
                        }
                        
                        k++;
                        l--;
                    }
                }
            }
            
        }
        return result;
    }
}