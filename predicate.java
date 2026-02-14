import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class predicate {

    public static <Char> void main(String[] args) {

        Predicate<Integer> p1 = e->e>1000;
        System.out.println(p1.test(5));

      Predicate<String> stringPredicate = e->e.startsWith("A");
        Predicate<String> stringPredicate1 = e->e.length()>5;

        String s = "ANKUR";
        System.out.println(stringPredicate.and(stringPredicate1).test(s)); ;
        System.out.println(stringPredicate.or(stringPredicate1).test(s));
        System.out.println(stringPredicate.and(stringPredicate1).negate().test(s)); ;


        Function<String,Integer> function = e->e.length();
        System.out.println( function.apply("ghbv")); ;

         Function<Integer,Integer>function1 = e->e*2;
        Integer x = function.andThen(function1).apply("jsacnz");

        System.out.println(x);

        Consumer<List<Integer>>listConsumer = e->{
         for(int i : e){
             System.out.println(i);
         }
        };
        Consumer<List<Integer>>listConsumer1 = e->{
            for(int i : e){
                System.out.println(i*100);
            }
        };

        listConsumer.andThen(listConsumer1).accept(Arrays.asList(1,2,3,4)) ;



        Predicate<Integer> predicate = e->e%2==0;
        Function<Integer,Integer>integerFunction = e->e*e;
        Consumer <Integer> consumer = e-> System.out.println(e);
        Supplier <Integer> supplier = ()->100;

        if(predicate.test(supplier.get())){
            System.out.println(integerFunction.apply(supplier.get())); ;
        }




    }



}








