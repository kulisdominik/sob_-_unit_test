import java.util.StringTokenizer;

public class ONP
{
    public String _value;

    public ONP(String value)
    {
        _value = value;
    }

    public String getParseValue()
    {
        Stack stack = new Stack();
        StringTokenizer value_tokens = new StringTokenizer(_value, "+-*/() ", true);

        String out_value = "";
        while(value_tokens.hasMoreTokens())
        {
            String element = value_tokens.nextToken();

            if(     element.equals("+") || element.equals("-") ||
                    element.equals("/") || element.equals("*"))
            {
                while(!stack.isEmpty() && getPrority(stack.top()) >= getPrority(element))
                {
                    out_value += stack.pop() + " ";
                }
                stack.push(element);
            }
            else if(element.equals("("))
            {
                stack.push(element);
            }
            else if(element.equals(")"))
            {
                while(!stack.top().equals("("))
                {
                    out_value += stack.pop() + " ";
                }
                stack.pop();
            }
            else if(element.equals("="))
            {
                while(!stack.isEmpty())
                {
                    out_value += stack.pop() + " ";
                }

                out_value += "=";
            }
            else
            {
                if(!element.equals(" "))
                    out_value += element + " ";
            }
        }
        return out_value;
    }

    public static int getPrority(String operator)
    {
        switch(operator)
        {
            case "+":
            case "-":
            {
                return 1;
            }

            case "*":
            case "/":
            {
                return 2;
            }

            default:
            {
                return 0;
            }
        }
    }
}
