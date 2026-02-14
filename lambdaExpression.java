import java.util.*;
import java.util.stream.Collectors;

public class lambdaExpression {

    public static  void main(String[] args) {


        getPrint(3,4);

       Add add = (int a, int b)->{
            System.out.println(a+b);
       };
       add.sum(5,8);

        Add add1 =   (a,b)-> System.out.println(a+b);;

        Thread thread = new Thread(runnable);
        thread.run();

    }
    public static void getPrint(int a , int b ){

        System.out.println(a+b);
    }

    interface  Add {

        void sum(int a , int b);
    }


    static Runnable runnable = ()->{
        for(Integer i = 0 ; i<10;i++){
            System.out.println(i);
        }

    };


}








