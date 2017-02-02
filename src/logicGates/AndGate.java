package logicGates;

/**
 * Created by Nova on 2/1/2017.
 */
public class AndGate extends Gate
{
    public AndGate()
    {
        this(false,false);
    }

    public AndGate(boolean inputA, boolean inputB)
    {
        this.inputA = inputA;
        this.inputB = inputB;
        inputCount = 2;
    }


    @Override
    public void execute()
    {
        output = inputA &inputB;
    }

    @Override
    public void print()
    {

    }
}
