import java.util.Scanner;

public class wavecol {
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
            int w=0;
       while(j<c){
        if (j%2==0){
            for(i=0;i<r;i++){
                System.out.print(arr[i][j]+",");
            }
        }
        else if(j%2!=0){
            for(i=r-1; i>-1;i--){
                System.out.print(arr[i][j]+",");
            }

        }
        j++;

       }
       System.out.print("END");



    }
}
