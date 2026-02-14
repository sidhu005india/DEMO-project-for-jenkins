package ExecutorFrameWork.Lock;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadClass {


    public static void main(String[] args) {
        int nums[] = {5,1,1,2,0,0};
        int[] ints = twoSum(nums, 6);
//        for (Integer integer : ints){
//            System.out.println(integer);
//        }
        String str = "abc111";

        int z [] = {3, 2, -3, 4, 6,9,10};

        for(int i = 0 ; i<z.length;i++) {
            int start = z[0];
            int last = z[i];
            int mid = z.length/2;
            if (z[mid] == 2) {
                System.out.println("target at index at " + i);
            } else if (2>z[mid]) {
                start = mid;
            }else{
                last = mid;
            }
        }

    }

    public int maxSubArray(int[] nums) {
        int currsum = 0;
        int max = 0;

        for(int i = 0; i<nums.length;i++){

             currsum = Math.max(nums[i], currsum+nums[i]);
             max = Math.max(max,currsum);


        }
return max;
    }



    public  static int[] twoSum(int[] nums, int target) {

        int num[] = new int[2];
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
             if(nums[i]+nums[j]==target){
                 num[0]= i;
                 num[1]= j;
             }
            }
        }
   return num;
    }
    public static  int secondHighest(String str) {

        int digitCount = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= '0' && ch <= '9') {
                digitCount++;
            }
        }

// ---------- create exact size array ----------
        int[] a = new int[digitCount];

// ---------- PASS 2: store digits ----------
        int index = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= '0' && ch <= '9') {
                a[index] = ch - '0';
                index++;
            }
        }
        int max = Integer.MIN_VALUE;
        int secMax = Integer.MIN_VALUE;
        for(int i = 0;i<a.length;i++){
          if(a[i]>max){
              secMax = max;
              max = a[i];
          }
       else   if (a[i]>secMax && a[i]<max) {
             secMax = a[i];
          }


        }
        if(a.length==0||max ==secMax){
            return -1;
        }


return  secMax;
    }
    public static boolean isPalindrome(int x) {

           int y = x;
            int r = 0;
            if(x>0){
            while(x>0){
                r = r*10+x%10;
                x= x/10;
            }
            }else{
               StringBuilder z = new StringBuilder(String.valueOf(x-(2*x))).reverse();
                Integer integer = Integer.valueOf(String.valueOf(z));
             integer = integer*-1;

            }
                if(r == x){
                return true ;
            }
            return false;



        }

    public static int  minStartValue(int[] nums) {

        int min = Integer.MAX_VALUE;
        int d = nums[0];
        for(int i = 1 ; i< nums.length;i++){
            d = d+nums[i];
            if(d<min){
                min= d;
            }
        }

return 1-(min);

    }

    public  static boolean isPowerOfTwo(int n) {
        while(n>0){
            if(n==1 && n==0){
                return  true;
            }
            if(n%2!=0 ){
                return false;
            }
            n = n/2;

        }
        return  true;

    }

    public  static  int[] sortArray(int[] nums) {

        Set<Integer> s = new HashSet();
        for(int i = 0;i<nums.length;i++){
            s.add(nums[i]);
        }
        int j [] = new int[nums.length];
        int i = 0;
        for(Integer k: s){
            j[i] = k;
            i++;
        }
        return  j;
    }

    public static void reverseString(char[] s) {
        char x[] = new char[s.length ];
        int count = 0;
        for (int i = s.length - 1; i >= 0; i--) {
            x[count] = s[i];
            count++;
        }
        for(int i = 0 ;i<s.length;i++){
            s[i] = x[i];
        }

    }
    }

