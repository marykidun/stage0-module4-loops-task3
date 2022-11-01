package school.mjc.stage0.loops.task3;

public class FibonacciSeries {
    public static void printFibonacci(int lastFibonacci) {
        int n1 = 0;
        int n2 = 1;
        for (int i = 1; i <= lastFibonacci; i++) {
            System.out.println(n1 + "");
            int sum = n1 + n2;
            n1 = n2;
            n2 = sum;
        }
    }
    public static void main(String[] args) {
        printFibonacci(10);
    }
}
