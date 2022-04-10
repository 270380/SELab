///Test_Branch_2
import java.util.*;

public class Dominoes2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt(), n, m, l;

        for (int i = 0; i < t; i++) {
            n = input.nextInt();
            m = input.nextInt();
            l = input.nextInt();
            HashSet<Integer> count = new HashSet<>();

            LinkedList<LinkedList<Integer>> X_Y = new LinkedList<>();
            for (int j = 0; j < n + 1; j++) X_Y.add(new LinkedList<>());
            for (int j = 0; j < m; j++) X_Y.get(input.nextInt()).add(input.nextInt());

            for (int j = 0; j < l; j++) {
                int z = input.nextInt();
                clear(z, X_Y, count);
            }
            System.out.println(count.size());

        }

    }

    static void clear (int z, LinkedList<LinkedList<Integer>> X_Y, HashSet<Integer> count) {
        while (!X_Y.get(z).isEmpty()) {
            int index = X_Y.get(z).remove();
            clear(index, X_Y, count);
        }
        count.add(z);
    }
}
