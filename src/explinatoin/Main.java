package explinatoin;


import java.util.List;
import java.util.stream.Stream;

public class Main {
  
  public static void main(String[] args) {
    
    /*
     * ArrayList<Integer> numbers = new ArrayList<>(List.of(1,2,4,6,8,56));
     * numbers.stream().forEach(System.out::println);
     */
    
    Stream.of(5,34,23,34,45,56).forEach(System.out::println);
    
    Stream.generate(() -> "Hello world!").limit(3).forEach(System.out::println);
    
    List.of(4,5,6,7,8,9).stream().forEach(System.out::println);
    
   
  }

}
