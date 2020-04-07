package java_two.sagid_irrkuev.hw4;

public class TestThread {
    static int SIZE = 1000000;
    static int HALF = SIZE / 2;
    float[] arr = new float[SIZE];

    public static void main(String[] args) {
        TestThread m = new TestThread();
        m.method1();
        m.method2();
        m.method2();
        m.method2();
    }
    public void method1() {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = 1;
        }
        for (int i = 0; i < arr.length; i++) {
            long a = System.currentTimeMillis();
            arr[i] = (float)(arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
            System.out.println(System.currentTimeMillis() - a);
        }
    }
    public void method2() {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = 1;
        }
        float[] arr2 = new float[HALF];
        float[] arr3 = new float[HALF];
        long timeStart = System.currentTimeMillis();
        System.arraycopy(arr, 0, arr2,0, HALF);
        System.arraycopy(arr, HALF, arr3,0,HALF);
        new java.lang.Thread(() -> {
            for (int i = 0; i < arr2.length; i++) {
                arr2[i] = 1;
                long a = System.currentTimeMillis();
                arr2[i] = (float)(arr2[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
                System.out.println(System.currentTimeMillis() - a);
            }
        }).start();
        new java.lang.Thread(() -> {
            for (int i = 0; i < arr3.length; i++) {
                arr3[i] = 1;
                long a = System.currentTimeMillis();
                arr3[i] = (float)(arr3[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
                System.out.println(System.currentTimeMillis() - a);
            }
        }).start();
        System.arraycopy(arr2, 0, arr, 0, HALF);
        System.arraycopy(arr3, 0, arr, HALF, HALF);
        System.out.println(System.currentTimeMillis() - timeStart);
    }
}