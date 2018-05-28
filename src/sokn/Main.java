package sokn;

import sokn.onp.ONP;
import sokn.onp.StackEmptyException;

public class Main {
    public static void main(String[] args) throws StackEmptyException {

        System.out.println(ONP.getParseValue("(4+2)*(3-1)="));
        System.out.println(ONP.getParseValue("2*(5+2)="));
        System.out.println(ONP.getParseValue("4/(3-1)^(2*3)="));
    }
}
