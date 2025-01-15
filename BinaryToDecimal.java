public class BinaryToDecimal {
    public static void main(String[] args) {
        String binaryStr = "1010";
        int decimalNum = Integer.parseInt(binaryStr, 2);  // Parse the binary string to a decimal
        System.out.println("Binary: " + binaryStr + " => Decimal: " + decimalNum);
    }
}
