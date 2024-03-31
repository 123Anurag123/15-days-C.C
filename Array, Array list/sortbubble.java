import java.util.Scanner;

public class sortbubble {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
		int N=sc.nextInt();
		int arr[]=new int[N];
		for(int i=0; i<N; i++){
			arr[i]=sc.nextInt();

		}
        int tmp=0;
        for(int j=0;j<arr.length;j++){
        for(int i=arr.length-1;i>=j+1;i--){
            
            if(arr[i]<arr[i-1]){
                tmp=arr[i];
                arr[i]=arr[i-1];
                arr[i-1]=tmp;
            }} }

            for(int k=0; k<arr.length;k++){
                System.out.println(arr[k]);
            }
    }
}
