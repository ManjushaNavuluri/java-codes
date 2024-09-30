package examplesPrograms;

public class UserMainCode {
    public static void main(String[] args) {
        // Example inputs
        String input1 = "John";
        String input2 = "Johny";
        String input3 = "Janardhan";

        Result result = encodeThreeStrings(input1, input2, input3);
        System.out.println(result.output1);
        System.out.println(result.output2);
        System.out.println( result.output3);
    }

    public static Result encodeThreeStrings(String input1, String input2, String input3) {
        // Step 1: Split the input strings into parts
        String[] parts1 = splitString(input1);
        String[] parts2 = splitString(input2);
        String[] parts3 = splitString(input3);

        // Step 2: Concatenate the parts according to the rule
        String output1 = parts1[0] + parts2[2] + parts3[1];
        String output2 = parts1[1] + parts2[0] + parts3[2];
        String output3 = parts1[2] + parts2[1] + parts3[0];

        // Step 3: Toggle the case of Output3
        StringBuilder toggledOutput3 = new StringBuilder();
        for (char c : output3.toCharArray()) {
            if (Character.isUpperCase(c)) {
                toggledOutput3.append(Character.toLowerCase(c));
            } else {
                toggledOutput3.append(Character.toUpperCase(c));
            }
        }

        // Return the result
        return new Result(output1, output2, toggledOutput3.toString());
    }

    private static String[] splitString(String input) {
        int len = input.length();
        int frontLen = len / 3;
        int middleLen = len / 3;
        int endLen = len / 3;

        // Adjust the lengths based on the number of characters in the string
        if (len % 3 == 1) {
            middleLen++;
        } else if (len % 3 == 2) {
            frontLen++;
            endLen++;
        }

        // Split the string into parts
        String front = input.substring(0, frontLen);
        String middle = input.substring(frontLen, frontLen + middleLen);
        String end = input.substring(frontLen + middleLen, len);

        return new String[]{front, middle, end};
    }

    public static class Result {
        public final String output1;
        public final String output2;
        public final String output3;

        public Result(String out1, String out2, String out3) {
            output1 = out1;
            output2 = out2;
            output3 = out3;
        }
    }
}