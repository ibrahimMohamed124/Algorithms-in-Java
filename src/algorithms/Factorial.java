package algorithms;

public class Factorial {

    // Iterative version
    // Better performance and lower memory usage
    // Time Complexity: O(n)
    // Space Complexity: O(1)
    static long factorial(int a) throws Exception {
        if (a == 0) return 1;
        if (a < 0) throw new Exception();
        long res = 1;
        for (int i = 1; i <= a; i++) {
            res *= i;
        }
        return res;
    }

    // Recursive version
    // Slower due to recursive calls and higher memory usage
    // Time Complexity: O(n)
    // Space Complexity: O(n)
    static long recursiveFactorial(int a) throws Exception {
        if (a == 0) return 1;
        if (a < 0) throw new Exception();
        return a * recursiveFactorial(a - 1);
    }

    public static void main(String[] args) throws Exception {
        System.out.println(factorial(9)); // 9! = 362880
        System.out.println(recursiveFactorial(9)); // 9! = 362880
    }
}
