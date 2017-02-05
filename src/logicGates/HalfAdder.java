package logicGates;

/**
 * Created by Nova on 2/3/2017.
 */
public class HalfAdder
{
    private AndGate a1,a2;
    private OrGate o1;
    private NotGate n1;
    private String name;
    private Wire a,b,s,c;

    public  HalfAdder()
    {
        this("");
    }
    public HalfAdder(String name)
    {
        this.name = name;
        //wire up lthe or Gate
        o1.setWireA(a);
        o1.setWireB(b);
        o1.setWireOutput(new Wire());
        //wire up the first And gate
        a1.setWireA(a);
        a1.setWireB(b);
        a1.setWireOutput(c);
        //wire up the notGate
        n1.setWireA(c);
        n1.setWireOutput(new Wire());
        //wire up second and gate
        Wire a2InputA = o1.getWireOutput();
        Wire a2InputB = n1.getWireOutput();

        a2.setWireA(a2InputA);
        a2.setWireB(a2InputB);
        a2.setWireOutput(s);

    }
    public void Exec()
    {
        a1.execute();
        o1.execute();
        n1.execute();
        a2.execute();
    }
    public void setInputs(boolean inputA, boolean inputB)
    {

    }
    public void Print()
    {

    }

    public void Test()
    {

    }
}
