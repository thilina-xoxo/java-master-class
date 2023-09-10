package Kavi.program1.mooc.part1;


import java.util.Arrays;
import java.util.HashMap;

public class Printing {

    public static void main(String[] args) {
        int[] arr = {1,5,2,3,4,5,6};
        //System.out.println(findDupplicates(arr));
    }

    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> prevMap = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int no = nums[i];
            int diff = target - no;

            if(prevMap.containsKey(diff)) {
                int[] sumArray = {prevMap.get(diff), i};
                return sumArray;
            }
            prevMap.put(nums[i],i);
        }
        return null;
    }

 }
