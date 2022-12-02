import java.util.*;

class MissingNumber {


    public static void main(String[] args) {
        int[] array1 = {1,2,3,4,5,6,7,9,10};
        int[] array2 = {2,6,4,1,3,7,8,9};

        System.out.println(missingNumber(array1, 9));        
        System.out.println(missingNumber(array2, 10));
    }

    public static int missingNumber(int[] nums, int maxNum){
        Arrays.sort(nums);
        
        for (int i = 1; i <= maxNum; i++) {
            if (i != nums[i - 1]){
                return i;
            } 
        }

        return 0;
    }
}