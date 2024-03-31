import java.util.Scanner;

public class searchinarray {
    public static void main(String[] args) {
        int a=0;
        Scanner sc=new Scanner(System.in);
        int len=sc.nextInt();
        int arr[]=new int[len];
        for(int i=0; i<len; i++){           
                arr[i]=sc.nextInt();
            
        }
        int key=sc.nextInt();
        for(int i=0; i<len; i++){           
            if(arr[i]==key){
                a=i;
                
                break;
            }
            else 
            a=-1;
        
    }
    System.out.println(a);

    }
    
}
//Celebrity question.

