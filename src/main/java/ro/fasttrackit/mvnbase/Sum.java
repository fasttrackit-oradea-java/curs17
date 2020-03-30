package ro.fasttrackit.mvnbase;

import static java.util.Arrays.copyOfRange;

public class Sum {
    public int sum(int n) {
        if (n < 0) throw new IllegalArgumentException("n should be positive!");
//        return n <= 1 ? n : sum(n - 1) + n;
        if (n <= 1) {
            return n;
        } else {
            return sum(n - 1) + n;
        }
    }

    public int factorial(int n) {
        if (n < 0) throw new IllegalArgumentException("n should be positive!");

        if (n <= 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }

    public int sumArray(int[] arr) {
        if (arr.length == 0) {
            return 0;
        } else if (arr.length == 1) {
            return arr[0];
        } else {
            int[] subArray = copyOfRange(arr, 0, arr.length - 1);
            return sumArray(subArray) + arr[arr.length - 1];
        }
    }

    public int sumArrayMiddle(final int[] arr) {
        if (arr.length == 0) {
            return 0;
        } else if (arr.length == 1) {
            return arr[0];
        } else {
            int[] left = copyOfRange(arr, 0, arr.length / 2);
            int[] right = copyOfRange(arr, arr.length / 2, arr.length);
            return sumArrayMiddle(left) + sumArrayMiddle(right);
        }
    }

    public int sumArrayStart(final int[] arr) {
        if (arr.length == 0) {
            return 0;
        } else if (arr.length == 1) {
            return arr[0];
        } else {
            return arr[0] + sumArrayStart(copyOfRange(arr, 1, arr.length));
        }
    }

    public int fib(int n) {
        if (n < 0) throw new IllegalArgumentException();
        if (n <= 1) {
            return n;
        } else {
            return fib(n - 1) + fib(n - 2);
        }
    }

    public String reverse(String s) {
        if (s == null) throw new IllegalArgumentException();
        if (s.length() <= 1) {
            return s;
        } else {
            return s.charAt(s.length() - 1) + reverse(s.substring(0, s.length() - 1));
        }
    }
}
