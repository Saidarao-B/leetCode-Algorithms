package numberOfGoodPairs;

public class NumberOfGoodPairs {
    public int numIdenticalPairs(int[] nums) {
	    int goodPairCount = 0;
	    if(nums.length == 0)   {
	        return 0;
	    }
	    for(int i=0; i< nums.length-1; i++){
	        for(int j = i+1; j<nums.length; j++){
	            if(nums[i] == nums[j]){
	                goodPairCount++;
	            }
	        }
	    }
	    return goodPairCount;
   }
}
	