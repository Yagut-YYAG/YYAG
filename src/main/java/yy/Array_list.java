package yy;

import java.util.Iterator;

public class Array_list {
    public static void main(String[] args) {
        Data data = new Data();
        Iterator<Character> it2 = data.iterator_data();
        while (it2.hasNext()) {
            System.out.println(it2.next());
        }

    }

}
