public class SquaresofaSortedArray_2 {
    public int[] sortedSquares(int[] nums) {
        int x=nums.length;
        int left =0;
        int right =(x-1);
        int [] newnums = new int [x];
        for(int i=right;i>=0;i--){
            if(Math.abs(nums[left])>nums[right]){
                newnums[i] = nums[left] * nums[left];
                left++;
            }
            else{
                newnums[i] = nums[right] * nums[right];
                right--;
            }

        }

        return newnums;
    }
}
