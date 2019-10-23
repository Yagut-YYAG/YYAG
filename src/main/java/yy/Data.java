package yy;

import java.util.Iterator;

public class Data implements Iterable<Character>{
     String data="Hello, World!";
    char[] a=data.toCharArray();
   public Iterator<Character> iterator_data() {

        Iterator<Character> myIterator = new Iterator<Character>() {
            int current = 0;

            @Override
            public boolean hasNext() {
                return current < a.length;
            }

            @Override
            public Character next() {
                if((a[current++]>'A'&& a[current++]<'Z')||a[current++]==' ')
                return a[current++];
                else
                    return ' ';
            }
        };

        return myIterator;
    }


    @Override
    public Iterator<Character> iterator() {
        return null;
    }
}

