public class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] indice = new int[2];
        int i=0,j=0,flag=0;
        for(i=0; i<nums.length;i++)
        {
            int temp = target-nums[i];
            for(j=i+1; j<nums.length;j++)
            {
                if(temp==nums[j])
                {
                    flag=1;
                    break;
                }
            }
            if(flag==1)break;
        }
        if(i>j) {indice[0]=j+1;indice[1]=i+1;}
        else {indice[0]=i+1;indice[1]=j+1;}
        return indice;
    }
    
}