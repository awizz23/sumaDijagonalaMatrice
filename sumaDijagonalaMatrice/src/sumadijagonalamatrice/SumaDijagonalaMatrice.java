package sumadijagonalamatrice;

public class SumaDijagonalaMatrice {

    public static void main(String[] args) {
        int d[][] = {
            {1, 2, 6},
            {3, 9, 5},
            {5, 6, -4}
        };
        int k = 0, j = 0;
        int sum1 = 0, sum2 = 0;
        for (j = 0; j < d.length; j++) {
            for (k = 0; k < d.length; k++) {
                System.out.print(d[j][k] + " ");
            }
            System.out.println();
        }
        for (j = 0; j < d.length; j++) {
            sum1 = sum1 + d[j][j];
        }
        k = d.length - 1;
        for (j = 0; j < d.length; j++) {
            if (k >= 0) {
                sum2 = sum2 + d[j][k];
                k--;
            }
        }
        System.out.println("Suma prve dijagonale je :" + sum1 + ", a suma druge dijagonale je:  " + sum2);
    }
}
