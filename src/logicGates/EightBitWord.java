package logicGates;

/**
 * Created by Nova on 2/7/2017.
 */
public class EightBitWord
{
    private boolean[] word; // least significant bit is index 0
    private String binaryRepresentation;
    private final int WORDLENGTH = 8;

    public EightBitWord(boolean[] word)
    {
        if(word.length != WORDLENGTH)
        {
            System.out.println("This is not  8-bits ");
            return;
        }
        this.word = word;

    }

    @Override
    public String toString()
    {
        String result = "";
        for (int i = 0; i  < 8; i++)
        {

        }
        return result;
    }
}
