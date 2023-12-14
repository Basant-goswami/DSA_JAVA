package greedy;

import java.util.Arrays;
import java.util.Collections;

public class chocola_problem {
    public static void main(String[] args) {
        int m = 4;
        int n = 6;
        Integer horiCost[] = {4,1,2};       // m-1
        Integer verCost[] = {2,1,3,1,4};   // n-1

        int v=0,h=0;        // for traversing horiCost and verCost array
        int hp=1,vp=1;      // for counting horizontal and vertical peaces count
        int minCost = 0;

        // sorting the horizontal & vertical arrays in descending order
        Arrays.sort(horiCost, Collections.reverseOrder());
        Arrays.sort(verCost, Collections.reverseOrder());

        while (h<horiCost.length && v<verCost.length){
            if(horiCost[h]<verCost[v]){
                minCost += verCost[v]*hp;
                vp++;
                v++;
            } else {
                minCost += horiCost[h]*vp;
                hp++;
                h++;
            }
        }
        // for remaining horizontal peaces
        while (h<horiCost.length){
            minCost += horiCost[h]*vp;
            hp++;
            h++;
        }
        // for remaining vertical peaces
        while (v<verCost.length){
            minCost += verCost[v]*hp;
            vp++;
            v++;
        }
        System.out.println("the minimum cost of cutting peaces is : " + minCost);

    }
}
