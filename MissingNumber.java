import java.util.*;
import java.util.Set;

class MissingNumber {
    public static void main(String[] args) {
        int[] array1 = {1,2,3,4,5,6,7,9,10};
        int[] array2 = {2,6,4,1,3,7,8,9};
        int[] array3 = {1,3,5,7,9,2,4,6,8,10};

        System.out.println(missingNumberTwo(array1, 9));        
        System.out.println(missingNumberTwo(array2, 10));
        System.out.println(missingNumberTwo(array3, 10));
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

    public static int missingNumberTwo(int[] nums, int maxNum){
       HashSet set = new HashSet<>();

       for (int j = 0; j < nums.length; j++){
        set.add(nums[j]);
       }

        for (int i = 1; i <= maxNum; i++){
            if (!set.contains(i)){
                return i; 
            }
        }
        
        return 0; 
    }
}