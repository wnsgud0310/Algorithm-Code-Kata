import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Set<Integer> set = new HashSet<>();

        for (int i = 0; i < 10; i++) {
            set.add(sc.nextInt() % 42);
        }

        System.out.println(set.size());
        sc.close();
    }
}
