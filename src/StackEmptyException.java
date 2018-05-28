public class StackEmptyException extends  Exception{
    private static final long serialVersionUID = 1L;
    private String message;

    public StackEmptyException(String message)
    {
        System.out.println("Exception. Method: " + message);
    }

    @Override
    public String toString() {
        return message;
    }
}
