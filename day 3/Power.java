public class Power {
    public static double power(double base, int exponent) {
        if (exponent == 0) {
            return 1;
        }
        double result = 1;
        int absExponent = Math.abs(exponent);
        for (int i = 0; i < absExponent; i++) {
            result *= base;
        }
        return exponent > 0 ? result : 1 / result;
    }
}