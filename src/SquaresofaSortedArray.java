import java.util.Arrays;
//solution-1

public class SquaresofaSortedArray {
    public int[] sortedSquares(int[] nums) {
        int x=nums.length;
        int [] newnums = new int [x];
        for(int i=0;i<nums.length;i++){

            newnums[i] = nums[i] * nums[i];
        }
        Arrays.sort(newnums);
        return newnums;
    }
}
