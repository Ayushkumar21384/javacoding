import java.util.*;
public class loop  {
    public static void main(String args[]){
        // int i = 0;
        // while(i < 11){
        //     System.out.println(i);
        //     i = i ++;
        // int i = 0;
        // do { 
        //     System.out.println(i);
        //     i = i + 1;
        // } while (i<11);
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int sum = 0;
for(int i = 1; i<=n; i ++){
    sum = sum + i;
}
System.out.println(sum);
        }
    }
