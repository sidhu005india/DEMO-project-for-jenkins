import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class steamExample {

    public static void main(String[] args){

//         List<String> names = Arrays.asList("Ankur", "Sidharth", "Amit", "John", "Ajay");
//
//      Long count =  names.stream().filter(e->e.startsWith("A")).count();
//        System.out.println(count);
//
//        List<Integer> numbers = Arrays.asList(10, 3, 45, 7, 23, 89, 1);
//
//        Integer integer = numbers.stream().max((a, b) -> a-b).get();
//        Integer integer1 = numbers.stream().max(Comparator.comparing(e->e)).get();
//
//        System.out.println(integer1);
//
//        List<String> words = Arrays.asList("java", "spring", "boot", "hibernate", "spring");
//        System.out.println( words.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting() )));
//
//
        List<Integer> numberss = Arrays.asList(5, 9, 11, 2, 8, 21, 1);
//        System.out.println(numberss.stream().sorted(Comparator.reverseOrder()).skip(1).limit(1).collect(Collectors.toList()));
//

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4,- 5, -6);
//     `   System.out.println(numbers.stream().filter(e->e>0).collect(Collectors.toList()).size());;
//        System.out.println(numbers.stream().filter(e->e%2==0).collect(Collectors.toList()));`

        System.out.println(numbers.stream().collect(Collectors.partitioningBy(e->e%2==0)));;

        List<String> words = Arrays.asList("java", "springboot", "api", "hibernate", "stream");
        System.out.println(words.stream().sorted((a,b)->(b.length()-a.length())).limit(3).collect(Collectors.toList()));

String x= "swiss";
        System.out.println(x.chars().mapToObj(c->(char)c).collect(Collectors.groupingBy((e->e),Collectors.counting())).entrySet().stream().filter(e->e.getValue()==1).limit(1).collect(Collectors.toList()));

        System.out.println(numberss.stream()
                .sorted((a,b)->b-a)
                .skip(1)
                .findFirst());


      List<String>lists =   Arrays.asList("java", "api", "spring");
        System.out.println(lists.stream().collect(Collectors.groupingBy(e->e.length(),Collectors.toList()))); ;

        List<String> words1 = Arrays.asList("java", "api", "spring");

        Map<Integer, List<String>> result =
                words1.stream().map(e->e.toUpperCase())
                        .collect(Collectors.groupingBy(
                               e->e.length(),Collectors.toList())
                        );

        System.out.println(result);










    }
}








