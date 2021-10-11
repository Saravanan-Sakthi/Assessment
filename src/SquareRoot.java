public class SquareRoot {
    private static double squareroot(double  num){
        double rem=1, quo=num,temp=1;
        while(true){
            quo=0.5*(rem+(num/rem));
            temp=Math.abs(rem-quo);
            if(temp<0.0000001)
                break;
            rem=quo;
        }
        return quo;
    }

    public static void main(String[] args) {
        System.out.println(squareroot(2));
    }
}
