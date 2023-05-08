/*Given a sorted array of distinct integers and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.

You must write an algorithm with O(log n) runtime complexity.

 

Example 1:

Input: nums = [1,3,5,6], target = 5
Output: 2*/

class Search_Insert_Position {
    public int searchInsert(int[] nums, int target) {
        int n=-1;
      if(nums.length==1&&nums[0]>=target)
    return 0;        
      if(nums.length==1&&nums[0]<=target)
    return 1;        
        for(int x=0;x<nums.length-1;x++)
        { 
            if(nums[x]==target)
            {
                n=x;
                break;
            }
              if( nums[0]>target)
                       return 0;
             if(nums[x]<=target && nums[x+1]>=target )
                n=x+1;
                else if(nums[x]<target)
                n=nums.length;

                

               
            
        }
    
            return n;

    }
}