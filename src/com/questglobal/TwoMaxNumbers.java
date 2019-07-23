package com.questglobal;

public class TwoMaxNumbers {
	 
    public void printTwoMaxNumbers(int[] nums){
        int highest = Integer.MIN_VALUE;
        int secondhighest = Integer.MIN_VALUE;
        for(int i=0; i<nums.length; i++){
            if(nums[i] > highest){
                secondhighest = highest;
                highest =nums[i];
            } else if(nums[i]<highest && nums[i] > secondhighest){
                secondhighest = nums[i];
            }
        }
        System.out.println("First Max Number: "+highest);
        System.out.println("Second Max Number: "+secondhighest);
    }
     
    public static void main(String a[]){
        int num[] = {5,34,78,2,45,1,99,23};
        TwoMaxNumbers tmn = new TwoMaxNumbers();
        tmn.printTwoMaxNumbers(num);
    }
}