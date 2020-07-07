package club.banyuan;


/*
 * 计算数组元素的sin值之后，返回最大值。
 *
 * @param arr 目标数组
 * @return sin(数组元素)的最大值
 * @throws InterruptedException 不应该出现此异常
 */

/**
 * 线程计算数组元素的正弦值的和。
 */
class MaxThread extends Thread {

    private int lo, hi;
    private int[] arr;
    private double ans = 0;


    public MaxThread(int[] arr, int lo, int hi) {
        this.lo = lo;
        this.hi = hi;
        this.arr = arr;
    }

    @Override
    public void run() {
        double max=0;
        for (int i = lo; i < hi; i++) {
            ans = Math.sin(arr[i]);
            if (max<ans){
                max=ans;
            }
        }
        ans=max;
    }

    public double getAns() {
        return ans;
    }
}

public class MaxMultithreaded {

    /**
     * 对数组中所有元素的正弦值求和。
     * 将数组拆分成多组，分别使用多个线程分别计算得出结果后再加到一起
     *
     * @param arr 求和数组
     * @return 数组元素的和
     * @throws InterruptedException 应该不会出现此异常
     */

    public static double max(int[] arr, int numThreads) throws InterruptedException {
        int len = arr.length;
        double max = 0;

        // 创建并启动线程。
        club.banyuan.MaxThread[] ts = new club.banyuan.MaxThread[numThreads];
        for (int i = 0; i < numThreads; i++) {
            ts[i] = new club.banyuan.MaxThread(arr, (i * len) / numThreads, ((i + 1) * len / numThreads));
            ts[i].start();
        }

        // 等待线程完成并计算它们的结果。
        for (int i = 0; i < numThreads; i++) {
            ts[i].join();
            if (max < ts[i].getAns()) {
                max = ts[i].getAns();
            }
        }
        return max;
    }
}



