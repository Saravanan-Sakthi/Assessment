public class Square {

    public static void main(String[] args) {
        int[] arr={10,36,3,49,12};
        int[] temp=new int[arr.length];
        int i=0,index=0,min=Integer.MIN_VALUE;
        for(i=0;i<arr.length;i++){
            double b=Math.sqrt(arr[i]);
            int a=(int)b;
            if(a*a==arr[i]) {
                temp[i]=temp[i]+5;
            }
            if(arr[i]%4==0 && arr[i]%6==0){
                temp[i]=temp[i]+4;
            }
            if(arr[i]%2==0){
                temp[i]=temp[i]+3;
            }
        }
        for( i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                if(temp[j]>min){
                    min=temp[j];
                    index=j;

                }
            }
            min=Integer.MIN_VALUE;
            temp[index]=-1;
            System.out.println(arr[index]);
        }

    }
}
