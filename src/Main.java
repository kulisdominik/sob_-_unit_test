public class Main {
    public static void main(String [] args)
    {
        // Jakies inne przyklady trzeba dodac bo te sa kradzione :)
        {
            ONP onp = new ONP("(4+2)*     (3-1)=");
            System.out.println(onp.getParseValue());
        }
        {
            ONP onp = new ONP("(1+2)*3=");
            System.out.println(onp.getParseValue());
        }

    }
}
