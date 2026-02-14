import netscape.javascript.JSObject;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class practice {

    public static void main(String[] args) {

        int[] a = {-1, -1, -4, -2, -3, -4};

        int max = a[0];
        int currentsum = 0;
        for(int i = 0 ; i<a.length;i++) {
             currentsum+=a[i];

             if(max<currentsum){
                 max = currentsum;
             }
            if(currentsum<0){
                currentsum = 0;
            }



        }
        System.out.println(max);

        int[] b = {1,1,2,2,2,3,4};
        int count = 0;
        a[count] = a[0];
        for(int i = 1 ;i<a.length-1;i++){
            if(a[i]<a[i+1]){
                a[count] = a[i];
                count++;
            }
        }


    }
}








