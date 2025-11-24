import java.util.*;
public class SecondLastDigit {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = Math.abs(sc.nextInt());
        System.out.println((n / 10) % 10);
    }
}
