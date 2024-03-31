import java.util.Scanner;

public class rev_arr {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
		int N=sc.nextInt();
		int arr[]=new int[N];
		for(int i=0; i<N; i++){
			arr[i]=sc.nextInt();

		}
        int tmp=0;
        for(int i=0; i<arr.length/2;i++){
            tmp=arr[i];
            arr[i]=arr[arr.length-i-1];
            arr[arr.length-i-1]=tmp;


        }

        for(int j:arr){
            System.out.println(j);
            }
    }
}
