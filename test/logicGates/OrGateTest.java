package logicGates;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by Nova on 2/1/2017.
 */
@RunWith(value = Parameterized.class)
public class OrGateTest
{
    OrGate gate1;
    boolean expected;

    public OrGateTest(boolean inputA, boolean inputB,boolean expected)
    {
        gate1 = new OrGate(inputA,inputB);
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> data()
    {
        return Arrays.asList(new Object[][]
        {
                {false,false,false},
                {false, true,true},
                {true,false,true},
                {true,true,true}
        });
    }
    @BeforeEach
   /* void setUp()
    {
        gate1 = new OrGate(false,false);
        gate2 = new OrGate(false, true);
        gate3 = new OrGate(false, true);
        gate4 = new OrGate(true, true);
    }*/
    @Test
    void executeTest()
    {
        gate1.execute();
        assertEquals(expected, gate1.getOutput());
    }

}