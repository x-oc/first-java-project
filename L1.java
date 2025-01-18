import java.util.Random;
import static java.lang.Math.*;

public class L1 {
    public static void main(String[] args) {
        int CNT1 = 12, CNT2 = 16, L = -12, R = 11, X = 3;
        int[] c = new int[CNT1];
        for (int i = 0; i < CNT1; i++) {
            c[i] = i * 2 + 1;
        }
        Random r = new Random();
        float[] x = new float[CNT2];
        for (int i = 0; i < CNT2; i++) {
            x[i] = (float) (L + r.nextDouble() * (R - L));
        }
        float[][] s = new float[CNT1][CNT2];
        int[] TEMP = {1, 5, 11, 17, 21, 23};
        for (int i = 0; i < CNT1; i++) {
            for (int j = 0;j < CNT2; j++) {
                if (c[i] == X) {
                    s[i][j] = (float) cos(cos(sin(x[j])));
                }
                else if (findNumberInArray(TEMP, c[i])) {
                    s[i][j] = (float) log(pow(tan(asin(sin(x[j]))), 2));
                }
                else{
                    s[i][j] = (float) pow(pow(exp(1), pow(1 / 2. / (1 / 3. + tan(x[j])), 2)), 1 / 3.);
                }
            }
        }
        for (int i = 0; i < CNT1; i++) {
            for (int j = 0;j < CNT2; j++) {
                System.out.printf("%11.4e ", s[i][j]);     // jdb s[i][j]    33
            }
            System.out.println();
        }
    }

    public static boolean findNumberInArray(int[] array, int number) {
        for (int i : array) {
            if (i == number) {
                return true;
            }
        }
        return false;
    }
}
