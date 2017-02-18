package EightBit;

import logicGates.Wire;
import logicGates.XorGate;

/**
 * Created by Nova on 2/18/2017.
 */
public class XorGateExtension
{
    private XorGate g0,g1,g2,g3,g4,g5,g6,g7;
    private Wire a0,a1,a2,a3,a4,a5,a6,a7;
    private Wire b0,b1,b2,b3,b4,b5,b6,b7;
    private Wire s0,s1,s2,s3,s4,s5,s6,s7;
    private EightBitWord wordA,wordB, wordOutput;

    public XorGateExtension()
    {
        g0 = new XorGate();
        g1 = new XorGate();
        g2 = new XorGate();
        g3 = new XorGate();
        g4 = new XorGate();
        g5 = new XorGate();
        g6 = new XorGate();
        g7 = new XorGate();

        a0 = new Wire();
        a1 = new Wire();
        a2 = new Wire();
        a3 = new Wire();
        a4 = new Wire();
        a5 = new Wire();
        a6 = new Wire();
        a7 = new Wire();

        b0 = new Wire();
        b1 = new Wire();
        b2 = new Wire();
        b3 = new Wire();
        b4 = new Wire();
        b5 = new Wire();
        b6 = new Wire();
        b7 = new Wire();

        s0 = new Wire();
        s1 = new Wire();
        s2 = new Wire();
        s3 = new Wire();
        s4 = new Wire();
        s5 = new Wire();
        s6 = new Wire();
        s7 = new Wire();

        wireItUp();
    }

    private void wireItUp()
    {
        g0.setWireA(a0);
        g0.setWireB(b0);
        g0.setWireOutput(s0);

        g1.setWireA(a1);
        g1.setWireB(b1);
        g1.setWireOutput(s1);

        g2.setWireA(a2);
        g2.setWireB(b2);
        g2.setWireOutput(s2);

        g3.setWireA(a3);
        g3.setWireB(b3);
        g3.setWireOutput(s3);

        g4.setWireA(a4);
        g4.setWireB(b4);
        g4.setWireOutput(s4);

        g5.setWireA(a5);
        g5.setWireB(b5);
        g5.setWireOutput(s5);

        g6.setWireA(a6);
        g6.setWireB(b6);
        g6.setWireOutput(s6);

        g7.setWireA(a7);
        g7.setWireB(b7);
        g7.setWireOutput(s7);
    }

    public void setInputs(EightBitWord wordA, EightBitWord wordB)
    {
        this.wordA = wordA;
        this.wordB = wordB;
    }

    //execute each individual gate then pull the word off the output wire
    public void execute()
    {
        enterWords();
        g0.execute();
        g1.execute();
        g2.execute();
        g3.execute();
        g4.execute();
        g5.execute();
        g6.execute();
        g7.execute();
        wordOutput = assembleOutput();

    }

    private void enterWords()
    {
        enterWordA();
        enterWordB();
    }

    private void enterWordB()
    {
        a0.setValue(wordA.getWord()[0]);
        a1.setValue(wordA.getWord()[1]);
        a2.setValue(wordA.getWord()[2]);
        a3.setValue(wordA.getWord()[3]);
        a4.setValue(wordA.getWord()[4]);
        a5.setValue(wordA.getWord()[5]);
        a6.setValue(wordA.getWord()[6]);
        a7.setValue(wordA.getWord()[7]);
    }

    private void enterWordA()
    {
        b0.setValue(wordB.getWord()[0]);
        b1.setValue(wordB.getWord()[1]);
        b2.setValue(wordB.getWord()[2]);
        b3.setValue(wordB.getWord()[3]);
        b4.setValue(wordB.getWord()[4]);
        b5.setValue(wordB.getWord()[5]);
        b6.setValue(wordB.getWord()[6]);
        b7.setValue(wordB.getWord()[7]);
    }


    private EightBitWord assembleOutput()
    {
        boolean[] result = new boolean[8];

        result[0] = s0.getValue();
        result[1] = s1.getValue();
        result[2] = s2.getValue();
        result[3] = s3.getValue();
        result[4] = s4.getValue();
        result[5] = s5.getValue();
        result[6] = s6.getValue();
        result[7] = s7.getValue();
        return new EightBitWord(result);
    }

    public EightBitWord getWordA() {
        return wordA;
    }

    public EightBitWord getWordB() {
        return wordB;
    }

    public EightBitWord getWordOutput() {
        return wordOutput;
    }
}
