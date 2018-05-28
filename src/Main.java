public class Main {
    public static void main(String [] args)
    {
        try
        {
            System.out.println(ONP.getParseValue("(4+2)*(3-1)="));
            System.out.println(ONP.getParseValue("(1+2)*3="));
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
    }
}
