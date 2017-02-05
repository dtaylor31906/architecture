package logicGates;

public class Main {

    public static void main(String[] args)
    {
	    AndGate a1 = new AndGate();
	    OrGate o1 = new OrGate();
	    XorGate x1 = new XorGate();
	    NotGate n1 = new NotGate();
        HalfAdder h1 = new HalfAdder("half adder");
        FullAdder f1 = new FullAdder("full adder");
        FourBitALU ALU = new FourBitALU("4-bit ALU");
	   /* a1.test();
	    o1.test();
	    x1.test();
	    n1.test();
        h1.test();
        f1.test();*/
	   ALU.test();

    }
}
