package Potato;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PotatoLaboratory {

    public static void main(String[] args) {
        List<Potato> potatoes = List.of(
                new Potato(1, 30, 30, 30),
                new Potato(2, 35, 31, 35),
                new Potato(3, 40, 35, 44),
                new Potato(4, 28, 44, 41),
                new Potato(5, 33, 23, 30),
                new Potato(6, 35, 33, 33),
                new Potato(7, 38, 41, 24)
        );

        for (Potato p:potatoes){
             Potato.calculateAlfa(p);


        }

        List<Potato> fourUnderExperiment = findPotatoesForExperiment(potatoes);

        System.out.println("Картофелины для эксперимента: " + fourUnderExperiment);
    }

    private static List<Potato> findPotatoesForExperiment(List<Potato> potatoes) {
				/* Вычислите две самые большие и две самые маленькие картофелины,
           а затем выведите их в порядке от самых маленьких до самых больших.*/
        List <Potato> ps=new ArrayList<>();
        ArrayList<Potato> myList = new ArrayList<Potato>();
        myList.addAll(potatoes);

        Collections.sort(myList);
        Potato min1=myList.get(0);
        Potato min2=myList.get(1);
        Potato max1=myList.get(myList.size()-2);
        Potato max2=myList.get(myList.size()-1);
        List<Potato> l=new ArrayList<>();
        l.add(min1);
        l.add(min2);
        l.add(max1);
        l.add(max2);

        return l;
    }



}