package TCS_Prep;

import java.util.Scanner;

public class Point_distance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Point[] points = new Point[3];
        for (int i=0;i<3;i++){
            double x = sc.nextDouble();
            double y = sc.nextDouble();
            points[i] = new Point(x,y);
        }
        double max = 0;
        Point ans = points[0];
        for (Point p : points){
            double d = Math.sqrt((p.x*p.x)+(p.y*p.y));
            if(d>max){
                ans = p;
            }
        }
        System.out.println(ans.x);
        System.out.println(ans.y);

    }
}

class Point{
    double x;
    double y;
    public Point(double x, double y){
        this.x = x;
        this.y = y;
    }
}
