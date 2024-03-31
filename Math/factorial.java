public class factorial {
 public static void main(String args[])
 {
 int a=4;
 int c=1;
 int b;
 for(int i=a; i>=1; i--){
b=i*c;
c=b;
}
 System.out.println(c);
}}