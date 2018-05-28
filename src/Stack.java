import java.util.ArrayList;
import java.util.List;

public class Stack {
    private List<String> _contener;
    private int _size;

    public Stack()
    {
        _contener = new ArrayList<>();
        _size = 0;
    }

    public void push(String value)
    {
        _contener.add(value);
        ++_size;
    }

    public String top()
    {
        return _contener.get(_size - 1);
    }

    public String pop()
    {
       return _contener.remove(--_size);
    }

    public void show()
    {
        System.out.println(this.toString());
    }

    public boolean isEmpty()
    {
        return _size > 0 ? false : true;
    }
    @Override
    public String toString() {
        return "Stack{" +
                "_contener=" + _contener +
                ", _size=" + _size +
                '}';
    }
}
