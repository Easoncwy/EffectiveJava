package Chapter66;

import sun.jvm.hotspot.debugger.ThreadAccess;

import java.util.concurrent.TimeUnit;

/**
 * Created by eason on 16/11/21.
 */
public class SynchronizedStopThread {
    private static boolean stopRequested;

    private static synchronized void requestStop(){
        stopRequested = true;
    }
    private static synchronized boolean stopRequested(){
        return stopRequested;
    }

    public static void main(String[] args) throws InterruptedException{
        Thread backgroundThread = new Thread(new Runnable() {
            @Override
            public void run() {
                int i = 0;
                while (!stopRequested())
                    i++;
            }
        });
        backgroundThread.start();

        TimeUnit.SECONDS.sleep(1);
        requestStop();

    }


}
