package Chapter66;

import java.util.concurrent.TimeUnit;

/**
 * Created by eason on 16/11/21.
 */
public class StopThread {
    private static boolean stopRequested;

    public static void main(String[] args) throws InterruptedException{
        Thread backgroundThread = new Thread(new Runnable() {
            @Override
            public void run() {
                int i = 0;
                if (!stopRequested){
                    while (true)
                        i++;
                }
//                while (!stopRequested)
//                    i++;
            }
        });
        backgroundThread.start();
        TimeUnit.SECONDS.sleep(1);
        stopRequested = true;

    }


}
