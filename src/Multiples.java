public class Multiples {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 0; i < 1000; i++) {
            boolean MultipleOf5 = i % 5 == 0;
            boolean MultipleOf3 = i % 3 == 0;
            if (MultipleOf5 || MultipleOf3) {
                count++;
            }
        }
        System.out.println(count);
    }
}
