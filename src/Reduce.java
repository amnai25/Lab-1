public class Reduce {
    public static void main(String[] args) {
        int n = 100;
        int steps = 0;
        while (n > 0) {
            if (n % 2 == 0) {
                n = n / 2;
            }
            else {
                n = n -1;
            }
            steps ++; //we use this to count the amount of steps
            // it takes using this algorithm to get to 0 from 100.
            // So if we find out the number is odd or even and do
            // an operation on it, we continue until we get to 0.
        }
        System.out.println(steps);
    }
}
