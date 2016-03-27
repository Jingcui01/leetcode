/**
 * Note: The returned array must be malloced, assume caller calls free().
 */
int* twoSum(int* nums, int numsSize, int target) 
{
    int *returnArry =(int*) malloc(2*sizeof(int));
    int i,j,flag=0;
    for(i=0;i<numsSize;i++)
    {
        for(j=0;j<numsSize;j++)
        {
            if(nums[i]+nums[j]==target&&i!=j)
            {
                flag=1;
                break;
            }
        }
        if(flag==1)break;
    }
    if(i>j) {returnArry[0]=j+1;returnArry[1]=i+1;returnArry[2]=0;}
    else {returnArry[0]=i+1;returnArry[1]=j+1;returnArry[2]=0;}
    return returnArry;
}