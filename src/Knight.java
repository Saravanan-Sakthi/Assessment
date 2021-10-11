/*
public class Knight {
    private static int count=1,N=8;
    private static void print(int[][] arr){
        for(int i=0;i<8;i++){
            for(int j=0;j<8;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    private static boolean issafe(int[][] arr, int x, int y) {
        if(x<8 && x>=0 && y<8 && y>=0 && arr[x][y]==0){
            return true;
        }
        return false;
    }
    private static boolean solve(int[][] arr,int x,int y){
        if(count==N*N){
            return true;
        }
        if(issafe(arr,x,y)){
            int[] x_m={2,2,1,-1,-2,-2,-1,1};
            int[] y_m={-1,1,2,2,1,-1,-2,-2};
            for(int i=0;i<N;i++){
                System.out.println(x+x_m[i]+" "+y+y_m[i]);
                if(solve(arr,x+x_m[i],y+y_m[i])){
                    arr[x+x_m[i]][y+y_m[i]]=count++;
                    return true;
                }
                else{
                    arr[x+x_m[i]][y+y_m[i]]=0;
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[][] arr=new int[8][8];
        arr[0][0]=0;
        if(solve(arr,0,0)){
            print(arr);
        }
        else{
            System.out.println("Solution doesn't exist");
        }
    }
}
*/
