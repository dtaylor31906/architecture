package logicGates;

/**
 * Created by Nova on 2/1/2017.
 */
public class XorGate extends Gate
{
    public XorGate()
    {
        this(false, false);
    }

    public XorGate(boolean inputA, boolean inputB)
    {
        this.inputA =inputA;
        this.inputB = inputB;
        inputCount = 2;
    }


    @Override
    public void execute()
    {
        output = inputA ^ inputB;
    }

    @Override
    public void print() {

    }
}
