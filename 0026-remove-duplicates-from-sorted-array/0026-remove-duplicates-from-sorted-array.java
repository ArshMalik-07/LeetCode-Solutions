class Solution {
    public int removeDuplicates(int[] nums) {
        int i=0;
        int j=1;
        int k=1;
        while(j<nums.length){
            if (nums[j]==nums[j-1]){
            j++;
            continue;
        }
        else{
            nums[i+1]=nums[j];
            i++;
            j++;
            k++;
        }
    }
        return k;
    }
}