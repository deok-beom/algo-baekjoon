package step3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _4_25304 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int totalReceiptPrice = Integer.parseInt(br.readLine());
        int totalCategoryCount = Integer.parseInt(br.readLine());

        int[] prices = new int[totalCategoryCount];
        int[] itemCounts = new int[totalCategoryCount];
        for (int i = 0; i < totalCategoryCount; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            prices[i] = Integer.parseInt(st.nextToken());
            itemCounts[i] = Integer.parseInt(st.nextToken());
        }

        int totalCost = 0;
        for (int i = 0; i < totalCategoryCount; i++) {
            totalCost += prices[i] * itemCounts[i];
        }

        if (totalReceiptPrice == totalCost) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

    }
}
