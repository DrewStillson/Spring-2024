public class GCD {
    public int findGCDForLoop(int num1, int num2) {
        int gcd = 0;
        for (int i = 1; i <= Math.min(num1, num2); i++) {
            if ((num1 % i == 0) && (num2 % i == 0)) {
                gcd = i;
            }
        }
        return gcd;
    }
    public int findGCDWhileLoop(int num1, int num2) {
        int smaller = Math.min(num1, num2);
        int larger = Math.max(num1, num2);
        while (!(larger == smaller)) {
            larger -= smaller;
            int temp = larger;
            larger = Math.max(larger, smaller);
            smaller = Math.min(temp, smaller);
        }
        return larger;
    }
    public int findGCDRecursively(int num1, int num2) {
        int smaller = Math.min(num1, num2);
        int larger = Math.max(num1, num2);
        int temp = smaller;
        smaller = larger % smaller;
        larger = temp;
        if (smaller == 0) {
            return larger;
        } else {
            return findGCDRecursively(larger, smaller);
        }
    }
    public int findNegativeGCD(int posNum, int negNum) {
        negNum = Math.abs(negNum);
        int gcd = 0;
        for (int i = 1; i <= Math.min(posNum, negNum); i++) {
            if ((posNum % i == 0) && (negNum % i == 0)) {
                gcd = i;
            }
        }
        return gcd;
    }
}
