package java_two.sagid_irrkuev.hw4;

public class TestThread2 {
    static int SIZE = 1000000;
    static int HALF = SIZE / 2;
    float[] arr = new float[SIZE];

    public static void main(String[] args) throws InterruptedException {
        TestThread2 m = new TestThread2();
        m.method1();
        m.method2();
    }

    public void method1() {
        initArray();
        long a = System.currentTimeMillis();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (float) (arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
        }
        System.out.println(System.currentTimeMillis() - a);
        System.out.println(arr[999]);
    }

    private void initArray() {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = 1;
        }
    }

    public void method2() throws InterruptedException {
        initArray();
        long timeStart = System.currentTimeMillis();
        float[] arr2 = new float[HALF];
        float[] arr3 = new float[HALF];
        System.arraycopy(arr, 0, arr2, 0, HALF);
        System.arraycopy(arr, HALF, arr3, 0, HALF);
        Thread t1 = new Thread(() -> {
            System.out.println("1 start");
            for (int i = 0; i < arr2.length; i++) {
                arr2[i] = 1;
                long a = System.currentTimeMillis();
                arr2[i] = (float) (arr2[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
            }
            System.out.println("1 stop");
        });
        Thread t2 = new Thread(() -> {
            System.out.println("2 start");
            for (int i = 0; i < arr2.length; i++) {
                arr2[i] = 1;
                long a = System.currentTimeMillis();
                arr2[i] = (float) (arr2[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
            }
            System.out.println("2 stop");
        });
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.arraycopy(arr2, 0, arr, 0, HALF);
        System.arraycopy(arr3, 0, arr, HALF, HALF);
        System.out.println(System.currentTimeMillis() - timeStart);
        System.out.println(arr[999]);
    }

    void add() {};
}
