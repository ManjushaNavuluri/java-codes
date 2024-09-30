package examplesPrograms;
public class PrimeNumbers {
	public static void main(String[] args) {
        String input1 = "WIPRO";
        String output1 = findPrimeAsciiChars(input1);
        System.out.println(output1); // Should print: IO:152

        String input2 = "Fia882010t";
        String output2 = findPrimeAsciiChars(input2);
        System.out.println(output2); // Should print: a0.176
    }

    public static String findPrimeAsciiChars(String input) {
        StringBuilder primeChars = new StringBuilder();
        int sum = 0;

        for (char c : input.toCharArray()) {
            int asciiValue = (int) c;
            if (isPrime(asciiValue)) {
                if (Character.isLetter(c)) {
                    primeChars.append(c);
                }
                sum += asciiValue;
            }
        }

        if (primeChars.length() == 0) {
            primeChars.append("0");
        }

        primeChars.append(".").append(sum);
        return primeChars.toString();
    }

    private static boolean isPrime(int num) {
        if (num <= 1) return false;
        if (num == 2) return true;
        if (num % 2 == 0) return false;

        for (int i = 3; i <= Math.sqrt(num); i += 2) {
            if (num % i == 0) return false;
        }
        return true;
    }

}