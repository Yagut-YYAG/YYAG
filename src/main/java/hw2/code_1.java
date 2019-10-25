package hw2;

import java.util.*;

public class code_1 {
    public static void main(String[] args) {
        Set<Integer> numbers = new HashSet<>();

            Integer i=0;
            Random r = new Random();
        while(true)
            {
                Integer element = r.nextInt(100);
                numbers.add(element);  i++;
                if(numbers.size()==20)break;
            }
        System.out.print(numbers);
        }
    }


