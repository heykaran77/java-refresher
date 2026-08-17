package Collections;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamAPI {
    public static void main(String[] args){
        List<Integer> nums = new ArrayList<>();

        nums.add(1);
        nums.add(2);
        nums.add(8);
        nums.add(5);
        nums.add(4);
        nums.add(5);
        nums.add(3);

Stream<Integer> s = nums.stream();
Stream<Integer> s2 = nums.stream();

s.forEach(n -> System.out.println(n));

int result = s2.filter(n -> n%2 == 0).map(n -> n*2).reduce(0, (sum, res) -> sum + res);

        System.out.println("Sum of even numbers multiplied by 2: " + result);
    }
}
    