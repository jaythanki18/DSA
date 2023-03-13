package lab_code;

import java.util.*;

public class P5 {
    public static void main(String[] args) {
        ArrayList<Integer> t = new ArrayList<>();
        int area = 0;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ar[] = new int[n];
        int j = 0;
        for (int i = 0; i < n; i++) {
            ar[i] = sc.nextInt();
        }
        Arrays.sort(ar);
        for (int i = 0; i < n - 1; i++) {
            if (ar[i] == ar[i + 1]) {
                t.add(ar[i]);
            }
        }
        if (t.size() > 1) {
            area = t.get(t.size() - 1) * t.get(t.size() - 2);
            System.out.println(area);
        } else {
            System.out.println("-1");
        }
    }
}
