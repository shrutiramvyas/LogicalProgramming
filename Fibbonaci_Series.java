public class Fibbonaci_Series {
        public static void main(String[] args) {

            int i = 1, n = 10, first = 0, second = 1;
            System.out.println("Fibonacci Series till " + n + " terms:");

            while (i <= n) {
                System.out.print(first + ", ");
                int next = first + second;
                first = second;
                second = next;
                i++;
           }
      }
}