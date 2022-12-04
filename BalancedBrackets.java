import java.util.*;

public class BalancedBrackets{

    public static void main(String[] args) {
    String stringone = "<<>>";
    String stringtwo = "<({})>";
    String stringthree = "<({)}>";

        System.out.println(balancedBrackets(stringone));
        System.out.println(balancedBrackets(stringtwo));
        System.out.println(balancedBrackets(stringthree));


        String stringfour = "(())";
        String stringfive = "(())))";

        System.out.println(balancedParentheses(stringfour));
        System.out.println(balancedParentheses(stringfive));
    }

    public static boolean balancedParentheses(String s){
        int numParentheses = 0;

        for (int i = 0; i < s.length(); i++){
            if (s.charAt(i) == '('){
                numParentheses++;
            } else if (s.charAt(i) == ')') {
                numParentheses--;
            }

            if (numParentheses  < 0){
                return false;
            }
        }
        return numParentheses == 0;
    }

    public static boolean balancedBrackets(String charString) {
        HashMap<Character, Character> charMap = new HashMap<Character, Character>();

        Stack<Character> charStack = new Stack<Character>();

        charMap.put('(', ')');
        charMap.put('{', '}');
        charMap.put('[', ']');
        charMap.put('<', '>');

        for (int i = 0; i < charString.length(); i++){
            if (charMap.containsValue(charString.charAt(i))){
                charStack.push(charString.charAt(i));
            }

            else if(charMap.containsKey(charString.charAt(i))) {
                if (charStack.isEmpty()){
                    return false;
                }

                Character mostRecent = charStack.pop();

                if (!mostRecent.equals(charMap.get(charString.charAt(i)))){
                    return false;
                }
            }
        }
        return charStack.isEmpty();
    }
}
