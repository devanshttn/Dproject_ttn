import java.awt.desktop.SystemEventListener;
import java.util.Collections;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        List<String> names = Arrays.asList("DEV","hema","dev","KArna","dev","arjun","hema","arjun");

        //Map<String, Long> new_list = names.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        names.stream().map(String::toLowerCase).map(e->e.startsWith("d")).forEach(System.out::println);

        //System.out.println(new_list);

        System.out.println("Hello world!");
    }
}