package hw2;

import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class String_Set {
    static String String_set(int n)
    {

        // chose a Character random from this String
        String AlphaNumericString = "abcdefghijklmnopqrstuvxyz";

        // create StringBuffer size of AlphaNumericString
        StringBuilder sb = new StringBuilder(n);

        for (int i = 0; i < n; i++) {

            // generate a random number between
            // 0 to AlphaNumericString variable length
            int index
                    = (int)(AlphaNumericString.length()
                    * Math.random());

            // add Character one by one in end of sb
            sb.append(AlphaNumericString
                    .charAt(index));
        }

        return sb.toString();
    }
    public static void main(String[] args) {
        Map<Integer,String> arr= new HashMap<>();
        Random r=new Random();
        Integer n;
        Integer i=0;
        while(i!=20) {
            n = r.nextInt(21);
            String a = String_set(n);
            arr.put(i,a);
            i++;
        }

        System.out.println(arr);

    }
}
