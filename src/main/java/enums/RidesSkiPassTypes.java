package enums;

public enum RidesSkiPassTypes
{
    NONE(0), TEN_RIDES(10), TWENTY_RIDES(20), FIFTY_RIDES(50), HUNDRED_RIDES(100);

    private final int _value;

    RidesSkiPassTypes(int value)
    {
        this._value = value;
    }

    public int getValue()
    {
        return _value;
    }
}
