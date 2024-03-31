import java.util.Scanner;

public class waverow {
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
        int r=sc.nextInt();
        int c=sc.nextInt();
        int[][] arr=new int[r][c];
        for(int i=0; i<r; i++){
            for(int j=0; j<c; j++){
                arr[i][j]=sc.nextInt();
            }
        }
        
            int i=0;
            int j=0;
           
       while(i<r){
        if (i%2==0){
            for(j=0;j<c;j++){
                System.out.print(arr[i][j]+", ");
            }
        }
        else if(i%2!=0){
            for(j=c-1; j>-1;j--){
                System.out.print(arr[i][j]+", ");
            }

        }
        i++;

       }
       System.out.print("END");


        
    }
    
}
