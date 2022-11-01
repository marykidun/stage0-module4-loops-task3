package school.mjc.stage0.loops.task3;

public class NinesSum {
    public static void calculateSum(int lengthOfLastNumber) {
       int number = 1;
       int counter = 0;
       for (int i = 0; i <= lengthOfLastNumber; i++) {
          counter += (number * Math.pow(10, i));
          System.out.println(counter);

       }

    }
    public static void main(String[] args) {
        calculateSum(5);
    }
}
