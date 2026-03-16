package array;

public class Concatenation {
    public int[] getConcatenation(int[] nums) {
        int ans[]=new int[nums.length*2];
        int ind=0;
        for(int i=0;i<2;i++)
        {
            for(int num:nums)
            {
                ans[ind++]=num;
            }
        }
        return ans;
    }
}
