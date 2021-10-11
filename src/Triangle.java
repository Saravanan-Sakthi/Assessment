import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        int result=0,upper=0,lower=0,N=3;
        int[][] arr=
        {
            {6, 5, 4},
            {1, 2, 5},
            {7, 9, 7}
        };
        for(int j=0;j<N;j++){
            result=result+arr[j][j];
        }
        for(int i=0;i<N;i++){
            for(int j=i+1;j<N;j++){
                upper=upper+arr[i][j];
                lower=lower+arr[j][i];
            }


        }
        upper=result+upper;
        lower=lower+result;
        System.out.println(upper+"+"+lower+"="+(upper+lower));
    }
}
