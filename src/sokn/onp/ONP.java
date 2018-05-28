package sokn.onp;

import java.util.StringTokenizer;

public class ONP {
    private ONP() {
    }

    public static String getParseValue(final String inValue) throws StackEmptyException {
        final Stack stack = new Stack();
        final StringTokenizer valueTokens = new StringTokenizer(inValue, "+-*/() ", true);

        final StringBuilder outValue = new StringBuilder();

        while (valueTokens.hasMoreTokens()) {
            final String element = valueTokens.nextToken();

            switch (element) {
                case "+":
                case "-":
                case "/":
                case "*":
                    while (!stack.isEmpty() && getPrority(stack.top()) >= getPrority(element)) {
                        outValue.append(stack.pop()).append(" ");
                    }
                    stack.push(element);
                    break;
                case "(":
                    stack.push(element);
                    break;
                case ")":
                    while (!stack.top().equals("(")) {
                        outValue.append(stack.pop()).append(" ");
                    }
                    stack.pop();
                    break;
                case "=":
                    while (!stack.isEmpty()) {
                        outValue.append(stack.pop()).append(" ");
                    }

                    outValue.append("=");
                    break;
                default:
                    if (!element.equals(" "))
                        outValue.append(element).append(" ");
                    break;
            }
        }
        return outValue.toString();
    }

    private static int getPrority(String operator) {
        switch (operator) {
            case "+":
            case "-":
                return 1;

            case "*":
            case "/":
                return 2;

            default:
                return 0;
        }
    }
}
