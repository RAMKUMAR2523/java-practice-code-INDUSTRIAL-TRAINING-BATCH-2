import java.util.*;
public class Main{
    static double distance(int x1,int y1,int x2,int y2){
        return Math.sqrt(Math.pow(x2-x1,2)+ Math.pow(y2-y1,2));
        
    }
    public static void main(String[] args){
        int[][] points={
            {2,3},
            {7,8},
            {1,1},
        };
        int n=points.length;
        
        double mindist=Double.MAX_VALUE;
        int p1x=0,p1y=0,p2x=0,p2y=0;
        
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                double dist=distance(
                    points[i][0],points[i][1],
                    points[j][0],points[j][1]
                    );
                    
                    if(dist<mindist){
                        mindist=dist;
                        p1x=points[i][0];
                        p1y=points[i][1];
                        p2x=points[j][0];
                        p2y=points[j][1];
                    }
            }
        }
        System.out.println("closest pair:("+ p1x + ","+p1y +") and (" + p2x + ","+ p2y + ")");
        System.out.println("Minimum distance: "+ mindist);
    }
}