import java.util.ArrayList;
import java.util.Random;
public  class YYAG_y {

        public static void main(String[] args) {
            ArrayList<Integer> a= new ArrayList<>();
            ArrayList<Integer> b= new ArrayList<>();
            ArrayList<Integer> c= new ArrayList<>();


            Random r=new Random();
            for (int i = 0; i <100 ; i++) {
                Integer element=r.nextInt(100);
                a.add(element);
            }
            for (int i = 0; i <100 ; i++) {
                Integer element1=r.nextInt(100);
                if(element1%2==0)continue;
                b.add(element1);
            }
            for (int i = 0; i <100 ; i++) {

                Integer element1=r.nextInt(100);
                if(element1%2!=0)continue;
                c.add(element1);
            }
            for (int i = 0; i <a.size() ; i++) {
                System.out.print(a.get(i)+" ");
            }
            System.out.println();
            for (int i = 0; i <b.size() ; i++) {
                System.out.print(b.get(i)+" ");
            }
            System.out.println();
            for (int i = 0; i <c.size() ; i++) {
                System.out.print(c.get(i)+" ");
            }
String z="fgh";
            z.toCharArray();
            z.toLowerCase();
            z.toUpperCase();

        }
    }


