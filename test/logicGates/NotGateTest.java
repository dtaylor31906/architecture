package logicGates;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by Nova on 2/1/2017.
 */
class NotGateTest
{
    NotGate gate1;
    @BeforeEach
    void setUp()
    {
        gate1 = new NotGate();
    }

    @Test
    void executeTest()
    {
        gate1.execute();
        assertEquals(true, gate1.getOutput());
        gate1.set(true);
        gate1.execute();
        assertEquals(false, gate1.getOutput());
    }

}