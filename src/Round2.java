public class Round2 {
    public static void main(String[] args) {
        String str="WELCOMETOZLHLCORPORATOON",str1="TOO";
        int n=(int)Math.sqrt(str.length())+1,count=0,k=0,c=0,prev=0,prev1=0;
        char[][] arr=new char[n][n];
        int[] row=new int[str1.length()];
        int[] col=new int[str1.length()];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(count<str.length()) {
                    arr[i][j] = str.charAt(count++);
                    if (str1.charAt(0) == str.charAt(count - 1)) {
                        row[k] = i;
                        col[k] = j;
                        k++;
                    }
                }
            }
        }
        count=0;
        int index=0;
       for(int i=0;i<k;i++){
           //down
           for(int j=0;j<str1.length();j++){
               if(row[i] + j < n) {
                   if (arr[row[i] + j][col[i]] == str1.charAt(index)) {
                       c++;
                       index++;
                   }
                   if (c == str1.length()) {
                       System.out.println("start" + " " + row[i] + " " + col[i]);
                       System.out.println("end  "+" "+(row[i]+str1.length()-1)+" "+col[i]);
                       count++;
                   }
               }
           }
           c=0;
           index=0;
           //right
           for(int j=0;j<str1.length();j++){
               if(col[i]+j < n){
                   if(arr[row[i]][col[i]+j]==str1.charAt(index)){
                       c++;
                       index++;
                   }
                   if(c == str1.length()){
                       System.out.println("start" + " " + row[i] + " " + col[i]);
                       System.out.println("end  "+" "+row[i]+" "+(col[i]+str1.length()-1));
                       count++;
                   }

               }
           }
           c=0;
           index=0;
           int inde=row[i],ind=col[i];
           prev=inde;prev1=ind;
           for(int j=0;j<str1.length();j++){
            if(arr[inde+1][ind]==str1.charAt(index)){
                c++;
                index++;
                inde=inde+1;
            }
            if(arr[inde][ind+1]==str1.charAt(index)){
                c++;
                index++;
                ind=ind+1;
            }
            if(c==str1.length()){
                System.out.println("start"+" "+inde+" "+ind);
            }
           }
       }
        System.out.println(inde+" "+);
        if(count==0){
            System.out.println("There is no element");
        }
    }
}
