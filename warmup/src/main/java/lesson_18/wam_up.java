package lesson_18;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class wam_up {
    public static void main(String[] args) {
            Scanner input= new Scanner(System.in);
        int a,N=0,d=0;
        a=input.nextInt();

          for(int i=0;i<100;i++){
              if(i%3==0){if(i%2!=0) N++;
                  if(N==a){d=i;break;}
              }
          }
        System.out.println(d);
    }
}
