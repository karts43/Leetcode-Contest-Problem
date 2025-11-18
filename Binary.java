class Binary {

    public static void main(String[] args) {

        int binaryNum = 1101;   // Binary number
        System.out.println("Binary Number: " + binaryNum);

        int base = 1;           // 2^0
        int decimal = 0;

        while (binaryNum != 0) {

            int lastDigit = binaryNum % 10;

            if (lastDigit == 1) {
                decimal += base;   // Add power of 2
            }

            base *= 2;            // Increase base (2^1, 2^2, ...)
            binaryNum /= 10;      // Remove last digit
        }

        System.out.println("Decimal Number: " + decimal);
    }
}
