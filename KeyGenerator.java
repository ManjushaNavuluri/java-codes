package examplesPrograms;

public class KeyGenerator {
    public static int findKey(int input1, int input2, int input3) {
        // Extract the thousands digit of input1
        int thousandsDigitInput1 = input1 / 1000;
        
        // Extract the hundreds digit of input2
        int hundredsDigitInput2 = (input2 / 100) % 10;
        
        // Find the smallest digit of input3
        int smallestDigitInput3 = 9;
        while (input3 > 0) {
            int digit = input3 % 10;
            if (digit < smallestDigitInput3) {
                smallestDigitInput3 = digit;
            }
            input3 /= 10;
        }
        
        // Calculate the Key
        int key = (thousandsDigitInput1 * hundredsDigitInput2) - smallestDigitInput3;
        
        return key;
    }
    
    public static void main(String[] args) {
        int input1 = 3521;
        int input2 = 2452;
        int input3 = 1352;
        
        int key = findKey(input1, input2, input3);
        System.out.println("Key: " + key);
    }
}
