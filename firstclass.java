import java.util.*;
public class firstclass{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();

        if(age>19) {
            System.out.println("adult");
        } else {
            System.out.println("not adult");
        }
    }
}
