import java.util.*;
public class CountUniqueDigits {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = Math.abs(sc.nextInt());

        int[] freq = new int[10];

        while(n > 0){
            int d = n % 10;
            freq[d]++;
            n /= 10;
        }

        int unique = 0;
        for(int f : freq){
            if(f == 1) unique++;
        }

        System.out.println(unique);
    }
}
