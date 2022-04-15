package Collections;
import java.util.ArrayList;
import java.util.Iterator;
/*
 *author s.timofeev 12.04.2022
 */



public class Main {
    public static void main(String[] args) {
        String string=new String();

        final ArrayList<String> list = new ArrayList<>();

        list.add("st1");
        list.add("st2");
        System.out.println(list);
        final Iterator<String> iterator=list.iterator();

        for (String ele:list){

        }
        for (String elem:list){
            System.out.println(elem);
        //while (iterator.hasNext()){
          //  System.out.println(iterator.next());
        }
    }


}
