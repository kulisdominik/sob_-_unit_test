package sokn.onp;

import java.util.ArrayList;
import java.util.List;

public class Stack {
    private List<String> contener;
    private int size;

    public Stack() {
        contener = new ArrayList<>();
        size = 0;
    }

    public void push(String value) {
        contener.add(value);
        ++size;
    }

    public String top() throws StackEmptyException {
        if (!isEmpty())
            return contener.get(size - 1);

        throw new StackEmptyException("top() ");
    }

    public String pop() throws StackEmptyException {
        if (!isEmpty())
            return contener.remove(--size);

        throw new StackEmptyException("pop() ");
    }

    public void show() {
        System.out.println(this.toString());
    }

    public boolean isEmpty() {
        return size <= 0;
    }

    @Override
    public String toString() {
        return "Stack{" +
                "contener=" + contener +
                ", size=" + size +
                '}';
    }
}
