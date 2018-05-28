package sokn;

import org.junit.Before;
import org.junit.Test;
import sokn.onp.Stack;
import sokn.onp.StackEmptyException;

import static org.junit.Assert.*;

public class StackTest {

    private Stack stack;

    @Before
    public void setup() {
        stack = new Stack();
    }

    @Test
    public void isEmptyShouldReturnTrue() {
        assertTrue(stack.isEmpty());
    }

    @Test(expected = StackEmptyException.class)
    public void topEmpty_thenThrowException() throws StackEmptyException {
        stack.top();
    }

    @Test(expected = StackEmptyException.class)
    public void popEmpty_thenThrowException() throws StackEmptyException {
        stack.pop();
    }

    @Test
    public void topShouldReturnLastValue() throws StackEmptyException {
        final String value = "Default value";
        stack.push(value);

        assertEquals(value, stack.top());
        assertEquals(value, stack.top());
        assertEquals(value, stack.top());

        assertFalse(stack.isEmpty());
    }

    @Test(expected = StackEmptyException.class)
    public void popValueOnce_thenThrowExceptionOnSecondCall() throws StackEmptyException {
        final String value = "Pop test";

        stack.push(value);

        assertSame(value, stack.pop());
        assertTrue(stack.isEmpty());

        //throws an exception
        stack.pop();
    }

    @Test
    public void popAllElements() throws StackEmptyException {
        final String first = "First";
        final String second = "Second";
        final String third = "Third";
        final String fourth = "Fourth";

        stack.push(first);
        stack.push(second);
        stack.push(third);
        stack.push(fourth);

        assertSame(fourth, stack.pop());
        assertSame(third, stack.pop());
        assertSame(second, stack.pop());
        assertSame(first, stack.pop());
    }

    @Test
    public void shouldReturnNull() throws StackEmptyException {
        stack.push(null);

        assertNull(stack.pop());
    }

    @Test
    public void stackShouldWorkAfterExceptionThrown() throws StackEmptyException {
        try {
            stack.pop();
        } catch (StackEmptyException e) {
            System.out.println("Stack is empty");
        }

        final String value = "Does it still work ?";
        stack.push(value);
        assertSame(value, stack.pop());
    }
}

