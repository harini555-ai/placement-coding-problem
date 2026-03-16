package array;

public class ContainsDuplicate {
   
    public boolean hasDuplicate(int[] nums) {
        
        for(int i=0;i<nums.length-1;i++) //0123
        {
            for(int j=i+1;j<nums.length;j++) //1
            {
                if(nums[i]==nums[j])
                {
                    return true;
                }
            }
        }
        return false;
    
}
}
