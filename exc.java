import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class exc {

    public static void main(String[] args) {

    int age = 50;
       try{
           checkExc(age);
       } catch (exceptionClass e) {
           throw new RuntimeException(e);
       }


    }

    public static void checkExc(int age) throws exceptionClass{

        if(age<18){
            throw new exceptionClass("age  is less");
        }else{
            System.out.println("valid");
        }


    }


}








