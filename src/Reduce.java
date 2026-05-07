public class Reduce {
    static void main() {
        int n = 100;
        int numSteps = 0;
        while (n > 0){
            if (n % 2 == 0)
                n = n / 2;
            else
                n--;
            numSteps++;
        }
        System.out.println(numSteps);
    }
}
