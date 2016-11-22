package Chapter47;

import java.util.Random;

/**
 * Created by eason on 16/11/17.
 */

public class Main47 {

    /**
     * @param args
     */
    private static final Random rnd = new Random();


    static int random(int n){
//		return Math.abs(rnd.nextInt()) % n;
        int r = rnd.nextInt(n);
        return r;
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int n = 2 * (Integer.MAX_VALUE / 3);
        int low = 0;
        for (int i = 0; i < 1000000; i++) {
            if (random(n) < n/2) {
                low++;
            }
        }
        System.out.println(low);

    }

}
