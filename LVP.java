package examplesPrograms;
import java.util.Stack;
public class LVP {
	public static int longestValidParentheses(String s) {
	    int maxLen = 0;
	    Stack<Integer> stack = new Stack<>();
	    stack.push(-1); // Initialize stack with -1

	    for (int i = 0; i < s.length(); i++) {
	        if (s.charAt(i) == '(') {
	            stack.push(i);
	        } else {
	            stack.pop();
	            if (stack.isEmpty()) {
	                stack.push(i);
	            } else {
	                maxLen = Math.max(maxLen, i - stack.peek());
	            }
	        }
	    }
	    return maxLen;
	}
	public static void main(String[] args)
    {
        String str = "((()()";
        System.out.println(longestValidParentheses(str));
        str = "()(()))))";
        System.out.println(longestValidParentheses(str));
    }

}
