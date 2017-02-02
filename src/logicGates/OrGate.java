package logicGates;

/**
 * Created by Nova on 2/1/2017.
 */
public class OrGate extends Gate
{
    public OrGate() //no args constructor set to false for inputs
    {
        this(false,false);
    }

    public OrGate(boolean inputA, boolean inputB)
    {
        this.inputA = inputA;
        this.inputB = inputB;
        inputCount = 2;
    }

    @Override
    public void execute()
    {
        output = inputA | inputB;
    }

    @Override
    public void print() {

    }
}
