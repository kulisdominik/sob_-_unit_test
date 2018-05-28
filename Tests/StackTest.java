import org.junit.Before;
import org.junit.Test;

public class StackTest {

    @Test
    public void unusedStackTest()
    {
        Stack stack = new Stack();
        System.out.println(stack.isEmpty());
        try {
            stack.top();
        } catch (StackEmptyException e) {
        }
        try {
            stack.pop();
        } catch (StackEmptyException e) {
        }
    }

    @Test
    public void emptyStackTest()  {
        Stack stack = new Stack();
        String value = "Default value";
        stack.push(value);

        try{
            System.out.println(stack.top());
            System.out.println(stack.top());
            System.out.println(stack.top());
            System.out.println(stack.top());

            assert(stack.top() == value);
            assert(stack.top() == value);
            assert(stack.top() == value);
            assert(stack.top() == value);
        }
        catch (Exception e)
        {
        }

        System.out.println(stack.isEmpty());
    }

    @Test
    public void popTest()
    {

    }

}

