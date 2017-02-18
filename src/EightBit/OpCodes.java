package EightBit;

/**
 * Created by Nova on 2/18/2017.
 */
public enum OpCodes
{
    AND("000","a AND b"),
   OR("001", "a OR b"),
    XOR("010", "a XOR b" ),
    ADD("011", "a + b"),
    SUB("100", "a - b"),
    CLR("101","CLR"),
    SET("110","SET"),
    NEG("111","NEG");

    private String code, operation;

    OpCodes(String code, String operation)
    {
        this.operation = operation;
        this.code = code;
    }

    public String getCode()
    {
        return code;
    }

    public String getOperation() {
        return operation;
    }
}
